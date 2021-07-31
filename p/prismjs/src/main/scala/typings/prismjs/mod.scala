package typings.prismjs

import org.scalablytyped.runtime.StringDictionary
import typings.prismjs.prismjsStrings.Array
import typings.prismjs.prismjsStrings.Function
import typings.prismjs.prismjsStrings.Number
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
import typings.std.RegExp
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
  class Token protected () extends StObject {
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
      * @private
      */
    @scala.inline
    def stringify(token: TokenStream, language: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(token: TokenStream, language: String, parent: js.Array[String | Token]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any], language.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @scala.inline
  def highlight(text: String, grammar: Grammar, language: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def highlightAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")().asInstanceOf[Unit]
  @scala.inline
  def highlightAll(async: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")(async.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def highlightAll(async: Boolean, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")(async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def highlightAll(async: Unit, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAll")(async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def highlightAllUnder(container: ParentNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def highlightAllUnder(container: ParentNode, async: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def highlightAllUnder(container: ParentNode, async: Boolean, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def highlightAllUnder(container: ParentNode, async: Unit, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAllUnder")(container.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def highlightElement(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def highlightElement(element: Element, async: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def highlightElement(element: Element, async: Boolean, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def highlightElement(element: Element, async: Unit, callback: HighlightCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightElement")(element.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object hooks {
    
    @JSImport("prismjs", "hooks")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def add(name: String, callback: HookCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    @scala.inline
    def add(
      name: `before-highlightall`,
      callback: js.Function1[/* env */ RequiredEnvironment[selector, Environment], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def add(
      name: wrap,
      callback: js.Function1[
          /* env */ RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def add_afterhighlight(name: `after-highlight`, callback: js.Function1[/* env */ ElementHighlightedEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def add_aftertokenize(name: `after-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def add_beforehighlight(name: `before-highlight`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def add_beforeinsert(name: `before-insert`, callback: js.Function1[/* env */ ElementHighlightedEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def add_beforesanitycheck(name: `before-sanity-check`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def add_beforetokenize(name: `before-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def add_complete(name: complete, callback: js.Function1[/* env */ ElementHighlightedEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("prismjs", "hooks.all")
    @js.native
    val all: RegisteredHooks = js.native
    
    @scala.inline
    def run(name: String, env: Environment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Runs a hook invoking all registered callbacks with the given environment variables.
      *
      * Callbacks will be invoked synchronously and in the order in which they were registered.
      *
      * @param name The name of the hook.
      * @param env The environment variables of the hook passed to all callbacks registered.
      */
    @scala.inline
    def run(name: `before-highlightall`, env: RequiredEnvironment[selector, Environment]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def run(
      name: wrap,
      env: RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def run_afterhighlight(name: `after-highlight`, env: ElementHighlightedEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def run_aftertokenize(name: `after-tokenize`, env: TokenizeEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def run_beforehighlight(name: `before-highlight`, env: ElementEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def run_beforeinsert(name: `before-insert`, env: ElementHighlightedEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def run_beforesanitycheck(name: `before-sanity-check`, env: ElementEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def run_beforetokenize(name: `before-tokenize`, env: TokenizeEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def run_complete(name: complete, env: ElementHighlightedEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
      
      @scala.inline
      def apply(
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
      implicit class HookEnvironmentMapMutableBuilder[Self <: HookEnvironmentMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setAfter-highlight`(value: ElementHighlightedEnvironment): Self = StObject.set(x, "after-highlight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAfter-tokenize`(value: TokenizeEnvironment): Self = StObject.set(x, "after-tokenize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBefore-highlight`(value: ElementEnvironment): Self = StObject.set(x, "before-highlight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBefore-highlightall`(value: RequiredEnvironment[selector, Environment]): Self = StObject.set(x, "before-highlightall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBefore-insert`(value: ElementHighlightedEnvironment): Self = StObject.set(x, "before-insert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBefore-sanity-check`(value: ElementEnvironment): Self = StObject.set(x, "before-sanity-check", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBefore-tokenize`(value: TokenizeEnvironment): Self = StObject.set(x, "before-tokenize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComplete(value: ElementHighlightedEnvironment): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrap(value: RequiredEnvironment[`type` | content | tag | classes | attributes | language, Environment]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
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
  
  @JSImport("prismjs", "plugins")
  @js.native
  val plugins: Record[String, js.Any] = js.native
  
  @scala.inline
  def tokenize(text: String, grammar: Grammar): js.Array[String | Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Token]]
  
  object util {
    
    @JSImport("prismjs", "util")
    @js.native
    val ^ : js.Any = js.native
    
    /** Deep clone a language definition (e.g. to extend it) */
    @scala.inline
    def clone_[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** Encode raw strings in tokens in preparation to display as HTML */
    @scala.inline
    def encode(tokens: TokenStream): TokenStream = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(tokens.asInstanceOf[js.Any]).asInstanceOf[TokenStream]
    
    /** Get the unique id of this object or give it one if it does not have one */
    @scala.inline
    def objId(obj: js.Any): Identifier = ^.asInstanceOf[js.Dynamic].applyDynamic("objId")(obj.asInstanceOf[js.Any]).asInstanceOf[Identifier]
    
    @scala.inline
    def `type`(o: String): typings.prismjs.prismjsStrings.String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismjs.prismjsStrings.String]
    @scala.inline
    def `type`(o: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def `type`(o: js.Array[js.Any]): Array = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Array]
    @scala.inline
    def `type`(o: js.Function): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Function]
    // tslint:disable:ban-types
    @scala.inline
    def `type`(o: Boolean): typings.prismjs.prismjsStrings.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismjs.prismjsStrings.Boolean]
    @scala.inline
    def `type`(o: Double): Number = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Number]
    /** Determine the type of the object */
    @scala.inline
    def `type`(o: Null): typings.prismjs.prismjsStrings.Null = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismjs.prismjsStrings.Null]
    @scala.inline
    def `type`(o: Unit): Undefined = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Undefined]
    @scala.inline
    def `type`(o: typings.std.Number): Number = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Number]
    // tslint:enable:ban-types
    @scala.inline
    def `type`(o: RegExp): typings.prismjs.prismjsStrings.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismjs.prismjsStrings.RegExp]
    
    trait Identifier extends StObject {
      
      var value: Double
    }
    object Identifier {
      
      @scala.inline
      def apply(value: Double): Identifier = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Identifier]
      }
      
      @scala.inline
      implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): Environment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
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
  
  type Grammar = GrammarRest & (Record[String, GrammarValue])
  
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
    
    @scala.inline
    def apply(): GrammarRest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrammarRest]
    }
    
    @scala.inline
    implicit class GrammarRestMutableBuilder[Self <: GrammarRest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtrule(value: GrammarValue): Self = StObject.set(x, "atrule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtruleUndefined: Self = StObject.set(x, "atrule", js.undefined)
      
      @scala.inline
      def setAtruleVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "atrule", js.Array(value :_*))
      
      @scala.inline
      def setBoolean(value: GrammarValue): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setBooleanVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      @scala.inline
      def `setClass-name`(value: GrammarValue): Self = StObject.set(x, "class-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setClass-nameUndefined`: Self = StObject.set(x, "class-name", js.undefined)
      
      @scala.inline
      def `setClass-nameVarargs`(value: (RegExp | TokenObject)*): Self = StObject.set(x, "class-name", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: GrammarValue): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCommentVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "comment", js.Array(value :_*))
      
      @scala.inline
      def setFunction(value: GrammarValue): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setFunctionVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "function", js.Array(value :_*))
      
      @scala.inline
      def setImportant(value: GrammarValue): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      @scala.inline
      def setImportantVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "important", js.Array(value :_*))
      
      @scala.inline
      def setKeyword(value: GrammarValue): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      @scala.inline
      def setKeywordVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "keyword", js.Array(value :_*))
      
      @scala.inline
      def setNumber(value: GrammarValue): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setNumberVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "number", js.Array(value :_*))
      
      @scala.inline
      def setOperator(value: GrammarValue): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setOperatorVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "operator", js.Array(value :_*))
      
      @scala.inline
      def setProperty(value: GrammarValue): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setPropertyVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "property", js.Array(value :_*))
      
      @scala.inline
      def setPunctuation(value: GrammarValue): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPunctuationUndefined: Self = StObject.set(x, "punctuation", js.undefined)
      
      @scala.inline
      def setPunctuationVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "punctuation", js.Array(value :_*))
      
      @scala.inline
      def setRest(value: Grammar): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
      
      @scala.inline
      def setSelector(value: GrammarValue): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSelectorVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "selector", js.Array(value :_*))
      
      @scala.inline
      def setString(value: GrammarValue): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: GrammarValue): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: GrammarValue): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrlVarargs(value: (RegExp | TokenObject)*): Self = StObject.set(x, "url", js.Array(value :_*))
    }
  }
  
  type GrammarValue = RegExp | TokenObject | (js.Array[RegExp | TokenObject])
  
  type HighlightCallback = js.Function1[/* element */ Element, Unit]
  
  type LanguageMap = /**
    * Get a defined language's definition.
    */
  StringDictionary[Grammar]
  
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
    def extend(id: String, redef: Grammar): Grammar
    
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
    def insertBefore(inside: String, before: String, insert: Grammar, root: LanguageMap): Grammar
  }
  object LanguageMapProtocol {
    
    @scala.inline
    def apply(
      extend: (String, Grammar) => Grammar,
      insertBefore: (String, String, Grammar, LanguageMap) => Grammar
    ): LanguageMapProtocol = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction2(extend), insertBefore = js.Any.fromFunction4(insertBefore))
      __obj.asInstanceOf[LanguageMapProtocol]
    }
    
    @scala.inline
    implicit class LanguageMapProtocolMutableBuilder[Self <: LanguageMapProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: (String, Grammar) => Grammar): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertBefore(value: (String, String, Grammar, LanguageMap) => Grammar): Self = StObject.set(x, "insertBefore", js.Any.fromFunction4(value))
    }
  }
  
  trait Languages_
    extends StObject
       with LanguageMapProtocol
       with LanguageMap
  object Languages_ {
    
    @scala.inline
    def apply(
      extend: (String, Grammar) => Grammar,
      insertBefore: (String, String, Grammar, LanguageMap) => Grammar
    ): Languages_ = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction2(extend), insertBefore = js.Any.fromFunction4(insertBefore))
      __obj.asInstanceOf[Languages_]
    }
  }
  
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
    var pattern: RegExp
  }
  object TokenObject {
    
    @scala.inline
    def apply(pattern: RegExp): TokenObject = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenObject]
    }
    
    @scala.inline
    implicit class TokenObjectMutableBuilder[Self <: TokenObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      @scala.inline
      def setInside(value: Grammar): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
      
      @scala.inline
      def setLookbehind(value: Boolean): Self = StObject.set(x, "lookbehind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookbehindUndefined: Self = StObject.set(x, "lookbehind", js.undefined)
      
      @scala.inline
      def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type TokenStream = String | Token | (js.Array[String | Token])
}
