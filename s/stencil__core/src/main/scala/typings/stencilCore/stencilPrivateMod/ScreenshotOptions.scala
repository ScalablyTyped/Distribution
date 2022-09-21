package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotOptions extends StObject {
  
  /**
    * An object which specifies clipping region of the page.
    */
  var clip: js.UndefOr[ScreenshotBoundingBox] = js.undefined
  
  /**
    * When true, takes a screenshot of the full scrollable page.
    * Default: `false`
    */
  var fullPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hides default white background and allows capturing screenshots with transparency.
    * Default: `false`
    */
  var omitBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Matching threshold, ranges from `0` to 1. Smaller values make the comparison
    * more sensitive. Defaults to the testing config `pixelmatchThreshold` value;
    */
  var pixelmatchThreshold: js.UndefOr[Double] = js.undefined
}
object ScreenshotOptions {
  
  inline def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  extension [Self <: ScreenshotOptions](x: Self) {
    
    inline def setClip(value: ScreenshotBoundingBox): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    inline def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
    
    inline def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
    
    inline def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
    
    inline def setPixelmatchThreshold(value: Double): Self = StObject.set(x, "pixelmatchThreshold", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchThresholdUndefined: Self = StObject.set(x, "pixelmatchThreshold", js.undefined)
  }
}
