package typings.prismReactRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.prismReactRenderer.anon.ElementEnvironment
import typings.prismReactRenderer.anon.ElementHighlightedEnviron
import typings.prismReactRenderer.anon.Languages
import typings.prismReactRenderer.anon.RequiredEnvironmentselect
import typings.prismReactRenderer.anon.RequiredEnvironmenttypeco
import typings.prismReactRenderer.anon.TokenizeEnvironment
import typings.prismReactRenderer.anon.TypeofToken
import typings.prismReactRenderer.anon.Typeofhooks
import typings.prismReactRenderer.anon.Typeofutil
import typings.prismReactRenderer.prismReactRendererStrings.Array
import typings.prismReactRenderer.prismReactRendererStrings.Function
import typings.prismReactRenderer.prismReactRendererStrings.Number
import typings.prismReactRenderer.prismReactRendererStrings.RegExp
import typings.prismReactRenderer.prismReactRendererStrings.Undefined
import typings.prismReactRenderer.prismReactRendererStrings.`100`
import typings.prismReactRenderer.prismReactRendererStrings.`200`
import typings.prismReactRenderer.prismReactRendererStrings.`300`
import typings.prismReactRenderer.prismReactRendererStrings.`400`
import typings.prismReactRenderer.prismReactRendererStrings.`500`
import typings.prismReactRenderer.prismReactRendererStrings.`600`
import typings.prismReactRenderer.prismReactRendererStrings.`700`
import typings.prismReactRenderer.prismReactRendererStrings.`800`
import typings.prismReactRenderer.prismReactRendererStrings.`900`
import typings.prismReactRenderer.prismReactRendererStrings.`after-highlight`
import typings.prismReactRenderer.prismReactRendererStrings.`after-tokenize`
import typings.prismReactRenderer.prismReactRendererStrings.`before-highlight`
import typings.prismReactRenderer.prismReactRendererStrings.`before-highlightall`
import typings.prismReactRenderer.prismReactRendererStrings.`before-insert`
import typings.prismReactRenderer.prismReactRendererStrings.`before-sanity-check`
import typings.prismReactRenderer.prismReactRendererStrings.`before-tokenize`
import typings.prismReactRenderer.prismReactRendererStrings.`line-through`
import typings.prismReactRenderer.prismReactRendererStrings.`underline line-through`
import typings.prismReactRenderer.prismReactRendererStrings.bold
import typings.prismReactRenderer.prismReactRendererStrings.complete
import typings.prismReactRenderer.prismReactRendererStrings.italic
import typings.prismReactRenderer.prismReactRendererStrings.none
import typings.prismReactRenderer.prismReactRendererStrings.normal
import typings.prismReactRenderer.prismReactRendererStrings.underline
import typings.prismReactRenderer.prismReactRendererStrings.wrap
import typings.prismjs.mod.Environment
import typings.prismjs.mod.Grammar
import typings.prismjs.mod.HighlightCallback
import typings.prismjs.mod.Languages_
import typings.prismjs.mod.TokenStream
import typings.prismjs.mod.hooks.HookCallback
import typings.prismjs.mod.hooks.RegisteredHooks
import typings.prismjs.mod.util.Identifier
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponentElement
import typings.std.Element
import typings.std.ParentNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prism-react-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Prism React Renderer requires this specific instance
    * of Prism provided to ensure the languages are correctly loaded
    */
  inline def Highlight(props: HighlightProps): FunctionComponentElement[InternalHighlightProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("Highlight")(props.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[InternalHighlightProps]]
  
  object Prism {
    
    @JSImport("prism-react-renderer", "Prism")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("prism-react-renderer", "Prism.Token")
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
      
      @JSImport("prism-react-renderer", "Prism.Token")
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
    
    @JSImport("prism-react-renderer", "Prism.disableWorkerMessageHandler")
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
      
      @JSImport("prism-react-renderer", "Prism.hooks")
      @js.native
      val ^ : js.Any = js.native
      
      inline def add(name: String, callback: HookCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_afterhighlight(name: `after-highlight`, callback: js.Function1[/* env */ ElementHighlightedEnviron, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_aftertokenize(name: `after-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_beforehighlight(name: `before-highlight`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
      inline def add_beforehighlightall(name: `before-highlightall`, callback: js.Function1[/* env */ RequiredEnvironmentselect, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_beforeinsert(name: `before-insert`, callback: js.Function1[/* env */ ElementHighlightedEnviron, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_beforesanitycheck(name: `before-sanity-check`, callback: js.Function1[/* env */ ElementEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_beforetokenize(name: `before-tokenize`, callback: js.Function1[/* env */ TokenizeEnvironment, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_complete(name: complete, callback: js.Function1[/* env */ ElementHighlightedEnviron, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def add_wrap(name: wrap, callback: js.Function1[/* env */ RequiredEnvironmenttypeco, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("prism-react-renderer", "Prism.hooks.all")
      @js.native
      val all: RegisteredHooks = js.native
      
      inline def run(name: String, env: Environment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_afterhighlight(name: `after-highlight`, env: ElementHighlightedEnviron): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_aftertokenize(name: `after-tokenize`, env: TokenizeEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_beforehighlight(name: `before-highlight`, env: ElementEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Runs a hook invoking all registered callbacks with the given environment variables.
        *
        * Callbacks will be invoked synchronously and in the order in which they were registered.
        *
        * @param name The name of the hook.
        * @param env The environment variables of the hook passed to all callbacks registered.
        */
      inline def run_beforehighlightall(name: `before-highlightall`, env: RequiredEnvironmentselect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_beforeinsert(name: `before-insert`, env: ElementHighlightedEnviron): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_beforesanitycheck(name: `before-sanity-check`, env: ElementEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_beforetokenize(name: `before-tokenize`, env: TokenizeEnvironment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_complete(name: complete, env: ElementHighlightedEnviron): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run_wrap(name: wrap, env: RequiredEnvironmenttypeco): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSImport("prism-react-renderer", "Prism.languages")
    @js.native
    val languages: Languages_ = js.native
    
    @JSImport("prism-react-renderer", "Prism.manual")
    @js.native
    def manual: js.UndefOr[Boolean] = js.native
    inline def manual_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manual")(x.asInstanceOf[js.Any])
    
    @JSImport("prism-react-renderer", "Prism.plugins")
    @js.native
    val plugins: Record[String, Any] = js.native
    
    inline def tokenize(text: String, grammar: Grammar): js.Array[String | typings.prismjs.mod.Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | typings.prismjs.mod.Token]]
    
    object util {
      
      @JSImport("prism-react-renderer", "Prism.util")
      @js.native
      val ^ : js.Any = js.native
      
      /** Deep clone a language definition (e.g. to extend it) */
      inline def clone_[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any]).asInstanceOf[T]
      
      /** Encode raw strings in tokens in preparation to display as HTML */
      inline def encode(tokens: TokenStream): TokenStream = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(tokens.asInstanceOf[js.Any]).asInstanceOf[TokenStream]
      
      /** Get the unique id of this object or give it one if it does not have one */
      inline def objId(obj: Any): Identifier = ^.asInstanceOf[js.Dynamic].applyDynamic("objId")(obj.asInstanceOf[js.Any]).asInstanceOf[Identifier]
      
      inline def `type`(o: String): typings.prismReactRenderer.prismReactRendererStrings.String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismReactRenderer.prismReactRendererStrings.String]
      inline def `type`(o: js.Array[Any]): Array = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Array]
      inline def `type`(o: js.Function): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Function]
      // tslint:enable:ban-types
      inline def `type`(o: js.RegExp): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[RegExp]
      inline def `type`(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[String]
      // tslint:disable:ban-types
      inline def `type`(o: Boolean): typings.prismReactRenderer.prismReactRendererStrings.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismReactRenderer.prismReactRendererStrings.Boolean]
      inline def `type`(o: Double): Number = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Number]
      /** Determine the type of the object */
      inline def `type`(o: Null): typings.prismReactRenderer.prismReactRendererStrings.Null = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[typings.prismReactRenderer.prismReactRendererStrings.Null]
      inline def `type`(o: Unit): Undefined = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Undefined]
      inline def `type`(o: typings.std.Number): Number = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[Number]
    }
  }
  
  trait HighlightProps extends StObject {
    
    def children(props: RenderProps): typings.react.mod.global.JSX.Element
    
    var code: String
    
    var language: Language
    
    var prism: js.UndefOr[PrismLib] = js.undefined
    
    var theme: js.UndefOr[PrismTheme] = js.undefined
  }
  object HighlightProps {
    
    inline def apply(children: RenderProps => typings.react.mod.global.JSX.Element, code: String, language: Language): HighlightProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: RenderProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPrism(value: PrismLib): Self = StObject.set(x, "prism", value.asInstanceOf[js.Any])
      
      inline def setPrismUndefined: Self = StObject.set(x, "prism", js.undefined)
      
      inline def setTheme(value: PrismTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait InternalHighlightProps extends StObject {
    
    def children(props: RenderProps): typings.react.mod.global.JSX.Element
    
    var code: String
    
    var language: Language
    
    var prism: PrismLib
    
    var theme: PrismTheme
  }
  object InternalHighlightProps {
    
    inline def apply(
      children: RenderProps => typings.react.mod.global.JSX.Element,
      code: String,
      language: Language,
      prism: PrismLib,
      theme: PrismTheme
    ): InternalHighlightProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], prism = prism.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalHighlightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalHighlightProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: RenderProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPrism(value: PrismLib): Self = StObject.set(x, "prism", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: PrismTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type Language = String
  
  trait LineInputProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var line: js.Array[Token]
    
    var style: js.UndefOr[StyleObj] = js.undefined
  }
  object LineInputProps {
    
    inline def apply(line: js.Array[Token]): LineInputProps = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineInputProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLine(value: js.Array[Token]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineVarargs(value: Token*): Self = StObject.set(x, "line", js.Array(value*))
      
      inline def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait LineOutputProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var className: String
    
    var style: js.UndefOr[StyleObj] = js.undefined
  }
  object LineOutputProps {
    
    inline def apply(className: String): LineOutputProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineOutputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineOutputProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait PrismLib extends StObject {
    
    var Token: TypeofToken = js.native
    
    var disableWorkerMessageHandler: js.UndefOr[Boolean] = js.native
    
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
    
    var manual: js.UndefOr[Boolean] = js.native
    
    val plugins: Record[String, Any] = js.native
    
    def tokenize(text: String, grammar: Grammar): js.Array[String | typings.prismjs.mod.Token] = js.native
    
    val util: Typeofutil = js.native
  }
  
  trait PrismTheme extends StObject {
    
    var plain: PrismThemeEntry
    
    var styles: js.Array[Languages]
  }
  object PrismTheme {
    
    inline def apply(plain: PrismThemeEntry, styles: js.Array[Languages]): PrismTheme = {
      val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrismTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrismTheme] (val x: Self) extends AnyVal {
      
      inline def setPlain(value: PrismThemeEntry): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: js.Array[Languages]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: Languages*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
  
  trait PrismThemeEntry extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var backgroundImage: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[normal | italic] = js.undefined
    
    var fontWeight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
      ] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.undefined
    
    var textShadow: js.UndefOr[String] = js.undefined
  }
  object PrismThemeEntry {
    
    inline def apply(): PrismThemeEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrismThemeEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrismThemeEntry] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
      
      inline def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    }
  }
  
  trait RenderProps extends StObject {
    
    var className: String
    
    def getLineProps(input: LineInputProps): LineOutputProps
    
    def getTokenProps(input: TokenInputProps): TokenOutputProps
    
    var style: CSSProperties
    
    var tokens: js.Array[js.Array[Token]]
  }
  object RenderProps {
    
    inline def apply(
      className: String,
      getLineProps: LineInputProps => LineOutputProps,
      getTokenProps: TokenInputProps => TokenOutputProps,
      style: CSSProperties,
      tokens: js.Array[js.Array[Token]]
    ): RenderProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], getLineProps = js.Any.fromFunction1(getLineProps), getTokenProps = js.Any.fromFunction1(getTokenProps), style = style.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setGetLineProps(value: LineInputProps => LineOutputProps): Self = StObject.set(x, "getLineProps", js.Any.fromFunction1(value))
      
      inline def setGetTokenProps(value: TokenInputProps => TokenOutputProps): Self = StObject.set(x, "getTokenProps", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[js.Array[Token]]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: js.Array[Token]*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  type StyleObj = CSSProperties
  
  trait Token extends StObject {
    
    var content: String
    
    var empty: js.UndefOr[Boolean] = js.undefined
    
    var types: js.Array[String]
  }
  object Token {
    
    inline def apply(content: String, types: js.Array[String]): Token = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait TokenInputProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[StyleObj] = js.undefined
    
    var token: Token
  }
  object TokenInputProps {
    
    inline def apply(token: Token): TokenInputProps = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenInputProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenOutputProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: String
    
    var className: String
    
    var style: js.UndefOr[StyleObj] = js.undefined
  }
  object TokenOutputProps {
    
    inline def apply(children: String, className: String): TokenOutputProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenOutputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenOutputProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
