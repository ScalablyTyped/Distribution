package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieRadarChartBase
  extends StObject
     with ChartBase {
  
  var minOffset: js.UndefOr[Double] = js.undefined
  
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  var rotationEnabled: js.UndefOr[Boolean] = js.undefined
}
object PieRadarChartBase {
  
  inline def apply(): PieRadarChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieRadarChartBase]
  }
  
  extension [Self <: PieRadarChartBase](x: Self) {
    
    inline def setMinOffset(value: Double): Self = StObject.set(x, "minOffset", value.asInstanceOf[js.Any])
    
    inline def setMinOffsetUndefined: Self = StObject.set(x, "minOffset", js.undefined)
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
  }
}
