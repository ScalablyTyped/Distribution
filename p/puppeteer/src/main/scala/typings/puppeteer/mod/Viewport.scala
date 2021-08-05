package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  /**
    * Specify device scale factor (can be thought of as dpr).
    * @default 1
    */
  var deviceScaleFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if viewport supports touch events.
    * @default false
    */
  var hasTouch: js.UndefOr[Boolean] = js.undefined
  
  /** The page height in pixels. */
  var height: Double
  
  /**
    * Specifies if viewport is in landscape mode.
    * @default false
    */
  var isLandscape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the `meta viewport` tag is taken into account.
    * @default false
    */
  var isMobile: js.UndefOr[Boolean] = js.undefined
  
  /** The page width in pixels. */
  var width: Double
}
object Viewport {
  
  inline def apply(height: Double, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setDeviceScaleFactorUndefined: Self = StObject.set(x, "deviceScaleFactor", js.undefined)
    
    inline def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
    
    inline def setHasTouchUndefined: Self = StObject.set(x, "hasTouch", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
    
    inline def setIsLandscapeUndefined: Self = StObject.set(x, "isLandscape", js.undefined)
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
