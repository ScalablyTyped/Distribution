package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSeriesPoint extends AbstractSeriesPoint {
  
  var label: String = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var x: Double = js.native
  
  var xOffset: js.UndefOr[Double] = js.native
  
  var y: Double = js.native
  
  var yOffset: js.UndefOr[Double] = js.native
}
object LabelSeriesPoint {
  
  @scala.inline
  def apply(label: String, x: Double, y: Double): LabelSeriesPoint = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSeriesPoint]
  }
  
  @scala.inline
  implicit class LabelSeriesPointMutableBuilder[Self <: LabelSeriesPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
