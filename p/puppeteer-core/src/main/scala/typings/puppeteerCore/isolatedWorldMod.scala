package typings.puppeteerCore

import org.scalablytyped.runtime.StringDictionary
import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.puppeteerCore.anon.Bindings
import typings.puppeteerCore.anon.Button
import typings.puppeteerCore.anon.Delay
import typings.puppeteerCore.anon.WaitUntil
import typings.puppeteerCore.elementHandleMod.ElementHandle
import typings.puppeteerCore.executionContextMod.ExecutionContext
import typings.puppeteerCore.frameMod.Frame
import typings.puppeteerCore.injectedInjectedMod.PuppeteerUtil
import typings.puppeteerCore.jshandleMod.JSHandle
import typings.puppeteerCore.typesMod.EvaluateFunc
import typings.puppeteerCore.typesMod.HandleFor
import typings.puppeteerCore.typesMod.InnerLazyParams
import typings.puppeteerCore.typesMod.NodeFor
import typings.puppeteerCore.waitTaskMod.TaskManager
import typings.std.Awaited
import typings.std.Document
import typings.std.Map
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isolatedWorldMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/IsolatedWorld", "IsolatedWorld")
  @js.native
  open class IsolatedWorld protected () extends StObject {
    def this(frame: Frame) = this()
    
    @JSName("$")
    def $[Selector /* <: String */](selector: Selector): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
    
    @JSName("$eval")
    def $eval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    @JSName("$eval")
    def $eval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    @JSName("$x")
    def $x(expression: String): js.Promise[js.Array[ElementHandle[Node]]] = js.native
    
    @JSName("$$")
    def DollarDollar[Selector /* <: String */](selector: Selector): js.Promise[js.Array[ElementHandle[NodeFor[Selector]]]] = js.native
    
    @JSName("$$eval")
    def DollarDollareval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    @JSName("$$eval")
    def DollarDollareval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    def _addBindingToContext(context: ExecutionContext, name: String): js.Promise[Unit] = js.native
    
    def _boundFunctions: Map[String, js.Function] = js.native
    
    def _detach(): Unit = js.native
    
    def _waitForSelectorInPage(queryOne: js.Function, root: Unit, selector: String, options: WaitForSelectorOptions): js.Promise[JSHandle[Any] | Null] = js.native
    def _waitForSelectorInPage(
      queryOne: js.Function,
      root: Unit,
      selector: String,
      options: WaitForSelectorOptions,
      bindings: Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]
    ): js.Promise[JSHandle[Any] | Null] = js.native
    def _waitForSelectorInPage(
      queryOne: js.Function,
      root: ElementHandle[Node],
      selector: String,
      options: WaitForSelectorOptions
    ): js.Promise[JSHandle[Any] | Null] = js.native
    def _waitForSelectorInPage(
      queryOne: js.Function,
      root: ElementHandle[Node],
      selector: String,
      options: WaitForSelectorOptions,
      bindings: Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]
    ): js.Promise[JSHandle[Any] | Null] = js.native
    
    def adoptBackendNode(): js.Promise[JSHandle[Node]] = js.native
    def adoptBackendNode(backendNodeId: BackendNodeId): js.Promise[JSHandle[Node]] = js.native
    
    def adoptHandle[T /* <: JSHandle[Node] */](handle: T): js.Promise[T] = js.native
    
    def clearContext(): Unit = js.native
    
    def click(selector: String, options: Button): js.Promise[Unit] = js.native
    
    def content(): js.Promise[String] = js.native
    
    def document(): js.Promise[ElementHandle[Document]] = js.native
    
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    
    def executionContext(): js.Promise[ExecutionContext] = js.native
    
    def focus(selector: String): js.Promise[Unit] = js.native
    
    def frame(): Frame = js.native
    
    def hasContext(): Boolean = js.native
    
    def hover(selector: String): js.Promise[Unit] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def puppeteerUtil: js.Promise[JSHandle[PuppeteerUtil]] = js.native
    
    def select(selector: String, values: String*): js.Promise[js.Array[String]] = js.native
    
    def setContent(html: String): js.Promise[Unit] = js.native
    def setContent(html: String, options: WaitUntil): js.Promise[Unit] = js.native
    
    def setContext(context: ExecutionContext): Unit = js.native
    
    def tap(selector: String): js.Promise[Unit] = js.native
    
    def taskManager: TaskManager = js.native
    
    def title(): js.Promise[String] = js.native
    
    def transferHandle[T /* <: JSHandle[Node] */](handle: T): js.Promise[T] = js.native
    
    def `type`(selector: String, text: String): js.Promise[Unit] = js.native
    def `type`(selector: String, text: String, options: Delay): js.Promise[Unit] = js.native
    
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[InnerLazyParams[Params]] */](
      pageFunction: Func,
      options: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[InnerLazyParams[Params]] */](
      pageFunction: Func,
      options: Bindings,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[InnerLazyParams[Params]] */](
      pageFunction: String,
      options: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[InnerLazyParams[Params]] */](
      pageFunction: String,
      options: Bindings,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/IsolatedWorld", "MAIN_WORLD")
  @js.native
  val MAIN_WORLD: js.Symbol = js.native
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/IsolatedWorld", "PUPPETEER_WORLD")
  @js.native
  val PUPPETEER_WORLD: js.Symbol = js.native
  
  @js.native
  trait IsolatedWorldChart
    extends StObject
       with /* key */ StringDictionary[IsolatedWorld]
  
  trait PageBinding extends StObject {
    
    var name: String
    
    var pptrFunction: js.Function
  }
  object PageBinding {
    
    inline def apply(name: String, pptrFunction: js.Function): PageBinding = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pptrFunction = pptrFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageBinding]
    }
    
    extension [Self <: PageBinding](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPptrFunction(value: js.Function): Self = StObject.set(x, "pptrFunction", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaitForSelectorOptions extends StObject {
    
    /**
      * Wait for the selected element to not be found in the DOM or to be hidden,
      * i.e. have `display: none` or `visibility: hidden` CSS properties.
      *
      * @defaultValue `false`
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum time to wait in milliseconds. Pass `0` to disable timeout.
      *
      * The default value can be changed by using {@link Page.setDefaultTimeout}
      *
      * @defaultValue `30000` (30 seconds)
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Wait for the selected element to be present in DOM and to be visible, i.e.
      * to not have `display: none` or `visibility: hidden` CSS properties.
      *
      * @defaultValue `false`
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object WaitForSelectorOptions {
    
    inline def apply(): WaitForSelectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForSelectorOptions]
    }
    
    extension [Self <: WaitForSelectorOptions](x: Self) {
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
