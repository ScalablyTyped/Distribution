package typings.reactFrontload

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.reactFrontload.anon.AllFrontloads
import typings.reactFrontload.anon.Children
import typings.reactFrontload.anon.Context
import typings.reactFrontload.anon.Data
import typings.reactFrontload.anon.Frontloads
import typings.reactFrontload.anon.IsFinalRender
import typings.reactFrontload.anon.Logging
import typings.reactFrontload.anon.ServerRenderedData
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-frontload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FrontloadProvider(hasFrontloadStateChildren: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FrontloadProvider")(hasFrontloadStateChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object createFrontloadState {
    
    @JSImport("react-frontload", "createFrontloadState")
    @js.native
    val ^ : js.Any = js.native
    
    inline def client(args: Logging): FrontloadState = ^.asInstanceOf[js.Dynamic].applyDynamic("client")(args.asInstanceOf[js.Any]).asInstanceOf[FrontloadState]
    
    inline def server(args: Context): FrontloadState = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(args.asInstanceOf[js.Any]).asInstanceOf[FrontloadState]
  }
  
  inline def frontloadServerRender[T](hasRenderFrontloadState: typings.reactFrontload.anon.FrontloadState[T]): js.Promise[Data[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("frontloadServerRender")(hasRenderFrontloadState.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data[T]]]
  
  inline def useFrontload[T](key: String, fn: js.Function1[/* context */ Any, js.Promise[T]]): FrontloadProps[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrontload")(key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[FrontloadProps[T]]
  
  trait FrontloadData extends StObject {
    
    var fn: FrontloadFunction
    
    var key: String
  }
  object FrontloadData {
    
    inline def apply(fn: /* context */ Any => js.Promise[Any], key: String): FrontloadData = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrontloadData]
    }
    
    extension [Self <: FrontloadData](x: Self) {
      
      inline def setFn(value: /* context */ Any => js.Promise[Any]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type FrontloadFunction = js.Function1[/* context */ Any, js.Promise[Any]]
  
  trait FrontloadMeta extends StObject {
    
    var done: Boolean
    
    var error: Any
    
    var pending: Boolean
    
    var serverRendered: Boolean
  }
  object FrontloadMeta {
    
    inline def apply(done: Boolean, error: Any, pending: Boolean, serverRendered: Boolean): FrontloadMeta = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], serverRendered = serverRendered.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrontloadMeta]
    }
    
    extension [Self <: FrontloadMeta](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setServerRendered(value: Boolean): Self = StObject.set(x, "serverRendered", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrontloadProps[T] extends StObject {
    
    var data: T
    
    var frontloadMeta: FrontloadMeta
    
    def setData(fn: js.Function1[/* data */ T, T]): Unit
  }
  object FrontloadProps {
    
    inline def apply[T](data: T, frontloadMeta: FrontloadMeta, setData: js.Function1[/* data */ T, T] => Unit): FrontloadProps[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], frontloadMeta = frontloadMeta.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
      __obj.asInstanceOf[FrontloadProps[T]]
    }
    
    extension [Self <: FrontloadProps[?], T](x: Self & FrontloadProps[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrontloadMeta(value: FrontloadMeta): Self = StObject.set(x, "frontloadMeta", value.asInstanceOf[js.Any])
      
      inline def setSetData(value: js.Function1[/* data */ T, T] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    }
  }
  
  type FrontloadServerRenderFunction[T] = js.Function1[/* args */ IsFinalRender, T]
  
  type FrontloadState = InstanceType[
    Instantiable1[
      /* hasServerRenderedDataContextLogging */ ServerRenderedData, 
      FrontloadStatePrivate
    ]
  ]
  
  trait FrontloadStatePrivate extends StObject {
    
    /* private */ var clientRender: Any
    
    def collectServerRenderFrontload(frontload: FrontloadData): Unit
    
    var context: Any
    
    def getFrontloadServerRenderedData(key: String): Any
    
    def getServerRenderCache(): StringDictionary[Any]
    
    def getServerRenderMeta(): Frontloads
    
    def hasFrontloadRunOnServer(key: String): Boolean
    
    def isClientLoggingEnabled(): Boolean
    
    def isFirstRender(): Boolean
    
    def prepareServerRenderPass(): Unit
    
    def runFrontloadsForThisServerRenderPass(): js.Promise[AllFrontloads]
    
    /* private */ var serverRender: Any
    
    def setFirstRenderDoneOnClient(): Unit
  }
  object FrontloadStatePrivate {
    
    inline def apply(
      clientRender: Any,
      collectServerRenderFrontload: FrontloadData => Unit,
      context: Any,
      getFrontloadServerRenderedData: String => Any,
      getServerRenderCache: () => StringDictionary[Any],
      getServerRenderMeta: () => Frontloads,
      hasFrontloadRunOnServer: String => Boolean,
      isClientLoggingEnabled: () => Boolean,
      isFirstRender: () => Boolean,
      prepareServerRenderPass: () => Unit,
      runFrontloadsForThisServerRenderPass: () => js.Promise[AllFrontloads],
      serverRender: Any,
      setFirstRenderDoneOnClient: () => Unit
    ): FrontloadStatePrivate = {
      val __obj = js.Dynamic.literal(clientRender = clientRender.asInstanceOf[js.Any], collectServerRenderFrontload = js.Any.fromFunction1(collectServerRenderFrontload), context = context.asInstanceOf[js.Any], getFrontloadServerRenderedData = js.Any.fromFunction1(getFrontloadServerRenderedData), getServerRenderCache = js.Any.fromFunction0(getServerRenderCache), getServerRenderMeta = js.Any.fromFunction0(getServerRenderMeta), hasFrontloadRunOnServer = js.Any.fromFunction1(hasFrontloadRunOnServer), isClientLoggingEnabled = js.Any.fromFunction0(isClientLoggingEnabled), isFirstRender = js.Any.fromFunction0(isFirstRender), prepareServerRenderPass = js.Any.fromFunction0(prepareServerRenderPass), runFrontloadsForThisServerRenderPass = js.Any.fromFunction0(runFrontloadsForThisServerRenderPass), serverRender = serverRender.asInstanceOf[js.Any], setFirstRenderDoneOnClient = js.Any.fromFunction0(setFirstRenderDoneOnClient))
      __obj.asInstanceOf[FrontloadStatePrivate]
    }
    
    extension [Self <: FrontloadStatePrivate](x: Self) {
      
      inline def setClientRender(value: Any): Self = StObject.set(x, "clientRender", value.asInstanceOf[js.Any])
      
      inline def setCollectServerRenderFrontload(value: FrontloadData => Unit): Self = StObject.set(x, "collectServerRenderFrontload", js.Any.fromFunction1(value))
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setGetFrontloadServerRenderedData(value: String => Any): Self = StObject.set(x, "getFrontloadServerRenderedData", js.Any.fromFunction1(value))
      
      inline def setGetServerRenderCache(value: () => StringDictionary[Any]): Self = StObject.set(x, "getServerRenderCache", js.Any.fromFunction0(value))
      
      inline def setGetServerRenderMeta(value: () => Frontloads): Self = StObject.set(x, "getServerRenderMeta", js.Any.fromFunction0(value))
      
      inline def setHasFrontloadRunOnServer(value: String => Boolean): Self = StObject.set(x, "hasFrontloadRunOnServer", js.Any.fromFunction1(value))
      
      inline def setIsClientLoggingEnabled(value: () => Boolean): Self = StObject.set(x, "isClientLoggingEnabled", js.Any.fromFunction0(value))
      
      inline def setIsFirstRender(value: () => Boolean): Self = StObject.set(x, "isFirstRender", js.Any.fromFunction0(value))
      
      inline def setPrepareServerRenderPass(value: () => Unit): Self = StObject.set(x, "prepareServerRenderPass", js.Any.fromFunction0(value))
      
      inline def setRunFrontloadsForThisServerRenderPass(value: () => js.Promise[AllFrontloads]): Self = StObject.set(x, "runFrontloadsForThisServerRenderPass", js.Any.fromFunction0(value))
      
      inline def setServerRender(value: Any): Self = StObject.set(x, "serverRender", value.asInstanceOf[js.Any])
      
      inline def setSetFirstRenderDoneOnClient(value: () => Unit): Self = StObject.set(x, "setFirstRenderDoneOnClient", js.Any.fromFunction0(value))
    }
  }
}
