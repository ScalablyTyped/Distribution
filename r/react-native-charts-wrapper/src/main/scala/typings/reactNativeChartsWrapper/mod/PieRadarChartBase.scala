package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieRadarChartBase extends ChartBase {
  
  var minOffset: js.UndefOr[Double] = js.native
  
  var rotationAngle: js.UndefOr[Double] = js.native
  
  var rotationEnabled: js.UndefOr[Boolean] = js.native
}
object PieRadarChartBase {
  
  @scala.inline
  def apply(): PieRadarChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieRadarChartBase]
  }
  
  @scala.inline
  implicit class PieRadarChartBaseMutableBuilder[Self <: PieRadarChartBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinOffset(value: Double): Self = StObject.set(x, "minOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinOffsetUndefined: Self = StObject.set(x, "minOffset", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    @scala.inline
    def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
  }
}
