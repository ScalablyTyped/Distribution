package typings.resourceLoader

import typings.resourceLoader.abstractLoadStrategyMod.AbstractLoadStrategyCtor
import typings.resourceLoader.abstractLoadStrategyMod.ILoadConfig
import typings.resourceLoader.anon.TypeofLoader
import typings.resourceLoader.imageLoadStrategyMod.IImageLoadConfig
import typings.resourceLoader.loaderMod.Loader.MiddlewareFn
import typings.resourceLoader.mediaElementLoadStrategyMod.IMediaElementLoadConfig
import typings.resourceLoader.resourceLoaderStrings.audio
import typings.resourceLoader.resourceLoaderStrings.video
import typings.resourceLoader.resourceMod.IResourceOptions
import typings.resourceLoader.xhrLoadStrategyMod.IXhrLoadConfig
import typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resource-loader", "AbstractLoadStrategy")
  @js.native
  abstract class AbstractLoadStrategy[C /* <: ILoadConfig */] protected ()
    extends typings.resourceLoader.abstractLoadStrategyMod.AbstractLoadStrategy[C] {
    def this(config: C) = this()
  }
  
  @JSImport("resource-loader", "AudioLoadStrategy")
  @js.native
  open class AudioLoadStrategy protected ()
    extends typings.resourceLoader.audioLoadStrategyMod.AudioLoadStrategy {
    def this(config: IMediaElementLoadConfig) = this()
  }
  
  @JSImport("resource-loader", "ImageLoadStrategy")
  @js.native
  open class ImageLoadStrategy protected ()
    extends typings.resourceLoader.imageLoadStrategyMod.ImageLoadStrategy {
    def this(config: IImageLoadConfig) = this()
  }
  
  @JSImport("resource-loader", "Loader")
  @js.native
  open class Loader ()
    extends typings.resourceLoader.loaderMod.Loader {
    def this(baseUrl: String) = this()
    def this(baseUrl: String, concurrency: Double) = this()
    def this(baseUrl: Unit, concurrency: Double) = this()
  }
  /* static members */
  object Loader {
    
    @JSImport("resource-loader", "Loader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader", "Loader.DefaultMiddlewarePriority")
    @js.native
    val DefaultMiddlewarePriority: /* 50 */ Double = js.native
    
    @JSImport("resource-loader", "Loader._defaultMiddleware")
    @js.native
    def _defaultMiddleware: Any = js.native
    inline def _defaultMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultMiddleware")(x.asInstanceOf[js.Any])
    
    inline def use(fn: MiddlewareFn): TypeofLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any]).asInstanceOf[TypeofLoader]
    inline def use(fn: MiddlewareFn, priority: Double): TypeofLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[TypeofLoader]
  }
  
  @JSImport("resource-loader", "MediaElementLoadStrategy")
  @js.native
  abstract class MediaElementLoadStrategy protected ()
    extends typings.resourceLoader.mediaElementLoadStrategyMod.MediaElementLoadStrategy {
    def this(config: IMediaElementLoadConfig, elementType: audio | video) = this()
  }
  
  @JSImport("resource-loader", "Resource")
  @js.native
  open class Resource protected ()
    extends typings.resourceLoader.resourceMod.Resource {
    def this(name: String, options: IResourceOptions) = this()
  }
  /* static members */
  object Resource {
    
    @JSImport("resource-loader", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader", "Resource._defaultLoadStrategy")
    @js.native
    def _defaultLoadStrategy: Any = js.native
    inline def _defaultLoadStrategy_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultLoadStrategy")(x.asInstanceOf[js.Any])
    
    @JSImport("resource-loader", "Resource._loadStrategyMap")
    @js.native
    def _loadStrategyMap: Any = js.native
    inline def _loadStrategyMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_loadStrategyMap")(x.asInstanceOf[js.Any])
    
    @JSImport("resource-loader", "Resource._tempAnchor")
    @js.native
    def _tempAnchor: Any = js.native
    inline def _tempAnchor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tempAnchor")(x.asInstanceOf[js.Any])
    
    inline def setDefaultLoadStrategy(strategy: AbstractLoadStrategyCtor[ILoadConfig]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLoadStrategy")(strategy.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setLoadStrategy(extname: String, strategy: AbstractLoadStrategyCtor[ILoadConfig]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLoadStrategy")(extname.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("resource-loader", "ResourceState")
  @js.native
  object ResourceState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.resourceLoader.resourceTypeMod.ResourceState & Double] = js.native
    
    /* 2 */ val Complete: typings.resourceLoader.resourceTypeMod.ResourceState.Complete & Double = js.native
    
    /* 1 */ val Loading: typings.resourceLoader.resourceTypeMod.ResourceState.Loading & Double = js.native
    
    /* 0 */ val NotStarted: typings.resourceLoader.resourceTypeMod.ResourceState.NotStarted & Double = js.native
  }
  
  @JSImport("resource-loader", "ResourceType")
  @js.native
  object ResourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.resourceLoader.resourceTypeMod.ResourceType & Double] = js.native
    
    /* 6 */ val Audio: typings.resourceLoader.resourceTypeMod.ResourceType.Audio & Double = js.native
    
    /* 2 */ val Blob: typings.resourceLoader.resourceTypeMod.ResourceType.Blob & Double = js.native
    
    /* 1 */ val Buffer: typings.resourceLoader.resourceTypeMod.ResourceType.Buffer & Double = js.native
    
    /* 5 */ val Image: typings.resourceLoader.resourceTypeMod.ResourceType.Image & Double = js.native
    
    /* 3 */ val Json: typings.resourceLoader.resourceTypeMod.ResourceType.Json & Double = js.native
    
    /* 8 */ val Text: typings.resourceLoader.resourceTypeMod.ResourceType.Text & Double = js.native
    
    /* 0 */ val Unknown: typings.resourceLoader.resourceTypeMod.ResourceType.Unknown & Double = js.native
    
    /* 7 */ val Video: typings.resourceLoader.resourceTypeMod.ResourceType.Video & Double = js.native
    
    /* 4 */ val Xml: typings.resourceLoader.resourceTypeMod.ResourceType.Xml & Double = js.native
  }
  
  @JSImport("resource-loader", "VideoLoadStrategy")
  @js.native
  open class VideoLoadStrategy protected ()
    extends typings.resourceLoader.videoLoadStrategyMod.VideoLoadStrategy {
    def this(config: IMediaElementLoadConfig) = this()
  }
  
  @JSImport("resource-loader", "XhrLoadStrategy")
  @js.native
  open class XhrLoadStrategy protected ()
    extends typings.resourceLoader.xhrLoadStrategyMod.XhrLoadStrategy {
    def this(config: IXhrLoadConfig) = this()
  }
  /* static members */
  object XhrLoadStrategy {
    
    @JSImport("resource-loader", "XhrLoadStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader", "XhrLoadStrategy.ResponseType")
    @js.native
    val ResponseType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof XhrResponseType */ Any = js.native
    
    @JSImport("resource-loader", "XhrLoadStrategy._xhrTypeMap")
    @js.native
    def _xhrTypeMap: Any = js.native
    inline def _xhrTypeMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_xhrTypeMap")(x.asInstanceOf[js.Any])
    
    inline def setExtensionXhrType(extname: String, xhrType: XhrResponseType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionXhrType")(extname.asInstanceOf[js.Any], xhrType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("resource-loader", "XhrResponseType")
  @js.native
  object XhrResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType & String] = js.native
    
    /* "blob" */ val Blob: typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType.Blob & String = js.native
    
    /* "arraybuffer" */ val Buffer: typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType.Buffer & String = js.native
    
    /* "text" */ val Default: typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType.Default & String = js.native
    
    /* "document" */ val Document: typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType.Document & String = js.native
    
    /* "json" */ val Json: typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType.Json & String = js.native
    
    /* "text" */ val Text: typings.resourceLoader.xhrLoadStrategyMod.XhrResponseType.Text & String = js.native
  }
}
