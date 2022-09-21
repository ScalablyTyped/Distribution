package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotDiff extends StObject {
  
  var allowableMismatchedPixels: Double
  
  var allowableMismatchedRatio: Double
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var desc: js.UndefOr[String] = js.undefined
  
  var device: js.UndefOr[String] = js.undefined
  
  var deviceScaleFactor: js.UndefOr[Double] = js.undefined
  
  var hasTouch: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var imageA: js.UndefOr[String] = js.undefined
  
  var imageB: js.UndefOr[String] = js.undefined
  
  var isLandscape: js.UndefOr[Boolean] = js.undefined
  
  var isMobile: js.UndefOr[Boolean] = js.undefined
  
  var mismatchedPixels: Double
  
  var testPath: js.UndefOr[String] = js.undefined
  
  var userAgent: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ScreenshotDiff {
  
  inline def apply(allowableMismatchedPixels: Double, allowableMismatchedRatio: Double, mismatchedPixels: Double): ScreenshotDiff = {
    val __obj = js.Dynamic.literal(allowableMismatchedPixels = allowableMismatchedPixels.asInstanceOf[js.Any], allowableMismatchedRatio = allowableMismatchedRatio.asInstanceOf[js.Any], mismatchedPixels = mismatchedPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotDiff]
  }
  
  extension [Self <: ScreenshotDiff](x: Self) {
    
    inline def setAllowableMismatchedPixels(value: Double): Self = StObject.set(x, "allowableMismatchedPixels", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedRatio(value: Double): Self = StObject.set(x, "allowableMismatchedRatio", value.asInstanceOf[js.Any])
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setDeviceScaleFactorUndefined: Self = StObject.set(x, "deviceScaleFactor", js.undefined)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
    
    inline def setHasTouchUndefined: Self = StObject.set(x, "hasTouch", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageA(value: String): Self = StObject.set(x, "imageA", value.asInstanceOf[js.Any])
    
    inline def setImageAUndefined: Self = StObject.set(x, "imageA", js.undefined)
    
    inline def setImageB(value: String): Self = StObject.set(x, "imageB", value.asInstanceOf[js.Any])
    
    inline def setImageBUndefined: Self = StObject.set(x, "imageB", js.undefined)
    
    inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
    
    inline def setIsLandscapeUndefined: Self = StObject.set(x, "isLandscape", js.undefined)
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    inline def setMismatchedPixels(value: Double): Self = StObject.set(x, "mismatchedPixels", value.asInstanceOf[js.Any])
    
    inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    
    inline def setTestPathUndefined: Self = StObject.set(x, "testPath", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
