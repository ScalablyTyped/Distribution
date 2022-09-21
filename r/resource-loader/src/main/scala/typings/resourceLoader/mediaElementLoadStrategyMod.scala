package typings.resourceLoader

import typings.resourceLoader.abstractLoadStrategyMod.AbstractLoadStrategy
import typings.resourceLoader.abstractLoadStrategyMod.ILoadConfig
import typings.resourceLoader.resourceLoaderStrings.audio
import typings.resourceLoader.resourceLoaderStrings.video
import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaElementLoadStrategyMod {
  
  @JSImport("resource-loader/dist/load_strategies/MediaElementLoadStrategy", "MediaElementLoadStrategy")
  @js.native
  abstract class MediaElementLoadStrategy protected () extends AbstractLoadStrategy[IMediaElementLoadConfig] {
    def this(config: IMediaElementLoadConfig, elementType: audio | video) = this()
    
    /* private */ var _boundOnError: Any = js.native
    
    /* private */ var _boundOnLoad: Any = js.native
    
    /* private */ var _boundOnTimeout: Any = js.native
    
    /* private */ var _clearEvents: Any = js.native
    
    /* private */ var _complete: Any = js.native
    
    /* private */ var _createElement: Any = js.native
    
    /* private */ var _element: Any = js.native
    
    /* private */ var _elementTimer: Any = js.native
    
    /* private */ var _error: Any = js.native
    
    /* private */ var _onError: Any = js.native
    
    /* private */ var _onLoad: Any = js.native
    
    /* private */ var _onTimeout: Any = js.native
    
    val elementType: audio | video = js.native
  }
  
  trait IMediaElementLoadConfig
    extends StObject
       with ILoadConfig {
    
    var loadElement: js.UndefOr[HTMLMediaElement] = js.undefined
    
    var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var sourceSet: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IMediaElementLoadConfig {
    
    inline def apply(url: String): IMediaElementLoadConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMediaElementLoadConfig]
    }
    
    extension [Self <: IMediaElementLoadConfig](x: Self) {
      
      inline def setLoadElement(value: HTMLMediaElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
      
      inline def setLoadElementUndefined: Self = StObject.set(x, "loadElement", js.undefined)
      
      inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
      
      inline def setSourceSet(value: js.Array[String]): Self = StObject.set(x, "sourceSet", value.asInstanceOf[js.Any])
      
      inline def setSourceSetUndefined: Self = StObject.set(x, "sourceSet", js.undefined)
      
      inline def setSourceSetVarargs(value: String*): Self = StObject.set(x, "sourceSet", js.Array(value*))
    }
  }
}
