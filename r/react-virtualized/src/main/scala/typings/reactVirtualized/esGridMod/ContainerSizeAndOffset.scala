package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerSizeAndOffset extends js.Object {
  var containerSize: Double = js.native
  var offset: Double = js.native
}

object ContainerSizeAndOffset {
  @scala.inline
  def apply(containerSize: Double, offset: Double): ContainerSizeAndOffset = {
    val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSizeAndOffset]
  }
  @scala.inline
  implicit class ContainerSizeAndOffsetOps[Self <: ContainerSizeAndOffset] (val x: Self) extends AnyVal {
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
    def setContainerSize(value: Double): Self = this.set("containerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

