package typings.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerSize extends js.Object {
  var align: String = js.native
  var containerSize: Double = js.native
  var currentOffset: Double = js.native
  var targetIndex: Double = js.native
}

object ContainerSize {
  @scala.inline
  def apply(align: String, containerSize: Double, currentOffset: Double, targetIndex: Double): ContainerSize = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], currentOffset = currentOffset.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSize]
  }
  @scala.inline
  implicit class ContainerSizeOps[Self <: ContainerSize] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerSize(value: Double): Self = this.set("containerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentOffset(value: Double): Self = this.set("currentOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetIndex(value: Double): Self = this.set("targetIndex", value.asInstanceOf[js.Any])
  }
  
}

