package typings.refractor

import typings.hast.mod.Properties
import typings.prismjs.mod.Languages_
import typings.refractor.anon.Aliases
import typings.refractor.refractorStrings.element
import typings.refractor.refractorStrings.root
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.NodeData
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMod {
  
  @JSImport("refractor/lib/core", "refractor")
  @js.native
  val refractor: Refractor_ = js.native
  
  type Element = typings.hast.mod.Element
  
  trait Env extends StObject {
    
    var attributes: Record[String, String]
    
    var classes: js.Array[String]
    
    var content: Text | RefractorElement | (js.Array[Text | RefractorElement])
    
    var language: String
    
    var tag: String
    
    var `type`: String
  }
  object Env {
    
    inline def apply(
      attributes: Record[String, String],
      classes: js.Array[String],
      content: Text | RefractorElement | (js.Array[Text | RefractorElement]),
      language: String,
      tag: String,
      `type`: String
    ): Env = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Env]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setContent(value: Text | RefractorElement | (js.Array[Text | RefractorElement])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: (Text | RefractorElement)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Grammar = typings.prismjs.mod.Grammar
  
  type Languages = Languages_
  
  /* Inlined std.Omit<refractor.refractor/lib/core.Element, 'children'> & {  children :std.Array<refractor.refractor/lib/core.RefractorElement | refractor.refractor/lib/core.Text>} */
  trait RefractorElement extends StObject {
    
    var children: js.Array[RefractorElement | Text]
    
    var content: js.UndefOr[typings.hast.mod.Root] = js.undefined
    
    var data: js.UndefOr[NodeData[Node[Data]]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var properties: js.UndefOr[Properties] = js.undefined
    
    var tagName: String
    
    var `type`: element
  }
  object RefractorElement {
    
    inline def apply(children: js.Array[RefractorElement | Text], tagName: String): RefractorElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[RefractorElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefractorElement] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[RefractorElement | Text]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (RefractorElement | Text)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContent(value: typings.hast.mod.Root): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setData(value: NodeData[Node[Data]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<refractor.refractor/lib/core.Root, 'children'> & {  children :std.Array<refractor.refractor/lib/core.RefractorElement | refractor.refractor/lib/core.Text>} */
  trait RefractorRoot extends StObject {
    
    var children: js.Array[RefractorElement | Text]
    
    var data: js.UndefOr[NodeData[Node[Data]]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: root
  }
  object RefractorRoot {
    
    inline def apply(children: js.Array[RefractorElement | Text]): RefractorRoot = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[RefractorRoot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefractorRoot] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[RefractorElement | Text]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (RefractorElement | Text)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: NodeData[Node[Data]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Refractor_ extends StObject {
    
    def alias(language: String): Unit
    def alias(language: String, alias: String): Unit
    def alias(language: String, alias: js.Array[String]): Unit
    def alias(language: Record[String, String | js.Array[String]]): Unit
    def alias(language: Record[String, String | js.Array[String]], alias: String): Unit
    def alias(language: Record[String, String | js.Array[String]], alias: js.Array[String]): Unit
    @JSName("alias")
    var alias_Original: js.Function2[
        /* language */ (Record[String, String | js.Array[String]]) | String, 
        /* alias */ js.UndefOr[String | js.Array[String]], 
        Unit
      ]
    
    def highlight(value: String, language: String): RefractorRoot
    def highlight(value: String, language: Grammar): RefractorRoot
    @JSName("highlight")
    var highlight_Original: js.Function2[/* value */ String, /* language */ String | Grammar, RefractorRoot]
    
    var languages: Languages
    
    def listLanguages(): js.Array[String]
    @JSName("listLanguages")
    var listLanguages_Original: js.Function0[js.Array[String]]
    
    def register(syntax: Syntax): Unit
    @JSName("register")
    var register_Original: js.Function1[/* syntax */ Syntax, Unit]
    
    def registered(aliasOrLanguage: String): Boolean
    @JSName("registered")
    var registered_Original: js.Function1[/* aliasOrLanguage */ String, Boolean]
  }
  object Refractor_ {
    
    inline def apply(
      alias: (/* language */ (Record[String, String | js.Array[String]]) | String, /* alias */ js.UndefOr[String | js.Array[String]]) => Unit,
      highlight: (/* value */ String, /* language */ String | Grammar) => RefractorRoot,
      languages: Languages,
      listLanguages: () => js.Array[String],
      register: /* syntax */ Syntax => Unit,
      registered: /* aliasOrLanguage */ String => Boolean
    ): Refractor_ = {
      val __obj = js.Dynamic.literal(alias = js.Any.fromFunction2(alias), highlight = js.Any.fromFunction2(highlight), languages = languages.asInstanceOf[js.Any], listLanguages = js.Any.fromFunction0(listLanguages), register = js.Any.fromFunction1(register), registered = js.Any.fromFunction1(registered))
      __obj.asInstanceOf[Refractor_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Refractor_] (val x: Self) extends AnyVal {
      
      inline def setAlias(
        value: (/* language */ (Record[String, String | js.Array[String]]) | String, /* alias */ js.UndefOr[String | js.Array[String]]) => Unit
      ): Self = StObject.set(x, "alias", js.Any.fromFunction2(value))
      
      inline def setHighlight(value: (/* value */ String, /* language */ String | Grammar) => RefractorRoot): Self = StObject.set(x, "highlight", js.Any.fromFunction2(value))
      
      inline def setLanguages(value: Languages): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setListLanguages(value: () => js.Array[String]): Self = StObject.set(x, "listLanguages", js.Any.fromFunction0(value))
      
      inline def setRegister(value: /* syntax */ Syntax => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setRegistered(value: /* aliasOrLanguage */ String => Boolean): Self = StObject.set(x, "registered", js.Any.fromFunction1(value))
    }
  }
  
  type Root = typings.hast.mod.Root
  
  type Syntax = (js.Function1[/* prism */ Any, Unit]) & Aliases
  
  type Text = typings.hast.mod.Text
  
  trait Token extends StObject {
    
    var alias: String
    
    var content: String
    
    var length: Double
    
    var `type`: String
  }
  object Token {
    
    inline def apply(alias: String, content: String, length: Double, `type`: String): Token = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
