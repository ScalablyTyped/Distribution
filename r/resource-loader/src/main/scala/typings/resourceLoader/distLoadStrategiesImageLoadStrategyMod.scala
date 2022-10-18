package typings.resourceLoader

import typings.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.AbstractLoadStrategy
import typings.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.ILoadConfig
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoadStrategiesImageLoadStrategyMod {
  
  @JSImport("resource-loader/dist/load_strategies/ImageLoadStrategy", "ImageLoadStrategy")
  @js.native
  open class ImageLoadStrategy protected () extends AbstractLoadStrategy[IImageLoadConfig] {
    def this(config: IImageLoadConfig) = this()
    
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
  }
  
  trait IImageLoadConfig
    extends StObject
       with ILoadConfig {
    
    var loadElement: js.UndefOr[HTMLImageElement] = js.undefined
  }
  object IImageLoadConfig {
    
    inline def apply(url: String): IImageLoadConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageLoadConfig]
    }
    
    extension [Self <: IImageLoadConfig](x: Self) {
      
      inline def setLoadElement(value: HTMLImageElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
      
      inline def setLoadElementUndefined: Self = StObject.set(x, "loadElement", js.undefined)
    }
  }
}
