package typings.prismReactRenderer

import org.scalablytyped.runtime.Instantiable2
import typings.prismReactRenderer.mod.Language
import typings.prismReactRenderer.mod.PrismThemeEntry
import typings.prismReactRenderer.prismReactRendererStrings.Array
import typings.prismReactRenderer.prismReactRendererStrings.Function
import typings.prismReactRenderer.prismReactRendererStrings.Number
import typings.prismReactRenderer.prismReactRendererStrings.RegExp
import typings.prismReactRenderer.prismReactRendererStrings.Undefined
import typings.prismReactRenderer.prismReactRendererStrings.`after-highlight`
import typings.prismReactRenderer.prismReactRendererStrings.`after-tokenize`
import typings.prismReactRenderer.prismReactRendererStrings.`before-highlight`
import typings.prismReactRenderer.prismReactRendererStrings.`before-highlightall`
import typings.prismReactRenderer.prismReactRendererStrings.`before-insert`
import typings.prismReactRenderer.prismReactRendererStrings.`before-sanity-check`
import typings.prismReactRenderer.prismReactRendererStrings.`before-tokenize`
import typings.prismReactRenderer.prismReactRendererStrings.complete
import typings.prismReactRenderer.prismReactRendererStrings.wrap
import typings.prismjs.mod.Environment
import typings.prismjs.mod.Grammar
import typings.prismjs.mod.Token
import typings.prismjs.mod.TokenStream
import typings.prismjs.mod.hooks.HookCallback
import typings.prismjs.mod.hooks.RegisteredHooks
import typings.prismjs.mod.util.Identifier
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined prismjs.prismjs.hooks.ElementEnvironment */
  trait ElementEnvironment extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] = js.undefined
    
    var grammar: js.UndefOr[Grammar] = js.undefined
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ElementEnvironment {
    
    inline def apply(): ElementEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementEnvironment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementEnvironment] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setGrammar(value: Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined prismjs.prismjs.hooks.ElementHighlightedEnvironment */
  trait ElementHighlightedEnviron extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] = js.undefined
    
    var grammar: js.UndefOr[Grammar] = js.undefined
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ElementHighlightedEnviron {
    
    inline def apply(): ElementHighlightedEnviron = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementHighlightedEnviron]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementHighlightedEnviron] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setGrammar(value: Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Languages extends StObject {
    
    var languages: js.UndefOr[js.Array[Language]] = js.undefined
    
    var style: PrismThemeEntry
    
    var types: js.Array[String]
  }
  object Languages {
    
    inline def apply(style: PrismThemeEntry, types: js.Array[String]): Languages = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Languages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Languages] (val x: Self) extends AnyVal {
      
      inline def setLanguages(value: js.Array[Language]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setStyle(value: PrismThemeEntry): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  /* Inlined prismjs.prismjs.hooks.RequiredEnvironment<'selector', prismjs.prismjs.Environment> */
  trait RequiredEnvironmentselect extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] = js.undefined
    
    var grammar: js.UndefOr[Grammar] = js.undefined
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RequiredEnvironmentselect {
    
    inline def apply(): RequiredEnvironmentselect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequiredEnvironmentselect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredEnvironmentselect] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setGrammar(value: Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined prismjs.prismjs.hooks.RequiredEnvironment<'type' | 'content' | 'tag' | 'classes' | 'attributes' | 'language', prismjs.prismjs.Environment> */
  trait RequiredEnvironmenttypeco extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] = js.undefined
    
    var grammar: js.UndefOr[Grammar] = js.undefined
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RequiredEnvironmenttypeco {
    
    inline def apply(): RequiredEnvironmenttypeco = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequiredEnvironmenttypeco]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredEnvironmenttypeco] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setGrammar(value: Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined prismjs.prismjs.hooks.TokenizeEnvironment */
  trait TokenizeEnvironment extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] = js.undefined
    
    var grammar: js.UndefOr[Grammar] = js.undefined
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TokenizeEnvironment {
    
    inline def apply(): TokenizeEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeEnvironment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizeEnvironment] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setGrammar(value: Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TypeofToken
    extends StObject
       with Instantiable2[/* type */ String, /* content */ TokenStream, Token] {
    
    /**
      * Converts the given token or token stream to an HTML representation.
      *
      * The following hooks will be run:
      * 1. `wrap`: On each {@link Prism.Token}.
      *
      * @param token The token or token stream to be converted.
      * @param language The name of current language.
      * @param [parent] The parent token stream, if any.
      * @return The HTML representation of the token or token stream.
      */
    def stringify(token: TokenStream, language: String): String = js.native
    def stringify(token: TokenStream, language: String, parent: js.Array[String | Token]): String = js.native
  }
  
  @js.native
  trait Typeofhooks extends StObject {
    
    def add(name: String, callback: HookCallback): Unit = js.native
    @JSName("add")
    def add_afterhighlight(name: `after-highlight`, callback: js.Function1[/* env */ ElementHighlightedEnviron, Unit]): Unit = js.native
    @JSName("add")
    def add_aftertokenize(name: `after-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = js.native
    @JSName("add")
    def add_beforehighlight(name: `before-highlight`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = js.native
    /**
      * Adds the given callback to the list of callbacks for the given hook.
      *
      * The callback will be invoked when the hook it is registered for is run.
      * Hooks are usually directly run by a highlight function but you can also run hooks yourself.
      *
      * One callback function can be registered to multiple hooks and the same hook multiple times.
      *
      * @param name The name of the hook.
      * @param callback The callback function which is given environment variables.
      */
    @JSName("add")
    def add_beforehighlightall(name: `before-highlightall`, callback: js.Function1[/* env */ RequiredEnvironmentselect, Unit]): Unit = js.native
    @JSName("add")
    def add_beforeinsert(name: `before-insert`, callback: js.Function1[/* env */ ElementHighlightedEnviron, Unit]): Unit = js.native
    @JSName("add")
    def add_beforesanitycheck(name: `before-sanity-check`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = js.native
    @JSName("add")
    def add_beforetokenize(name: `before-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = js.native
    @JSName("add")
    def add_complete(name: complete, callback: js.Function1[/* env */ ElementHighlightedEnviron, Unit]): Unit = js.native
    @JSName("add")
    def add_wrap(name: wrap, callback: js.Function1[/* env */ RequiredEnvironmenttypeco, Unit]): Unit = js.native
    
    val all: RegisteredHooks = js.native
    
    def run(name: String, env: Environment): Unit = js.native
    @JSName("run")
    def run_afterhighlight(name: `after-highlight`, env: ElementHighlightedEnviron): Unit = js.native
    @JSName("run")
    def run_aftertokenize(name: `after-tokenize`, env: TokenizeEnvironment): Unit = js.native
    @JSName("run")
    def run_beforehighlight(name: `before-highlight`, env: ElementEnvironment): Unit = js.native
    /**
      * Runs a hook invoking all registered callbacks with the given environment variables.
      *
      * Callbacks will be invoked synchronously and in the order in which they were registered.
      *
      * @param name The name of the hook.
      * @param env The environment variables of the hook passed to all callbacks registered.
      */
    @JSName("run")
    def run_beforehighlightall(name: `before-highlightall`, env: RequiredEnvironmentselect): Unit = js.native
    @JSName("run")
    def run_beforeinsert(name: `before-insert`, env: ElementHighlightedEnviron): Unit = js.native
    @JSName("run")
    def run_beforesanitycheck(name: `before-sanity-check`, env: ElementEnvironment): Unit = js.native
    @JSName("run")
    def run_beforetokenize(name: `before-tokenize`, env: TokenizeEnvironment): Unit = js.native
    @JSName("run")
    def run_complete(name: complete, env: ElementHighlightedEnviron): Unit = js.native
    @JSName("run")
    def run_wrap(name: wrap, env: RequiredEnvironmenttypeco): Unit = js.native
  }
  
  @js.native
  trait Typeofutil extends StObject {
    
    /** Deep clone a language definition (e.g. to extend it) */
    def clone[T](o: T): T = js.native
    
    /** Encode raw strings in tokens in preparation to display as HTML */
    def encode(tokens: TokenStream): TokenStream = js.native
    
    /** Get the unique id of this object or give it one if it does not have one */
    def objId(obj: Any): Identifier = js.native
    
    def `type`(o: String): typings.prismReactRenderer.prismReactRendererStrings.String = js.native
    def `type`(o: js.Array[Any]): Array = js.native
    def `type`(o: js.Function): Function = js.native
    // tslint:enable:ban-types
    def `type`(o: js.RegExp): RegExp = js.native
    def `type`(o: Any): String = js.native
    // tslint:disable:ban-types
    def `type`(o: Boolean): typings.prismReactRenderer.prismReactRendererStrings.Boolean = js.native
    def `type`(o: Double): Number = js.native
    /** Determine the type of the object */
    def `type`(o: Null): typings.prismReactRenderer.prismReactRendererStrings.Null = js.native
    def `type`(o: Unit): Undefined = js.native
    def `type`(o: typings.std.Number): Number = js.native
  }
}
