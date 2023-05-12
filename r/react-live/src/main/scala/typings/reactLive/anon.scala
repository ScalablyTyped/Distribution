package typings.reactLive

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.prismReactRenderer.anon.ElementEnvironment
import typings.prismReactRenderer.anon.ElementHighlightedEnviron
import typings.prismReactRenderer.anon.RequiredEnvironmentselect
import typings.prismReactRenderer.anon.RequiredEnvironmenttypeco
import typings.prismReactRenderer.anon.TokenizeEnvironment
import typings.prismjs.mod.Environment
import typings.prismjs.mod.Grammar
import typings.prismjs.mod.HighlightCallback
import typings.prismjs.mod.Languages_
import typings.prismjs.mod.Token
import typings.prismjs.mod.TokenStream
import typings.prismjs.mod.hooks.HookCallback
import typings.prismjs.mod.hooks.RegisteredHooks
import typings.prismjs.mod.util.Identifier
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.reactLive.reactLiveStrings.Array
import typings.reactLive.reactLiveStrings.Function
import typings.reactLive.reactLiveStrings.Number
import typings.reactLive.reactLiveStrings.RegExp
import typings.reactLive.reactLiveStrings.Undefined
import typings.reactLive.reactLiveStrings.`after-highlight`
import typings.reactLive.reactLiveStrings.`after-tokenize`
import typings.reactLive.reactLiveStrings.`before-highlight`
import typings.reactLive.reactLiveStrings.`before-highlightall`
import typings.reactLive.reactLiveStrings.`before-insert`
import typings.reactLive.reactLiveStrings.`before-sanity-check`
import typings.reactLive.reactLiveStrings.`before-tokenize`
import typings.reactLive.reactLiveStrings.complete
import typings.reactLive.reactLiveStrings.focus
import typings.reactLive.reactLiveStrings.indentation
import typings.reactLive.reactLiveStrings.wrap
import typings.std.ParentNode
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[T] extends StObject {
    
    def apply(props: T): Element = js.native
    
    var displayName: String = js.native
  }
  
  trait Component[T /* <: ElementType[Any] */] extends StObject {
    
    var Component: js.UndefOr[T] = js.undefined
  }
  object Component {
    
    inline def apply[T /* <: ElementType[Any] */](): Component[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Component[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Component[?], T /* <: ElementType[Any] */] (val x: Self & Component[T]) extends AnyVal {
      
      inline def setComponent(value: T): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    }
  }
  
  @js.native
  trait ComponentDidCatch extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Object, /* nextContext */ Any, Unit]] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ Any, Unit]
      ] = js.native
    
    def componentDidCatch(error: js.Error): Unit = js.native
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ js.Object, 
          /* prevState */ js.Object, 
          /* snapshot */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Object, /* nextContext */ Any, Unit]] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ Any, Unit]
      ] = js.native
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ js.Object, /* prevState */ js.Object, Any]] = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element | Null = js.native
    
    def setState[K /* <: scala.Nothing */](): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K])): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K]), callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ js.Object, 
          js.Object | (Pick[js.Object, K]) | Null
        ]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ js.Object, 
          js.Object | (Pick[js.Object, K]) | Null
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ Any, Boolean]
      ] = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* props */ js.Object, ComponentDidCatch]
       with Instantiable2[/* props */ js.Object, /* context */ Any, ComponentDidCatch] {
    
    var contextType: js.UndefOr[Context[Any]] = js.native
  }
  
  /* Inlined std.Partial<react-live.react-live.Props$3> */
  trait PartialProps3 extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var prism: js.UndefOr[TypeofPrism] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabMode: js.UndefOr[focus | indentation] = js.undefined
    
    var theme: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof themes.nightOwl */ Any
      ] = js.undefined
  }
  object PartialProps3 {
    
    inline def apply(): PartialProps3 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialProps3]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialProps3] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrism(value: TypeofPrism): Self = StObject.set(x, "prism", value.asInstanceOf[js.Any])
      
      inline def setPrismUndefined: Self = StObject.set(x, "prism", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabMode(value: focus | indentation): Self = StObject.set(x, "tabMode", value.asInstanceOf[js.Any])
      
      inline def setTabModeUndefined: Self = StObject.set(x, "tabMode", js.undefined)
      
      inline def setTheme(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof themes.nightOwl */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react-live.react-live.Props$3, 'tabMode'> */
  trait PickProps3tabMode extends StObject {
    
    var tabMode: js.UndefOr[focus | indentation] = js.undefined
  }
  object PickProps3tabMode {
    
    inline def apply(): PickProps3tabMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickProps3tabMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickProps3tabMode] (val x: Self) extends AnyVal {
      
      inline def setTabMode(value: focus | indentation): Self = StObject.set(x, "tabMode", value.asInstanceOf[js.Any])
      
      inline def setTabModeUndefined: Self = StObject.set(x, "tabMode", js.undefined)
    }
  }
  
  @js.native
  trait TypeofPrism extends StObject {
    
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
    
    def highlightElement(element: typings.std.Element): Unit = js.native
    def highlightElement(element: typings.std.Element, async: Boolean): Unit = js.native
    def highlightElement(element: typings.std.Element, async: Boolean, callback: HighlightCallback): Unit = js.native
    def highlightElement(element: typings.std.Element, async: Unit, callback: HighlightCallback): Unit = js.native
    
    val hooks: Typeofhooks = js.native
    
    val languages: Languages_ = js.native
    
    var manual: js.UndefOr[Boolean] = js.native
    
    val plugins: Record[String, Any] = js.native
    
    def tokenize(text: String, grammar: Grammar): js.Array[String | Token] = js.native
    
    val util: Typeofutil = js.native
  }
  
  @js.native
  trait TypeofToken
    extends StObject
       with Instantiable2[
          /* type */ String, 
          /* content */ TokenStream, 
          typings.prismReactRenderer.mod.Prism.Token
        ] {
    
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
    
    def `type`(o: String): typings.reactLive.reactLiveStrings.String = js.native
    def `type`(o: js.Array[Any]): Array = js.native
    def `type`(o: js.Function): Function = js.native
    // tslint:enable:ban-types
    def `type`(o: js.RegExp): RegExp = js.native
    def `type`(o: Any): String = js.native
    // tslint:disable:ban-types
    def `type`(o: Boolean): typings.reactLive.reactLiveStrings.Boolean = js.native
    def `type`(o: Double): Number = js.native
    /** Determine the type of the object */
    def `type`(o: Null): typings.reactLive.reactLiveStrings.Null = js.native
    def `type`(o: Unit): Undefined = js.native
    def `type`(o: typings.std.Number): Number = js.native
  }
}
