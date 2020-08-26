package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarSpace extends js.Object {
  var barSpace: Double = js.native
  var fromX: Double = js.native
  var groupSpace: Double = js.native
}

object BarSpace {
  @scala.inline
  def apply(barSpace: Double, fromX: Double, groupSpace: Double): BarSpace = {
    val __obj = js.Dynamic.literal(barSpace = barSpace.asInstanceOf[js.Any], fromX = fromX.asInstanceOf[js.Any], groupSpace = groupSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarSpace]
  }
  @scala.inline
  implicit class BarSpaceOps[Self <: BarSpace] (val x: Self) extends AnyVal {
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
    def setBarSpace(value: Double): Self = this.set("barSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromX(value: Double): Self = this.set("fromX", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupSpace(value: Double): Self = this.set("groupSpace", value.asInstanceOf[js.Any])
  }
  
}

