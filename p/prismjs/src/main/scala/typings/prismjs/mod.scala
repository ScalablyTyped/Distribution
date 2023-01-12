package typings.prismjs

import org.scalablytyped.runtime.StringDictionary
import typings.prismjs.prismjsStrings.Array
import typings.prismjs.prismjsStrings.Function
import typings.prismjs.prismjsStrings.Number
import typings.prismjs.prismjsStrings.RegExp
import typings.prismjs.prismjsStrings.Undefined
import typings.prismjs.prismjsStrings.`after-highlight`
import typings.prismjs.prismjsStrings.`after-tokenize`
import typings.prismjs.prismjsStrings.`before-highlight`
import typings.prismjs.prismjsStrings.`before-highlightall`
import typings.prismjs.prismjsStrings.`before-insert`
import typings.prismjs.prismjsStrings.`before-sanity-check`
import typings.prismjs.prismjsStrings.`before-tokenize`
import typings.prismjs.prismjsStrings.`type`
import typings.prismjs.prismjsStrings.attributes
import typings.prismjs.prismjsStrings.classes
import typings.prismjs.prismjsStrings.code
import typings.prismjs.prismjsStrings.complete
import typings.prismjs.prismjsStrings.content
import typings.prismjs.prismjsStrings.element
import typings.prismjs.prismjsStrings.grammar
import typings.prismjs.prismjsStrings.highlightedCode
import typings.prismjs.prismjsStrings.language
import typings.prismjs.prismjsStrings.parent
import typings.prismjs.prismjsStrings.selector
import typings.prismjs.prismjsStrings.tag
import typings.prismjs.prismjsStrings.wrap
import typings.std.Element
import typings.std.ParentNode
import typings.std.Pick
import typings.std.Record
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prismjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prismjs", "Token")
  @js.native
  open class Token protected () extends StObject {
    /**
      * Creates a new token.
      *
      * @param type See {@link Prism.Token#type type}
      * @param content See {@link Prism.Token#content content}
      * @param [alias] The alias(es) of the token.
      * @param [matchedStr=""] A copy of the full string this token was created from.
      * @param [greedy=false] See {@link Prism.Token#greedy greedy}
      */
    def this(`type`: String, content: TokenStream) = this()
    def this(`type`: String, content: TokenStream, alias: String) = this()
    def this(`type`: String, content: TokenStream, alias: js.Array[String]) = this()
    def this(`type`: String, content: TokenStream, alias: String, matchedStr: String) = this()
    def this(`type`: String, content: TokenStream, alias: js.Array[String], matchedStr: String) = this()
    def this(`type`: String, content: TokenStream, alias: Unit, matchedStr: String) = this()
    def this(`type`: String, content: TokenStream, alias: String, matchedStr: String, greedy: Boolean) = this()
    def this(`type`: String, content: TokenStream, alias: String, matchedStr: Unit, greedy: Boolean) = this()
    def this(`type`: String, content: TokenStream, alias: js.Array[String], matchedStr: String, greedy: Boolean) = this()
    def this(`type`: String, content: TokenStream, alias: js.Array[String], matchedStr: Unit, greedy: Boolean) = this()
    def this(`type`: String, content: TokenStream, alias: Unit, matchedStr: String, greedy: Boolean) = this()
    def this(`type`: String, content: TokenStream, alias: Unit, matchedStr: Unit, greedy: Boolean) = this()
    
    /**
      * The alias(es) of the token.
      *
      * @see TokenObject
      */
    var alias: String | js.Array[String] = js.native
    
    /**
      * The strings or tokens contained by this token.
      *
      * This will be a token stream if the pattern matched also defined an `inside` grammar.
      */
    var content: TokenStream = js.native
    
    /**
      * Whether the pattern that created this token is greedy or not.
      *
      * @see TokenObject
      */
    var greedy: Boolean = js.native
    
    /**
      * The length of the matched string or 0.
      */
    var length: Double = js.native
    
    /**
      * The type of the token.
      *
      * This is usually the key of a pattern in a {@link Grammar}.
      */
    var `type`: String = js.native
  }
  /* static members */
  object Token {
    
    @JSImport("prismjs", "Token")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def stringify(token: TokenStream, language: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(token: TokenStream, language: String, parent: js.Array[String | Token]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any], language.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("prismjs", "disableWorkerMessageHandler")
  @js.native
  def disableWorkerMessageHandler: js.UndefOr[Boolean] = js.native
  inline def disableWorkerMessageHandler_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWorkerMessageHandler")(x.asInstanceOf[js.Any])
  
  inline def highlight(text: String, grammar: Grammar, language: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def highlightAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")().asInstanceOf[Unit]
  inline def highlightAll(async: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")(async.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def highlightAll(async: Boolean, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")(async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightAll(async: Unit, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")(async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def highlightAllUnder(container: ParentNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def highlightAllUnder(container: ParentNode, async: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightAllUnder(container: ParentNode, async: Boolean, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightAllUnder(container: ParentNode, async: Unit, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def highlightElement(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def highlightElement(element: Element, async: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightElement(element: Element, async: Boolean, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightElement(element: Element, async: Unit, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object hooks {
    
    @JSImport("prismjs", "hooks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(name: String, callback: HookCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    inline def add(
      name: `before-highlightall`,
      callback: js.Function1[/* env */ RequiredEnvironment[selector, Environment], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def add(
      name: wrap,
      callback: js.Function1[
          /* env */ RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_afterhighlight(name: `after-highlight`, callback: js.Function1[/* env */ ElementHighlightedEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_aftertokenize(name: `after-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_beforehighlight(name: `before-highlight`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_beforeinsert(name: `before-insert`, callback: js.Function1[/* env */ ElementHighlightedEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_beforesanitycheck(name: `before-sanity-check`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_beforetokenize(name: `before-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_complete(name: complete, callback: js.Function1[/* env */ ElementHighlightedEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("prismjs", "hooks.all")
    @js.native
    val all: RegisteredHooks = js.native
    
    inline def run(name: String, env: Environment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Runs a hook invoking all registered callbacks with the given environment variables.
      *
      * Callbacks will be invoked synchronously and in the order in which they were registered.
      *
      * @param name The name of the hook.
      * @param env The environment variables of the hook passed to all callbacks registered.
      */
    inline def run(name: `before-highlightall`, env: RequiredEnvironment[selector, Environment]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def run(
      name: wrap,
      env: RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run_afterhighlight(name: `after-highlight`, env: ElementHighlightedEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run_aftertokenize(name: `after-tokenize`, env: TokenizeEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run_beforehighlight(name: `before-highlight`, env: ElementEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run_beforeinsert(name: `before-insert`, env: ElementHighlightedEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run_beforesanitycheck(name: `before-sanity-check`, env: ElementEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run_beforetokenize(name: `before-tokenize`, env: TokenizeEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run_complete(name: complete, env: ElementHighlightedEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    type ElementEnvironment = RequiredEnvironment[element | language | grammar | code, Environment]
    
    type ElementHighlightedEnvironment = RequiredEnvironment[highlightedCode, ElementEnvironment]
    
    /**
      * @param env The environment variables of the hook.
      */
    type HookCallback = js.Function1[/* env */ Environment, Unit]
    
    trait HookEnvironmentMap extends StObject {
      
      var `after-highlight`: ElementHighlightedEnvironment
      
      var `after-tokenize`: TokenizeEnvironment
      
      var `before-highlight`: ElementEnvironment
      
      var `before-highlightall`: RequiredEnvironment[selector, Environment]
      
      var `before-insert`: ElementHighlightedEnvironment
      
      var `before-sanity-check`: ElementEnvironment
      
      var `before-tokenize`: TokenizeEnvironment
      
      var complete: ElementHighlightedEnvironment
      
      var wrap: RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment]
    }
    object HookEnvironmentMap {
      
      inline def apply(
        `after-highlight`: ElementHighlightedEnvironment,
        `after-tokenize`: TokenizeEnvironment,
        `before-highlight`: ElementEnvironment,
        `before-highlightall`: RequiredEnvironment[selector, Environment],
        `before-insert`: ElementHighlightedEnvironment,
        `before-sanity-check`: ElementEnvironment,
        `before-tokenize`: TokenizeEnvironment,
        complete: ElementHighlightedEnvironment,
        wrap: RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment]
      ): HookEnvironmentMap = {
        val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
        __obj.updateDynamic("after-highlight")(`after-highlight`.asInstanceOf[js.Any])
        __obj.updateDynamic("after-tokenize")(`after-tokenize`.asInstanceOf[js.Any])
        __obj.updateDynamic("before-highlight")(`before-highlight`.asInstanceOf[js.Any])
        __obj.updateDynamic("before-highlightall")(`before-highlightall`.asInstanceOf[js.Any])
        __obj.updateDynamic("before-insert")(`before-insert`.asInstanceOf[js.Any])
        __obj.updateDynamic("before-sanity-check")(`before-sanity-check`.asInstanceOf[js.Any])
        __obj.updateDynamic("before-tokenize")(`before-tokenize`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HookEnvironmentMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HookEnvironmentMap] (val x: Self) extends AnyVal {
        
        inline def `setAfter-highlight`(value: ElementHighlightedEnvironment): Self = StObject.set(x, "after-highlight", value.asInstanceOf[js.Any])
        
        inline def `setAfter-tokenize`(value: TokenizeEnvironment): Self = StObject.set(x, "after-tokenize", value.asInstanceOf[js.Any])
        
        inline def `setBefore-highlight`(value: ElementEnvironment): Self = StObject.set(x, "before-highlight", value.asInstanceOf[js.Any])
        
        inline def `setBefore-highlightall`(value: RequiredEnvironment[selector, Environment]): Self = StObject.set(x, "before-highlightall", value.asInstanceOf[js.Any])
        
        inline def `setBefore-insert`(value: ElementHighlightedEnvironment): Self = StObject.set(x, "before-insert", value.asInstanceOf[js.Any])
        
        inline def `setBefore-sanity-check`(value: ElementEnvironment): Self = StObject.set(x, "before-sanity-check", value.asInstanceOf[js.Any])
        
        inline def `setBefore-tokenize`(value: TokenizeEnvironment): Self = StObject.set(x, "before-tokenize", value.asInstanceOf[js.Any])
        
        inline def setComplete(value: ElementHighlightedEnvironment): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        inline def setWrap(value: RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.prismjs.prismjsStrings.`before-highlightall`
      - typings.prismjs.prismjsStrings.`before-sanity-check`
      - typings.prismjs.prismjsStrings.`before-highlight`
      - typings.prismjs.prismjsStrings.`before-insert`
      - typings.prismjs.prismjsStrings.`after-highlight`
      - typings.prismjs.prismjsStrings.complete
      - typings.prismjs.prismjsStrings.`before-tokenize`
      - typings.prismjs.prismjsStrings.`after-tokenize`
      - typings.prismjs.prismjsStrings.wrap
    */
    trait HookTypes extends StObject
    
    type RegisteredHooks = StringDictionary[js.Array[HookCallback]]
    
    type RequiredEnvironment[T /* <: selector | element | language | grammar | code | highlightedCode | `type` | content | tag | classes | attributes | parent */, U /* <: Environment */] = U & (Required[Pick[U, T]])
    
    type TokenizeEnvironment = RequiredEnvironment[code | grammar | language, Environment]
  }
  
  @JSImport("prismjs", "languages")
  @js.native
  val languages: Languages_ = js.native
  
  @JSImport("prismjs", "manual")
  @js.native
  def manual: js.UndefOr[Boolean] = js.native
  inline def manual_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manual")(x.asInstanceOf[js.Any])
  
  @JSImport("prismjs", "plugins")
  @js.native
  val plugins: Record[String, Any] = js.native
  
  inline def tokenize(text: String, grammar: Grammar): js.Array[String | Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Token]]
  
  object util {
    
    @JSImport("prismjs", "util")
    @js.native
    val ^ : js.Any = js.native
    
    /** Deep clone a language definition (e.g. to extend it) */
    inline def clone_[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** Encode raw strings in tokens in preparation to display as HTML */
    inline def encode(tokens: TokenStream): TokenStream = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(tokens.asInstanceOf[js.Any]).asInstanceOf[TokenStream]
    
    /** Get the unique id of this object or give it one if it does not have one */
    inline def objId(obj: Any): Identifier = ^.asInstanceOf[js.Dynamic].applyDynamic("objId")(obj.asInstanceOf[js.Any]).asInstanceOf[Identifier]
    
    inline def `type`(o: String): typings.prismjs.prismjsStrings.String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismjs.prismjsStrings.String]
    inline def `type`(o: js.Array[Any]): Array = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Array]
    inline def `type`(o: js.Function): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Function]
    // tslint:enable:ban-types
    inline def `type`(o: js.RegExp): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[RegExp]
    inline def `type`(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[String]
    // tslint:disable:ban-types
    inline def `type`(o: Boolean): typings.prismjs.prismjsStrings.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismjs.prismjsStrings.Boolean]
    inline def `type`(o: Double): Number = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Number]
    /** Determine the type of the object */
    inline def `type`(o: Null): typings.prismjs.prismjsStrings.Null = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismjs.prismjsStrings.Null]
    inline def `type`(o: Unit): Undefined = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Undefined]
    inline def `type`(o: typings.std.Number): Number = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Number]
    
    trait Identifier extends StObject {
      
      var value: Double
    }
    object Identifier {
      
      inline def apply(value: Double): Identifier = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Identifier]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait Environment extends StObject {
    
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
  object Environment {
    
    inline def apply(): Environment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
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
  
  type Grammar = GrammarRest | (Record[String, GrammarValue])
  
  trait GrammarRest extends StObject {
    
    var atrule: js.UndefOr[GrammarValue] = js.undefined
    
    var boolean: js.UndefOr[GrammarValue] = js.undefined
    
    var `class-name`: js.UndefOr[GrammarValue] = js.undefined
    
    var comment: js.UndefOr[GrammarValue] = js.undefined
    
    var function: js.UndefOr[GrammarValue] = js.undefined
    
    var important: js.UndefOr[GrammarValue] = js.undefined
    
    var keyword: js.UndefOr[GrammarValue] = js.undefined
    
    var number: js.UndefOr[GrammarValue] = js.undefined
    
    var operator: js.UndefOr[GrammarValue] = js.undefined
    
    var property: js.UndefOr[GrammarValue] = js.undefined
    
    var punctuation: js.UndefOr[GrammarValue] = js.undefined
    
    /**
      * An optional grammar object that will appended to this grammar.
      */
    var rest: js.UndefOr[Grammar] = js.undefined
    
    var selector: js.UndefOr[GrammarValue] = js.undefined
    
    var string: js.UndefOr[GrammarValue] = js.undefined
    
    var style: js.UndefOr[GrammarValue] = js.undefined
    
    var url: js.UndefOr[GrammarValue] = js.undefined
  }
  object GrammarRest {
    
    inline def apply(): GrammarRest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrammarRest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrammarRest] (val x: Self) extends AnyVal {
      
      inline def setAtrule(value: GrammarValue): Self = StObject.set(x, "atrule", value.asInstanceOf[js.Any])
      
      inline def setAtruleUndefined: Self = StObject.set(x, "atrule", js.undefined)
      
      inline def setAtruleVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "atrule", js.Array(value*))
      
      inline def setBoolean(value: GrammarValue): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "boolean", js.Array(value*))
      
      inline def `setClass-name`(value: GrammarValue): Self = StObject.set(x, "class-name", value.asInstanceOf[js.Any])
      
      inline def `setClass-nameUndefined`: Self = StObject.set(x, "class-name", js.undefined)
      
      inline def `setClass-nameVarargs`(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "class-name", js.Array(value*))
      
      inline def setComment(value: GrammarValue): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCommentVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "comment", js.Array(value*))
      
      inline def setFunction(value: GrammarValue): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setFunctionVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "function", js.Array(value*))
      
      inline def setImportant(value: GrammarValue): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setImportantVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "important", js.Array(value*))
      
      inline def setKeyword(value: GrammarValue): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setKeywordVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "keyword", js.Array(value*))
      
      inline def setNumber(value: GrammarValue): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setNumberVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "number", js.Array(value*))
      
      inline def setOperator(value: GrammarValue): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setOperatorVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "operator", js.Array(value*))
      
      inline def setProperty(value: GrammarValue): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPropertyVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "property", js.Array(value*))
      
      inline def setPunctuation(value: GrammarValue): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
      
      inline def setPunctuationUndefined: Self = StObject.set(x, "punctuation", js.undefined)
      
      inline def setPunctuationVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "punctuation", js.Array(value*))
      
      inline def setRest(value: Grammar): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
      
      inline def setSelector(value: GrammarValue): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSelectorVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "selector", js.Array(value*))
      
      inline def setString(value: GrammarValue): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "string", js.Array(value*))
      
      inline def setStyle(value: GrammarValue): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setUrl(value: GrammarValue): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrlVarargs(value: (js.RegExp | TokenObject)*): Self = StObject.set(x, "url", js.Array(value*))
    }
  }
  
  type GrammarValue = js.RegExp | TokenObject | (js.Array[js.RegExp | TokenObject])
  
  type HighlightCallback = js.Function1[/* element */ Element, Unit]
  
  type LanguageMap = /**
    * Get a defined language's definition.
    */
  StringDictionary[Grammar]
  
  @js.native
  trait LanguageMapProtocol extends StObject {
    
    /**
      * Creates a deep copy of the language with the given id and appends the given tokens.
      *
      * If a token in `redef` also appears in the copied language, then the existing token in the copied language
      * will be overwritten at its original position.
      *
      * @param id The id of the language to extend. This has to be a key in `Prism.languages`.
      * @param redef The new tokens to append.
      * @returns The new language created.
      * @example
      * Prism.languages['css-with-colors'] = Prism.languages.extend('css', {
      *     'color': /\b(?:red|green|blue)\b/
      * });
      */
    def extend(id: String, redef: Grammar): Grammar = js.native
    
    /**
      * Inserts tokens _before_ another token in a language definition or any other grammar.
      *
      * As this needs to recreate the object (we cannot actually insert before keys in object literals),
      * we cannot just provide an object, we need an object and a key.
      *
      * If the grammar of `inside` and `insert` have tokens with the same name, the tokens in `inside` will be ignored.
      *
      * All references of the old object accessible from `Prism.languages` or `insert` will be replace with the new one.
      *
      * @param inside The property of `root` that contains the object to be modified.
      *
      * This is usually a language id.
      * @param before The key to insert before.
      * @param insert An object containing the key-value pairs to be inserted.
      * @param [root] The object containing `inside`, i.e. the object that contains the object that will be modified.
      *
      * Defaults to `Prism.languages`.
      * @returns The new grammar created.
      * @example
      * Prism.languages.insertBefore('markup', 'cdata', {
      *     'style': { ... }
      * });
      */
    def insertBefore(inside: String, before: String, insert: Grammar): Grammar = js.native
    def insertBefore(inside: String, before: String, insert: Grammar, root: LanguageMap): Grammar = js.native
  }
  
  @js.native
  trait Languages_
    extends StObject
       with LanguageMapProtocol
       with LanguageMap
  
  trait TokenObject extends StObject {
    
    /**
      * An optional alias or list of aliases.
      */
    var alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Whether the token is greedy.
      *
      * @default false
      */
    var greedy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The nested tokens of this token.
      *
      * This can be used for recursive language definitions.
      *
      * Note that this can cause infinite recursion.
      */
    var inside: js.UndefOr[Grammar] = js.undefined
    
    /**
      * If `true`, then the first capturing group of `pattern` will (effectively) behave as a lookbehind
      * group meaning that the captured text will not be part of the matched text of the new token.
      */
    var lookbehind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The regular expression of the token.
      */
    var pattern: js.RegExp
  }
  object TokenObject {
    
    inline def apply(pattern: js.RegExp): TokenObject = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenObject] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      inline def setInside(value: Grammar): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
      
      inline def setLookbehind(value: Boolean): Self = StObject.set(x, "lookbehind", value.asInstanceOf[js.Any])
      
      inline def setLookbehindUndefined: Self = StObject.set(x, "lookbehind", js.undefined)
      
      inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type TokenStream = String | Token | (js.Array[String | Token])
}
