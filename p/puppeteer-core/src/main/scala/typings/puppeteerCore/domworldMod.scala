package typings.puppeteerCore

import typings.node.NodeJS.Timeout
import typings.puppeteerCore.anon.Button
import typings.puppeteerCore.anon.Content
import typings.puppeteerCore.anon.Delay
import typings.puppeteerCore.anon.Path
import typings.puppeteerCore.anon.Polling
import typings.puppeteerCore.anon.WaitUntil
import typings.puppeteerCore.evalTypesMod.EvaluateFn
import typings.puppeteerCore.evalTypesMod.EvaluateFnReturnType
import typings.puppeteerCore.evalTypesMod.EvaluateHandleFn
import typings.puppeteerCore.evalTypesMod.SerializableOrJSHandle
import typings.puppeteerCore.evalTypesMod.UnwrapPromiseLike
import typings.puppeteerCore.evalTypesMod.WrapElementHandle
import typings.puppeteerCore.executionContextMod.ExecutionContext
import typings.puppeteerCore.frameManagerMod.Frame
import typings.puppeteerCore.frameManagerMod.FrameManager
import typings.puppeteerCore.jshandleMod.ElementHandle
import typings.puppeteerCore.jshandleMod.JSHandle
import typings.puppeteerCore.timeoutSettingsMod.TimeoutSettings
import typings.std.Element
import typings.std.Error
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domworldMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/DOMWorld", "DOMWorld")
  @js.native
  class DOMWorld protected () extends StObject {
    def this(frameManager: FrameManager, frame: Frame, timeoutSettings: TimeoutSettings) = this()
    
    @JSName("$")
    def $(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
    
    @JSName("$eval")
    def $eval[ReturnType](
      selector: String,
      pageFunction: js.Function2[/* element */ Element, /* repeated */ js.Any, ReturnType | js.Promise[ReturnType]],
      args: SerializableOrJSHandle*
    ): js.Promise[WrapElementHandle[ReturnType]] = js.native
    
    @JSName("$x")
    def $x(expression: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    @JSName("$$")
    def DollarDollar(selector: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    @JSName("$$eval")
    def DollarDollareval[ReturnType](
      selector: String,
      pageFunction: js.Function2[
          /* elements */ js.Array[Element], 
          /* repeated */ js.Any, 
          ReturnType | js.Promise[ReturnType]
        ],
      args: SerializableOrJSHandle*
    ): js.Promise[WrapElementHandle[ReturnType]] = js.native
    
    /**
      * @internal
      * Contains mapping from functions that should be bound to Puppeteer functions.
      */
    var _boundFunctions: Map[String, js.Function] = js.native
    
    var _contextPromise: js.Any = js.native
    
    var _contextResolveCallback: js.Any = js.native
    
    var _ctxBindings: js.Any = js.native
    
    def _detach(): Unit = js.native
    
    var _detached: js.Any = js.native
    
    def _document(): js.Promise[ElementHandle[Element]] = js.native
    
    var _documentPromise: js.Any = js.native
    
    var _frame: js.Any = js.native
    
    var _frameManager: js.Any = js.native
    
    def _hasContext(): Boolean = js.native
    
    var _onBindingCalled: js.Any = js.native
    
    def _setContext(): js.Promise[Unit] = js.native
    def _setContext(context: ExecutionContext): js.Promise[Unit] = js.native
    
    var _settingUpBinding: js.Any = js.native
    
    var _timeoutSettings: js.Any = js.native
    
    /**
      * @internal
      */
    var _waitTasks: Set[WaitTask] = js.native
    
    /**
      * @internal
      */
    def addBindingToContext(context: ExecutionContext, name: String): js.Promise[Unit] = js.native
    
    /**
      * Adds a script tag into the current context.
      *
      * @remarks
      *
      * You can pass a URL, filepath or string of contents. Note that when running Puppeteer
      * in a browser environment you cannot pass a filepath and should use either
      * `url` or `content`.
      */
    def addScriptTag(options: Content): js.Promise[ElementHandle[Element]] = js.native
    
    /**
      * Adds a style tag into the current context.
      *
      * @remarks
      *
      * You can pass a URL, filepath or string of contents. Note that when running Puppeteer
      * in a browser environment you cannot pass a filepath and should use either
      * `url` or `content`.
      *
      */
    def addStyleTag(options: Path): js.Promise[ElementHandle[Element]] = js.native
    
    def click(selector: String, options: Button): js.Promise[Unit] = js.native
    
    def content(): js.Promise[String] = js.native
    
    def evaluate[T /* <: EvaluateFn[js.Any] */](pageFunction: T, args: SerializableOrJSHandle*): js.Promise[UnwrapPromiseLike[EvaluateFnReturnType[T]]] = js.native
    
    def evaluateHandle[HandlerType /* <: JSHandle */](pageFunction: EvaluateHandleFn, args: SerializableOrJSHandle*): js.Promise[HandlerType] = js.native
    
    def executionContext(): js.Promise[ExecutionContext] = js.native
    
    def focus(selector: String): js.Promise[Unit] = js.native
    
    def frame(): Frame = js.native
    
    def hover(selector: String): js.Promise[Unit] = js.native
    
    def select(selector: String, values: String*): js.Promise[js.Array[String]] = js.native
    
    def setContent(html: String): js.Promise[Unit] = js.native
    def setContent(html: String, options: WaitUntil): js.Promise[Unit] = js.native
    
    def tap(selector: String): js.Promise[Unit] = js.native
    
    def title(): js.Promise[String] = js.native
    
    def `type`(selector: String, text: String): js.Promise[Unit] = js.native
    def `type`(selector: String, text: String, options: Delay): js.Promise[Unit] = js.native
    
    def waitForFunction(pageFunction: String, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: String, options: Polling, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: js.Function, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: js.Function, options: Polling, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    
    def waitForSelector(selector: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element] | Null] = js.native
    
    /**
      * @internal
      */
    def waitForSelectorInPage(queryOne: js.Function, selector: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element] | Null] = js.native
    def waitForSelectorInPage(queryOne: js.Function, selector: String, options: WaitForSelectorOptions, binding: PageBinding): js.Promise[ElementHandle[Element] | Null] = js.native
    
    def waitForXPath(xpath: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element] | Null] = js.native
  }
  /* static members */
  object DOMWorld {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/DOMWorld", "DOMWorld")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/DOMWorld", "DOMWorld.bindingIdentifier")
    @js.native
    def bindingIdentifier: js.Any = js.native
    @scala.inline
    def bindingIdentifier_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindingIdentifier")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/DOMWorld", "WaitTask")
  @js.native
  class WaitTask protected () extends StObject {
    def this(options: WaitTaskOptions) = this()
    
    var _args: js.Array[SerializableOrJSHandle] = js.native
    
    var _binding: PageBinding = js.native
    
    def _cleanup(): Unit = js.native
    
    var _domWorld: DOMWorld = js.native
    
    var _polling: String | Double = js.native
    
    var _predicateBody: String = js.native
    
    def _reject(x: Error): Unit = js.native
    
    def _resolve(x: JSHandle): Unit = js.native
    
    var _runCount: Double = js.native
    
    var _terminated: Boolean = js.native
    
    var _timeout: Double = js.native
    
    var _timeoutTimer: js.UndefOr[Timeout] = js.native
    
    var promise: js.Promise[JSHandle] = js.native
    
    def rerun(): js.Promise[Unit] = js.native
    
    def terminate(error: Error): Unit = js.native
  }
  
  trait PageBinding extends StObject {
    
    var name: String
    
    var pptrFunction: js.Function
  }
  object PageBinding {
    
    @scala.inline
    def apply(name: String, pptrFunction: js.Function): PageBinding = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pptrFunction = pptrFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageBinding]
    }
    
    @scala.inline
    implicit class PageBindingMutableBuilder[Self <: PageBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPptrFunction(value: js.Function): Self = StObject.set(x, "pptrFunction", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaitForSelectorOptions extends StObject {
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object WaitForSelectorOptions {
    
    @scala.inline
    def apply(): WaitForSelectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForSelectorOptions]
    }
    
    @scala.inline
    implicit class WaitForSelectorOptionsMutableBuilder[Self <: WaitForSelectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait WaitTaskOptions extends StObject {
    
    var args: js.Array[SerializableOrJSHandle]
    
    var binding: js.UndefOr[PageBinding] = js.undefined
    
    var domWorld: DOMWorld
    
    var polling: String | Double
    
    var predicateBody: js.Function | String
    
    var timeout: Double
    
    var title: String
  }
  object WaitTaskOptions {
    
    @scala.inline
    def apply(
      args: js.Array[SerializableOrJSHandle],
      domWorld: DOMWorld,
      polling: String | Double,
      predicateBody: js.Function | String,
      timeout: Double,
      title: String
    ): WaitTaskOptions = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], domWorld = domWorld.asInstanceOf[js.Any], polling = polling.asInstanceOf[js.Any], predicateBody = predicateBody.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitTaskOptions]
    }
    
    @scala.inline
    implicit class WaitTaskOptionsMutableBuilder[Self <: WaitTaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[SerializableOrJSHandle]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: SerializableOrJSHandle*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setBinding(value: PageBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
      
      @scala.inline
      def setDomWorld(value: DOMWorld): Self = StObject.set(x, "domWorld", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolling(value: String | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicateBody(value: js.Function | String): Self = StObject.set(x, "predicateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
