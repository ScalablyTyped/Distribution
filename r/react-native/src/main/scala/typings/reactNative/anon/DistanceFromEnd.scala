package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceFromEnd extends js.Object {
  
  var distanceFromEnd: Double = js.native
}
object DistanceFromEnd {
  
  @scala.inline
  def apply(distanceFromEnd: Double): DistanceFromEnd = {
    val __obj = js.Dynamic.literal(distanceFromEnd = distanceFromEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceFromEnd]
  }
  
  @scala.inline
  implicit class DistanceFromEndOps[Self <: DistanceFromEnd] (val x: Self) extends AnyVal {
    
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
    def setDistanceFromEnd(value: Double): Self = this.set("distanceFromEnd", value.asInstanceOf[js.Any])
  }
}
