package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialVerticalParams
  extends StObject
     with FrameStruct
     with PointKnob
     with LinearRadialCommon {
  
  var area: js.UndefOr[js.Array[Section]] = js.undefined
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var section: js.UndefOr[js.Array[Section]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object RadialVerticalParams {
  
  inline def apply(): RadialVerticalParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialVerticalParams]
  }
  
  extension [Self <: RadialVerticalParams](x: Self) {
    
    inline def setArea(value: js.Array[Section]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setAreaVarargs(value: Section*): Self = StObject.set(x, "area", js.Array(value*))
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSection(value: js.Array[Section]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: Section*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
