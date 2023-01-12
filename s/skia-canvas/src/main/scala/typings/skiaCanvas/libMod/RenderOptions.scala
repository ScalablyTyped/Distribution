package typings.skiaCanvas.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions extends StObject {
  
  /** Number of pixels per grid ‘point’ (defaults to 1) */
  var density: js.UndefOr[Double] = js.undefined
  
  /** Background color to draw beneath transparent parts of the canvas */
  var matte: js.UndefOr[String] = js.undefined
  
  /** Convert text to paths for SVG exports */
  var outline: js.UndefOr[Boolean] = js.undefined
  
  /** Page to export: Defaults to 1 (i.e., first page) */
  var page: js.UndefOr[Double] = js.undefined
  
  /** Quality for lossy encodings like JPEG (0.0–1.0) */
  var quality: js.UndefOr[Double] = js.undefined
}
object RenderOptions {
  
  inline def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setMatte(value: String): Self = StObject.set(x, "matte", value.asInstanceOf[js.Any])
    
    inline def setMatteUndefined: Self = StObject.set(x, "matte", js.undefined)
    
    inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
