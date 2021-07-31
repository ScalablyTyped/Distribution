package typings.refractor

import org.scalablytyped.runtime.Instantiable2
import typings.prismjs.mod.Environment
import typings.prismjs.mod.Grammar
import typings.prismjs.mod.HighlightCallback
import typings.prismjs.mod.Languages_
import typings.prismjs.mod.Token
import typings.prismjs.mod.TokenStream
import typings.prismjs.mod.hooks.HookCallback
import typings.prismjs.mod.hooks.RegisteredHooks
import typings.prismjs.mod.util.Identifier
import typings.refractor.refractorStrings.Array
import typings.refractor.refractorStrings.Function
import typings.refractor.refractorStrings.Number
import typings.refractor.refractorStrings.Undefined
import typings.refractor.refractorStrings.`after-highlight`
import typings.refractor.refractorStrings.`after-tokenize`
import typings.refractor.refractorStrings.`before-highlight`
import typings.refractor.refractorStrings.`before-highlightall`
import typings.refractor.refractorStrings.`before-insert`
import typings.refractor.refractorStrings.`before-sanity-check`
import typings.refractor.refractorStrings.`before-tokenize`
import typings.refractor.refractorStrings.complete
import typings.refractor.refractorStrings.wrap
import typings.std.Element
import typings.std.ParentNode
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined prismjs.prismjs.hooks.ElementEnvironment */
  trait ElementEnvironment extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] & String
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] & Element
    
    var grammar: js.UndefOr[Grammar] & Grammar
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] & String
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ElementEnvironment {
    
    @scala.inline
    def apply(
      code: js.UndefOr[String] & String,
      element: js.UndefOr[Element] & Element,
      grammar: js.UndefOr[Grammar] & Grammar,
      language: js.UndefOr[String] & String
    ): ElementEnvironment = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementEnvironment]
    }
    
    @scala.inline
    implicit class ElementEnvironmentMutableBuilder[Self <: ElementEnvironment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setCode(value: js.UndefOr[String] & String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setElement(value: js.UndefOr[Element] & Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrammar(value: js.UndefOr[Grammar] & Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      @scala.inline
      def setLanguage(value: js.UndefOr[String] & String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined prismjs.prismjs.hooks.ElementHighlightedEnvironment */
  trait ElementHighlightedEnviron extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] & String
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] & Element
    
    var grammar: js.UndefOr[Grammar] & Grammar
    
    var highlightedCode: js.UndefOr[String] & String
    
    var language: js.UndefOr[String] & String
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ElementHighlightedEnviron {
    
    @scala.inline
    def apply(
      code: js.UndefOr[String] & String,
      element: js.UndefOr[Element] & Element,
      grammar: js.UndefOr[Grammar] & Grammar,
      highlightedCode: js.UndefOr[String] & String,
      language: js.UndefOr[String] & String
    ): ElementHighlightedEnviron = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any], highlightedCode = highlightedCode.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementHighlightedEnviron]
    }
    
    @scala.inline
    implicit class ElementHighlightedEnvironMutableBuilder[Self <: ElementHighlightedEnviron] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setCode(value: js.UndefOr[String] & String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setElement(value: js.UndefOr[Element] & Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrammar(value: js.UndefOr[Grammar] & Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedCode(value: js.UndefOr[String] & String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: js.UndefOr[String] & String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    var selector: js.UndefOr[String] & String
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RequiredEnvironmentselect {
    
    @scala.inline
    def apply(selector: js.UndefOr[String] & String): RequiredEnvironmentselect = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredEnvironmentselect]
    }
    
    @scala.inline
    implicit class RequiredEnvironmentselectMutableBuilder[Self <: RequiredEnvironmentselect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setGrammar(value: Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      @scala.inline
      def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: js.UndefOr[String] & String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined prismjs.prismjs.hooks.RequiredEnvironment<'type' | 'content' | 'tag' | 'classes' | 'attributes' | 'language', prismjs.prismjs.Environment> */
  trait RequiredEnvironmenttypeco extends StObject {
    
    var attributes: (js.UndefOr[Record[String, String]]) & (Record[String, String])
    
    var classes: js.UndefOr[js.Array[String]] & js.Array[String]
    
    var code: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] & String
    
    var element: js.UndefOr[Element] = js.undefined
    
    var grammar: js.UndefOr[Grammar] = js.undefined
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] & String
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] & String
    
    var `type`: js.UndefOr[String] & String
  }
  object RequiredEnvironmenttypeco {
    
    @scala.inline
    def apply(
      attributes: (js.UndefOr[Record[String, String]]) & (Record[String, String]),
      classes: js.UndefOr[js.Array[String]] & js.Array[String],
      content: js.UndefOr[String] & String,
      language: js.UndefOr[String] & String,
      tag: js.UndefOr[String] & String,
      `type`: js.UndefOr[String] & String
    ): RequiredEnvironmenttypeco = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredEnvironmenttypeco]
    }
    
    @scala.inline
    implicit class RequiredEnvironmenttypecoMutableBuilder[Self <: RequiredEnvironmenttypeco] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: (js.UndefOr[Record[String, String]]) & (Record[String, String])): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClasses(value: js.UndefOr[js.Array[String]] & js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setContent(value: js.UndefOr[String] & String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setGrammar(value: Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      @scala.inline
      def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      @scala.inline
      def setLanguage(value: js.UndefOr[String] & String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setTag(value: js.UndefOr[String] & String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.UndefOr[String] & String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined prismjs.prismjs.hooks.TokenizeEnvironment */
  trait TokenizeEnvironment extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var code: js.UndefOr[String] & String
    
    var content: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[Element] = js.undefined
    
    var grammar: js.UndefOr[Grammar] & Grammar
    
    var highlightedCode: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] & String
    
    var parent: js.UndefOr[js.Array[String | Token]] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TokenizeEnvironment {
    
    @scala.inline
    def apply(
      code: js.UndefOr[String] & String,
      grammar: js.UndefOr[Grammar] & Grammar,
      language: js.UndefOr[String] & String
    ): TokenizeEnvironment = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeEnvironment]
    }
    
    @scala.inline
    implicit class TokenizeEnvironmentMutableBuilder[Self <: TokenizeEnvironment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setCode(value: js.UndefOr[String] & String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setGrammar(value: js.UndefOr[Grammar] & Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedCode(value: String): Self = StObject.set(x, "highlightedCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedCodeUndefined: Self = StObject.set(x, "highlightedCode", js.undefined)
      
      @scala.inline
      def setLanguage(value: js.UndefOr[String] & String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Array[String | Token]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setParentVarargs(value: (String | Token)*): Self = StObject.set(x, "parent", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TypeofPrism extends StObject {
    
    var Token: TypeofToken = js.native
    
    def highlight(text: String, grammar: Grammar, language: String): String = js.native
    
    def highlightAll(): Unit = js.native
    def highlightAll(async: Boolean): Unit = js.native
    def highlightAll(async: Boolean, callback: HighlightCallback): Unit = js.native
    def highlightAll(async: Unit, callback: HighlightCallback): Unit = js.native
    
    def highlightAllUnder(container: ParentNode): Unit = js.native
    def highlightAllUnder(container: ParentNode, async: Boolean): Unit = js.native
    def highlightAllUnder(container: ParentNode, async: Boolean, callback: HighlightCallback): Unit = js.native
    def highlightAllUnder(container: ParentNode, async: Unit, callback: HighlightCallback): Unit = js.native
    
    def highlightElement(element: Element): Unit = js.native
    def highlightElement(element: Element, async: Boolean): Unit = js.native
    def highlightElement(element: Element, async: Boolean, callback: HighlightCallback): Unit = js.native
    def highlightElement(element: Element, async: Unit, callback: HighlightCallback): Unit = js.native
    
    val hooks: Typeofhooks = js.native
    
    val languages: Languages_ = js.native
    
    val plugins: Record[String, js.Any] = js.native
    
    def tokenize(text: String, grammar: Grammar): js.Array[String | Token] = js.native
    
    val util: Typeofutil = js.native
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
      * @private
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
    def objId(obj: js.Any): Identifier = js.native
    
    def `type`(o: String): typings.refractor.refractorStrings.String = js.native
    def `type`(o: js.Any): String = js.native
    def `type`(o: js.Array[js.Any]): Array = js.native
    def `type`(o: js.Function): Function = js.native
    // tslint:disable:ban-types
    def `type`(o: Boolean): typings.refractor.refractorStrings.Boolean = js.native
    def `type`(o: Double): Number = js.native
    /** Determine the type of the object */
    def `type`(o: Null): typings.refractor.refractorStrings.Null = js.native
    def `type`(o: Unit): Undefined = js.native
    def `type`(o: typings.std.Number): Number = js.native
    // tslint:enable:ban-types
    def `type`(o: RegExp): typings.refractor.refractorStrings.RegExp = js.native
  }
}
