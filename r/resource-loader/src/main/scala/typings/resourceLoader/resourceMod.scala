package typings.resourceLoader

import typings.resourceLoader.abstractLoadStrategyMod.AbstractLoadStrategy
import typings.resourceLoader.abstractLoadStrategyMod.AbstractLoadStrategyCtor
import typings.resourceLoader.abstractLoadStrategyMod.ILoadConfig
import typings.resourceLoader.resourceMod.Resource.OnCompleteSignal
import typings.resourceLoader.resourceMod.Resource.OnProgressSignal
import typings.resourceLoader.resourceMod.Resource.OnStartSignal
import typings.resourceLoader.resourceTypeMod.ResourceType
import typings.typeSignals.mod.Signal
import typings.typeSignals.mod.SignalBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("resource-loader/dist/Resource", "Resource")
  @js.native
  open class Resource protected () extends StObject {
    def this(name: String, options: IResourceOptions) = this()
    
    /* private */ var _complete: Any = js.native
    
    var _dequeue: js.Function = js.native
    
    /* private */ var _determineCrossOrigin: Any = js.native
    
    /* private */ var _error: Any = js.native
    
    var _onCompleteBinding: SignalBinding | Null = js.native
    
    /* private */ var _progress: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _strategy: Any = js.native
    
    def abort(): Unit = js.native
    
    val children: js.Array[Resource] = js.native
    
    var data: Any = js.native
    
    var error: String = js.native
    
    def isComplete: Boolean = js.native
    
    def isLoading: Boolean = js.native
    
    def load(): Unit = js.native
    
    var metadata: Any = js.native
    
    val name: String = js.native
    
    val onAfterMiddleware: Signal[OnCompleteSignal] = js.native
    
    val onComplete: Signal[OnCompleteSignal] = js.native
    
    val onProgress: Signal[OnProgressSignal] = js.native
    
    val onStart: Signal[OnStartSignal] = js.native
    
    var progressChunk: Double = js.native
    
    def strategy: AbstractLoadStrategy[ILoadConfig] = js.native
    
    var `type`: ResourceType = js.native
    
    def url: String = js.native
  }
  /* static members */
  object Resource {
    
    @JSImport("resource-loader/dist/Resource", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader/dist/Resource", "Resource._defaultLoadStrategy")
    @js.native
    def _defaultLoadStrategy: Any = js.native
    inline def _defaultLoadStrategy_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultLoadStrategy")(x.asInstanceOf[js.Any])
    
    @JSImport("resource-loader/dist/Resource", "Resource._loadStrategyMap")
    @js.native
    def _loadStrategyMap: Any = js.native
    inline def _loadStrategyMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_loadStrategyMap")(x.asInstanceOf[js.Any])
    
    @JSImport("resource-loader/dist/Resource", "Resource._tempAnchor")
    @js.native
    def _tempAnchor: Any = js.native
    inline def _tempAnchor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tempAnchor")(x.asInstanceOf[js.Any])
    
    inline def setDefaultLoadStrategy(strategy: AbstractLoadStrategyCtor[ILoadConfig]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLoadStrategy")(strategy.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setLoadStrategy(extname: String, strategy: AbstractLoadStrategyCtor[ILoadConfig]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLoadStrategy")(extname.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    type OnCompleteSignal = js.Function1[/* resource */ Resource, Unit]
    
    type OnErrorSignal = js.Function1[/* resource */ Resource, Unit]
    
    type OnProgressSignal = js.Function2[/* resource */ Resource, /* percent */ Double, Unit]
    
    type OnStartSignal = js.Function1[/* resource */ Resource, Unit]
  }
  
  trait IResourceOptions
    extends StObject
       with ILoadConfig {
    
    var metadata: js.UndefOr[Any] = js.undefined
    
    var strategy: js.UndefOr[AbstractLoadStrategy[ILoadConfig] | AbstractLoadStrategyCtor[ILoadConfig]] = js.undefined
  }
  object IResourceOptions {
    
    inline def apply(url: String): IResourceOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResourceOptions]
    }
    
    extension [Self <: IResourceOptions](x: Self) {
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setStrategy(value: AbstractLoadStrategy[ILoadConfig] | AbstractLoadStrategyCtor[ILoadConfig]): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
