package typings.signaturePad.mod

import typings.signaturePad.pointMod.BasicPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointGroup extends js.Object {
  
  var color: String = js.native
  
  var points: js.Array[BasicPoint] = js.native
}
object PointGroup {
  
  @scala.inline
  def apply(color: String, points: js.Array[BasicPoint]): PointGroup = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointGroup]
  }
  
  @scala.inline
  implicit class PointGroupOps[Self <: PointGroup] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: BasicPoint*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[BasicPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
}
