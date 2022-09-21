package typings.prismjs

import typings.prismjs.mod.Environment
import typings.prismjs.mod.Grammar
import typings.prismjs.mod.HighlightCallback
import typings.prismjs.mod.Languages_
import typings.prismjs.mod.TokenStream
import typings.prismjs.mod.hooks.ElementEnvironment
import typings.prismjs.mod.hooks.ElementHighlightedEnvironment
import typings.prismjs.mod.hooks.HookCallback
import typings.prismjs.mod.hooks.RegisteredHooks
import typings.prismjs.mod.hooks.RequiredEnvironment
import typings.prismjs.mod.hooks.TokenizeEnvironment
import typings.prismjs.mod.util.Identifier
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
import typings.prismjs.prismjsStrings.complete
import typings.prismjs.prismjsStrings.content
import typings.prismjs.prismjsStrings.language
import typings.prismjs.prismjsStrings.selector
import typings.prismjs.prismjsStrings.tag
import typings.prismjs.prismjsStrings.wrap
import typings.std.Element
import typings.std.ParentNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Prism {
    
    @JSGlobal("Prism")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Prism.Token")
    @js.native
    open class Token protected ()
      extends typings.prismjs.mod.Token {
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
    }
    /* static members */
    object Token {
      
      @JSGlobal("Prism.Token")
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
      inline def stringify(token: TokenStream, language: String, parent: js.Array[String | typings.prismjs.mod.Token]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any], language.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    @JSGlobal("Prism.disableWorkerMessageHandler")
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
      
      @JSGlobal("Prism.hooks")
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
      
      @JSGlobal("Prism.hooks.all")
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
    }
    
    @JSGlobal("Prism.languages")
    @js.native
    val languages: Languages_ = js.native
    
    @JSGlobal("Prism.manual")
    @js.native
    def manual: js.UndefOr[Boolean] = js.native
    inline def manual_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manual")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Prism.plugins")
    @js.native
    val plugins: Record[String, Any] = js.native
    
    inline def tokenize(text: String, grammar: Grammar): js.Array[String | typings.prismjs.mod.Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | typings.prismjs.mod.Token]]
    
    object util {
      
      @JSGlobal("Prism.util")
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
    }
  }
}
