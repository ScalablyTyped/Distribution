package typings.reactSyntaxHighlighter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLProps
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-syntax-highlighter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-syntax-highlighter", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactSyntaxHighlighter.distEsmDefaultHighlightMod.default
  /* static members */
  object default {
    
    @JSImport("react-syntax-highlighter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-syntax-highlighter", "default.supportedLanguages")
    @js.native
    def supportedLanguages: js.Array[String] = js.native
    inline def supportedLanguages_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedLanguages")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-syntax-highlighter", "Light")
  @js.native
  open class Light ()
    extends typings.reactSyntaxHighlighter.distEsmLightMod.default
  /* static members */
  object Light {
    
    @JSImport("react-syntax-highlighter", "Light")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("react-syntax-highlighter", "LightAsync")
  @js.native
  open class LightAsync ()
    extends typings.reactSyntaxHighlighter.distEsmLightAsyncMod.default
  /* static members */
  object LightAsync {
    
    @JSImport("react-syntax-highlighter", "LightAsync")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("react-syntax-highlighter", "Prism")
  @js.native
  open class Prism ()
    extends typings.reactSyntaxHighlighter.distEsmPrismMod.default
  /* static members */
  object Prism {
    
    @JSImport("react-syntax-highlighter", "Prism")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-syntax-highlighter", "Prism.supportedLanguages")
    @js.native
    def supportedLanguages: js.Array[String] = js.native
    inline def supportedLanguages_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedLanguages")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-syntax-highlighter", "PrismAsync")
  @js.native
  open class PrismAsync ()
    extends typings.reactSyntaxHighlighter.distEsmPrismAsyncMod.default
  
  @JSImport("react-syntax-highlighter", "PrismAsyncLight")
  @js.native
  open class PrismAsyncLight ()
    extends typings.reactSyntaxHighlighter.distEsmPrismAsyncLightMod.default
  /* static members */
  object PrismAsyncLight {
    
    @JSImport("react-syntax-highlighter", "PrismAsyncLight")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("react-syntax-highlighter", "PrismLight")
  @js.native
  open class PrismLight ()
    extends typings.reactSyntaxHighlighter.distEsmPrismLightMod.default
  /* static members */
  object PrismLight {
    
    @JSImport("react-syntax-highlighter", "PrismLight")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def createElement(props: createElementProps): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  
  trait SyntaxHighlighterProps
    extends StObject
       with /* spread */ StringDictionary[Any] {
    
    var CodeTag: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
      ] = js.undefined
    
    var PreTag: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
      ] = js.undefined
    
    var children: String | js.Array[String]
    
    var codeTagProps: js.UndefOr[HTMLProps[HTMLElement]] = js.undefined
    
    var customStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var lineNumberContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var lineNumberStyle: js.UndefOr[CSSProperties | lineNumberStyleFunction] = js.undefined
    
    var lineProps: js.UndefOr[lineTagPropsFunction | HTMLProps[HTMLElement]] = js.undefined
    
    var renderer: js.UndefOr[js.Function1[/* props */ rendererProps, ReactNode]] = js.undefined
    
    var showInlineLineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var showLineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var startingLineNumber: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StringDictionary[CSSProperties]] = js.undefined
    
    var useInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var wrapLines: js.UndefOr[Boolean] = js.undefined
    
    var wrapLongLines: js.UndefOr[Boolean] = js.undefined
  }
  object SyntaxHighlighterProps {
    
    inline def apply(children: String | js.Array[String]): SyntaxHighlighterProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxHighlighterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyntaxHighlighterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String | js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCodeTag(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
      ): Self = StObject.set(x, "CodeTag", value.asInstanceOf[js.Any])
      
      inline def setCodeTagProps(value: HTMLProps[HTMLElement]): Self = StObject.set(x, "codeTagProps", value.asInstanceOf[js.Any])
      
      inline def setCodeTagPropsUndefined: Self = StObject.set(x, "codeTagProps", js.undefined)
      
      inline def setCodeTagUndefined: Self = StObject.set(x, "CodeTag", js.undefined)
      
      inline def setCustomStyle(value: CSSProperties): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
      
      inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLineNumberContainerStyle(value: CSSProperties): Self = StObject.set(x, "lineNumberContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setLineNumberContainerStyleUndefined: Self = StObject.set(x, "lineNumberContainerStyle", js.undefined)
      
      inline def setLineNumberStyle(value: CSSProperties | lineNumberStyleFunction): Self = StObject.set(x, "lineNumberStyle", value.asInstanceOf[js.Any])
      
      inline def setLineNumberStyleFunction1(value: /* lineNumber */ Double => CSSProperties): Self = StObject.set(x, "lineNumberStyle", js.Any.fromFunction1(value))
      
      inline def setLineNumberStyleUndefined: Self = StObject.set(x, "lineNumberStyle", js.undefined)
      
      inline def setLineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", value.asInstanceOf[js.Any])
      
      inline def setLinePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", js.Any.fromFunction1(value))
      
      inline def setLinePropsUndefined: Self = StObject.set(x, "lineProps", js.undefined)
      
      inline def setPreTag(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typings.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
      ): Self = StObject.set(x, "PreTag", value.asInstanceOf[js.Any])
      
      inline def setPreTagUndefined: Self = StObject.set(x, "PreTag", js.undefined)
      
      inline def setRenderer(value: /* props */ rendererProps => ReactNode): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setShowInlineLineNumbers(value: Boolean): Self = StObject.set(x, "showInlineLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowInlineLineNumbersUndefined: Self = StObject.set(x, "showInlineLineNumbers", js.undefined)
      
      inline def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
      
      inline def setStartingLineNumber(value: Double): Self = StObject.set(x, "startingLineNumber", value.asInstanceOf[js.Any])
      
      inline def setStartingLineNumberUndefined: Self = StObject.set(x, "startingLineNumber", js.undefined)
      
      inline def setStyle(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setUseInlineStylesUndefined: Self = StObject.set(x, "useInlineStyles", js.undefined)
      
      inline def setWrapLines(value: Boolean): Self = StObject.set(x, "wrapLines", value.asInstanceOf[js.Any])
      
      inline def setWrapLinesUndefined: Self = StObject.set(x, "wrapLines", js.undefined)
      
      inline def setWrapLongLines(value: Boolean): Self = StObject.set(x, "wrapLongLines", value.asInstanceOf[js.Any])
      
      inline def setWrapLongLinesUndefined: Self = StObject.set(x, "wrapLongLines", js.undefined)
    }
  }
  
  trait createElementProps extends StObject {
    
    var key: Key
    
    var node: rendererNode
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var stylesheet: StringDictionary[CSSProperties]
    
    var useInlineStyles: Boolean
  }
  object createElementProps {
    
    inline def apply(
      key: Key,
      node: rendererNode,
      stylesheet: StringDictionary[CSSProperties],
      useInlineStyles: Boolean
    ): createElementProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], stylesheet = stylesheet.asInstanceOf[js.Any], useInlineStyles = useInlineStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[createElementProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: createElementProps] (val x: Self) extends AnyVal {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNode(value: rendererNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStylesheet(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      inline def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
    }
  }
}
