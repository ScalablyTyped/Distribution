package typings.reactNativeSvg

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativeSvg.anon.Ast
import typings.reactNativeSvg.anon.PropsWithChildren
import typings.reactNativeSvg.anon.Uri
import typings.reactNativeSvg.anon.Xml
import typings.reactNativeSvg.anon.`0`
import typings.reactNativeSvg.libTypescriptElementsSvgMod.SvgProps
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptXmlMod {
  
  @JSImport("react-native-svg/lib/typescript/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SvgAst(hasAstOverride: AstProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgAst")(hasAstOverride.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("react-native-svg/lib/typescript/xml", "SvgFromUri")
  @js.native
  open class SvgFromUri protected () extends Component[UriProps, UriState, Any] {
    def this(props: UriProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UriProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MSvgFromUri(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSvgFromUri(prevProps: Uri): Unit = js.native
    
    def fetch(): js.Promise[Unit] = js.native
    def fetch(uri: String): js.Promise[Unit] = js.native
    
    @JSName("state")
    var state_SvgFromUri: Xml = js.native
  }
  
  @JSImport("react-native-svg/lib/typescript/xml", "SvgFromXml")
  @js.native
  open class SvgFromXml protected () extends Component[XmlProps, XmlState, Any] {
    def this(props: XmlProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: XmlProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MSvgFromXml(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSvgFromXml(prevProps: `0`): Unit = js.native
    
    def parse(): Unit = js.native
    def parse(xml: String): Unit = js.native
    
    @JSName("state")
    var state_SvgFromXml: Ast = js.native
  }
  
  inline def SvgUri(props: UriProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgUri")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SvgXml(props: XmlProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgXml")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def astToReact(value: String, index: Double): Element | String = (^.asInstanceOf[js.Dynamic].applyDynamic("astToReact")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Element | String]
  inline def astToReact(value: AST, index: Double): Element | String = (^.asInstanceOf[js.Dynamic].applyDynamic("astToReact")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Element | String]
  
  inline def camelCase(phrase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(phrase.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def err(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def err(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def fetchText(uri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchText")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getStyle(string: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(string.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def parse(source: String): JsxAST | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[JsxAST | Null]
  inline def parse(source: String, middleware: Middleware): JsxAST | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[JsxAST | Null]
  
  trait AST extends StObject {
    
    var Tag: ComponentType[PropsWithChildren]
    
    var children: js.Array[AST | Element | String]
    
    var parent: AST | Null
    
    var priority: js.UndefOr[Map[String, js.UndefOr[Boolean]]] = js.undefined
    
    var props: StringDictionary[js.UndefOr[Styles | String]]
    
    var style: js.UndefOr[Styles] = js.undefined
    
    var styles: js.UndefOr[String] = js.undefined
    
    var tag: String
  }
  object AST {
    
    inline def apply(
      Tag: ComponentType[PropsWithChildren],
      children: js.Array[AST | Element | String],
      props: StringDictionary[js.UndefOr[Styles | String]],
      tag: String
    ): AST = {
      val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[AST]
    }
    
    extension [Self <: AST](x: Self) {
      
      inline def setChildren(value: js.Array[AST | Element | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (AST | Element | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setParent(value: AST): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPriority(value: Map[String, js.UndefOr[Boolean]]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProps(value: StringDictionary[js.UndefOr[Styles | String]]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTag(value: ComponentType[PropsWithChildren]): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdditionalProps extends StObject {
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `override`: js.UndefOr[js.Object] = js.undefined
  }
  object AdditionalProps {
    
    inline def apply(): AdditionalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalProps]
    }
    
    extension [Self <: AdditionalProps](x: Self) {
      
      inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOverride(value: js.Object): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  trait AstProps
    extends StObject
       with SvgProps
       with AdditionalProps {
    
    var ast: JsxAST | Null
  }
  object AstProps {
    
    inline def apply(): AstProps = {
      val __obj = js.Dynamic.literal(ast = null)
      __obj.asInstanceOf[AstProps]
    }
    
    extension [Self <: AstProps](x: Self) {
      
      inline def setAst(value: JsxAST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstNull: Self = StObject.set(x, "ast", null)
    }
  }
  
  trait JsxAST
    extends StObject
       with AST {
    
    @JSName("children")
    var children_JsxAST: js.Array[Element | String]
  }
  object JsxAST {
    
    inline def apply(
      Tag: ComponentType[PropsWithChildren],
      children: js.Array[Element | String],
      props: StringDictionary[js.UndefOr[Styles | String]],
      tag: String
    ): JsxAST = {
      val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[JsxAST]
    }
    
    extension [Self <: JsxAST](x: Self) {
      
      inline def setChildren(value: js.Array[Element | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Element | String)*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  type Middleware = js.Function1[/* ast */ XmlAST, XmlAST]
  
  type Styles = StringDictionary[String]
  
  trait UriProps
    extends StObject
       with SvgProps
       with AdditionalProps {
    
    var uri: String | Null
  }
  object UriProps {
    
    inline def apply(): UriProps = {
      val __obj = js.Dynamic.literal(uri = null)
      __obj.asInstanceOf[UriProps]
    }
    
    extension [Self <: UriProps](x: Self) {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriNull: Self = StObject.set(x, "uri", null)
    }
  }
  
  trait UriState extends StObject {
    
    var xml: String | Null
  }
  object UriState {
    
    inline def apply(): UriState = {
      val __obj = js.Dynamic.literal(xml = null)
      __obj.asInstanceOf[UriState]
    }
    
    extension [Self <: UriState](x: Self) {
      
      inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      inline def setXmlNull: Self = StObject.set(x, "xml", null)
    }
  }
  
  trait XmlAST
    extends StObject
       with AST {
    
    @JSName("children")
    var children_XmlAST: js.Array[XmlAST | String]
    
    @JSName("parent")
    var parent_XmlAST: XmlAST | Null
  }
  object XmlAST {
    
    inline def apply(
      Tag: ComponentType[PropsWithChildren],
      children: js.Array[XmlAST | String],
      props: StringDictionary[js.UndefOr[Styles | String]],
      tag: String
    ): XmlAST = {
      val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[XmlAST]
    }
    
    extension [Self <: XmlAST](x: Self) {
      
      inline def setChildren(value: js.Array[XmlAST | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (XmlAST | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setParent(value: XmlAST): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
    }
  }
  
  trait XmlProps
    extends StObject
       with SvgProps
       with AdditionalProps {
    
    var xml: String | Null
  }
  object XmlProps {
    
    inline def apply(): XmlProps = {
      val __obj = js.Dynamic.literal(xml = null)
      __obj.asInstanceOf[XmlProps]
    }
    
    extension [Self <: XmlProps](x: Self) {
      
      inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      inline def setXmlNull: Self = StObject.set(x, "xml", null)
    }
  }
  
  trait XmlState extends StObject {
    
    var ast: JsxAST | Null
  }
  object XmlState {
    
    inline def apply(): XmlState = {
      val __obj = js.Dynamic.literal(ast = null)
      __obj.asInstanceOf[XmlState]
    }
    
    extension [Self <: XmlState](x: Self) {
      
      inline def setAst(value: JsxAST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstNull: Self = StObject.set(x, "ast", null)
    }
  }
}
