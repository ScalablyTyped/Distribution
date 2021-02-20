package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarData extends StObject {
  
  var height: Double = js.native
  
  var radius: Double | js.Array[_] = js.native
  
  var value: Double | String | js.Array[_] = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object BarData {
  
  @scala.inline
  def apply(
    height: Double,
    radius: Double | js.Array[_],
    value: Double | String | js.Array[_],
    width: Double,
    x: Double,
    y: Double
  ): BarData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarData]
  }
  
  @scala.inline
  implicit class BarDataMutableBuilder[Self <: BarData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double | js.Array[_]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusVarargs(value: js.Any*): Self = StObject.set(x, "radius", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double | String | js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
