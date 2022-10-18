package typings.resourceLoader

import org.scalablytyped.runtime.StringDictionary
import typings.resourceLoader.anon.FnCall
import typings.resourceLoader.anon.TypeofLoader
import typings.resourceLoader.distLoaderMod.Loader.MiddlewareFn
import typings.resourceLoader.distLoaderMod.Loader.OnCompleteSignal
import typings.resourceLoader.distLoaderMod.Loader.OnErrorSignal
import typings.resourceLoader.distLoaderMod.Loader.OnLoadSignal
import typings.resourceLoader.distLoaderMod.Loader.OnProgressSignal
import typings.resourceLoader.distLoaderMod.Loader.OnStartSignal
import typings.resourceLoader.distLoaderMod.Loader.ResourceMap
import typings.resourceLoader.distLoaderMod.Loader.UrlResolverFn
import typings.resourceLoader.distResourceMod.IResourceOptions
import typings.resourceLoader.distResourceMod.Resource
import typings.std.Partial
import typings.std.Record
import typings.std.ReturnType
import typings.typeSignals.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderMod {
  
  @JSImport("resource-loader/dist/Loader", "Loader")
  @js.native
  open class Loader () extends StObject {
    def this(baseUrl: String) = this()
    def this(baseUrl: String, concurrency: Double) = this()
    def this(baseUrl: Unit, concurrency: Double) = this()
    
    /* private */ var _baseUrl: Any = js.native
    
    /* private */ var _boundLoadResource: Any = js.native
    
    /* private */ var _loadResource: Any = js.native
    
    /* private */ var _middleware: Any = js.native
    
    /* private */ var _onComplete: Any = js.native
    
    /* private */ var _onLoad: Any = js.native
    
    /* private */ var _onStart: Any = js.native
    
    /* private */ var _prepareUrl: Any = js.native
    
    /* private */ var _queue: Any = js.native
    
    /* private */ var _resourcesParsing: Any = js.native
    
    /* private */ var _urlResolvers: Any = js.native
    
    def add(name: String, url: String): this.type = js.native
    def add(options: IAddOptions): this.type = js.native
    def add(resources: js.Array[IAddOptions | String]): this.type = js.native
    def add(url: String): this.type = js.native
    
    def addUrlResolver(func: UrlResolverFn): this.type = js.native
    
    def baseUrl: String = js.native
    def baseUrl_=(url: String): Unit = js.native
    
    def concurrency: Double = js.native
    def concurrency_=(concurrency: Double): Unit = js.native
    
    var defaultQueryString: String = js.native
    
    def load(): this.type = js.native
    def load(cb: OnCompleteSignal): this.type = js.native
    
    var loading: Boolean = js.native
    
    val onComplete: Signal[OnCompleteSignal] = js.native
    
    val onError: Signal[OnErrorSignal] = js.native
    
    val onLoad: Signal[OnLoadSignal] = js.native
    
    val onProgress: Signal[OnProgressSignal] = js.native
    
    val onStart: Signal[OnStartSignal] = js.native
    
    var progress: Double = js.native
    
    def reset(): this.type = js.native
    
    var resources: ResourceMap = js.native
    
    def use(fn: MiddlewareFn): this.type = js.native
    def use(fn: MiddlewareFn, priority: Double): this.type = js.native
  }
  /* static members */
  object Loader {
    
    @JSImport("resource-loader/dist/Loader", "Loader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader/dist/Loader", "Loader.DefaultMiddlewarePriority")
    @js.native
    val DefaultMiddlewarePriority: /* 50 */ Double = js.native
    
    @JSImport("resource-loader/dist/Loader", "Loader._defaultMiddleware")
    @js.native
    def _defaultMiddleware: Any = js.native
    inline def _defaultMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultMiddleware")(x.asInstanceOf[js.Any])
    
    inline def use(fn: MiddlewareFn): TypeofLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any]).asInstanceOf[TypeofLoader]
    inline def use(fn: MiddlewareFn, priority: Double): TypeofLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[TypeofLoader]
    
    type MiddlewareFn = js.Function2[/* resource */ Resource, /* next */ js.Function0[Unit], Unit]
    
    type OnCompleteSignal = js.Function2[/* loader */ Loader, /* resources */ ResourceMap, Unit]
    
    type OnErrorSignal = js.Function3[/* errMessage */ String, /* loader */ Loader, /* resource */ Resource, Unit]
    
    type OnLoadSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
    
    type OnProgressSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
    
    type OnStartSignal = js.Function1[/* loader */ Loader, Unit]
    
    type ResourceMap = Partial[Record[String, Resource]]
    
    type UrlResolverFn = js.Function2[/* url */ String, /* parsed */ ReturnType[FnCall], String]
  }
  
  trait IAddOptions
    extends StObject
       with IResourceOptions
       with /* key */ StringDictionary[Any] {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onComplete: js.UndefOr[typings.resourceLoader.distResourceMod.Resource.OnCompleteSignal] = js.undefined
    
    var parentResource: js.UndefOr[Resource] = js.undefined
  }
  object IAddOptions {
    
    inline def apply(url: String): IAddOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAddOptions]
    }
    
    extension [Self <: IAddOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnComplete(value: /* resource */ Resource => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setParentResource(value: Resource): Self = StObject.set(x, "parentResource", value.asInstanceOf[js.Any])
      
      inline def setParentResourceUndefined: Self = StObject.set(x, "parentResource", js.undefined)
    }
  }
}
