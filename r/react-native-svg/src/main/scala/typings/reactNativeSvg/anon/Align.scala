package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: String
  
  var meetOrSlice: Double
  
  var minX: Double
  
  var minY: Double
  
  var vbHeight: Double
  
  var vbWidth: Double
}
object Align {
  
  inline def apply(align: String, meetOrSlice: Double, minX: Double, minY: Double, vbHeight: Double, vbWidth: Double): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], vbHeight = vbHeight.asInstanceOf[js.Any], vbWidth = vbWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setMeetOrSlice(value: Double): Self = StObject.set(x, "meetOrSlice", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    inline def setVbHeight(value: Double): Self = StObject.set(x, "vbHeight", value.asInstanceOf[js.Any])
    
    inline def setVbWidth(value: Double): Self = StObject.set(x, "vbWidth", value.asInstanceOf[js.Any])
  }
}
