package typings.skiaCanvas.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTextureOptions extends StObject {
  
  /** The orientation of the pattern grid in radians */
  var angle: js.UndefOr[Double] = js.undefined
  
  /** The color to use for stroking/filling the path */
  var color: js.UndefOr[String] = js.undefined
  
  /** The lineWidth with which to stroke the path (if omitted, the path will be filled instead) */
  var line: js.UndefOr[Double] = js.undefined
  
  /** The amount by which to shift the pattern relative to the canvas origin */
  var offset: js.UndefOr[Offset] = js.undefined
  
  /** The 2D shape to be drawn in a repeating grid with the specified spacing (if omitted, parallel lines will be used) */
  var path: js.UndefOr[Path2D] = js.undefined
}
object CreateTextureOptions {
  
  inline def apply(): CreateTextureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTextureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTextureOptions] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPath(value: Path2D): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
