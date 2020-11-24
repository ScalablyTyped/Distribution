package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionDot extends js.Object {
  
  var bez1: js.Array[Double] = js.native
  
  var bez2: js.Array[Double] = js.native
  
  var segment1: Double = js.native
  
  var segment2: Double = js.native
  
  var t1: Double = js.native
  
  var t2: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object IntersectionDot {
  
  @scala.inline
  def apply(
    bez1: js.Array[Double],
    bez2: js.Array[Double],
    segment1: Double,
    segment2: Double,
    t1: Double,
    t2: Double,
    x: Double,
    y: Double
  ): IntersectionDot = {
    val __obj = js.Dynamic.literal(bez1 = bez1.asInstanceOf[js.Any], bez2 = bez2.asInstanceOf[js.Any], segment1 = segment1.asInstanceOf[js.Any], segment2 = segment2.asInstanceOf[js.Any], t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionDot]
  }
  
  @scala.inline
  implicit class IntersectionDotOps[Self <: IntersectionDot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBez1Varargs(value: Double*): Self = this.set("bez1", js.Array(value :_*))
    
    @scala.inline
    def setBez1(value: js.Array[Double]): Self = this.set("bez1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBez2Varargs(value: Double*): Self = this.set("bez2", js.Array(value :_*))
    
    @scala.inline
    def setBez2(value: js.Array[Double]): Self = this.set("bez2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegment1(value: Double): Self = this.set("segment1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegment2(value: Double): Self = this.set("segment2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT1(value: Double): Self = this.set("t1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT2(value: Double): Self = this.set("t2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
