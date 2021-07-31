package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelRgbComponentInfo extends StObject {
  
  /** The RGB blue channel */
  var b: Double
  
  /** The RGB green channel */
  var g: Double
  
  /** Hex string of the color, in the format `#XXXXXX`. */
  var hex: String
  
  /** The RGB red channel */
  var r: Double
}
object RaphaelRgbComponentInfo {
  
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double): RaphaelRgbComponentInfo = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelRgbComponentInfo]
  }
  
  @scala.inline
  implicit class RaphaelRgbComponentInfoMutableBuilder[Self <: RaphaelRgbComponentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
