package typings.rcDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offset extends js.Object {
  
  var offset: js.Array[Double] = js.native
  
  var overflow: AdjustX = js.native
  
  var points: js.Array[String] = js.native
  
  var targetOffset: js.Array[Double] = js.native
}
object Offset {
  
  @scala.inline
  def apply(
    offset: js.Array[Double],
    overflow: AdjustX,
    points: js.Array[String],
    targetOffset: js.Array[Double]
  ): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetOps[Self <: Offset] (val x: Self) extends AnyVal {
    
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
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: AdjustX): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: String*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[String]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOffsetVarargs(value: Double*): Self = this.set("targetOffset", js.Array(value :_*))
    
    @scala.inline
    def setTargetOffset(value: js.Array[Double]): Self = this.set("targetOffset", value.asInstanceOf[js.Any])
  }
}
