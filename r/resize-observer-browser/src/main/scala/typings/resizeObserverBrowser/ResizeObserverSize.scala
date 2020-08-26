package typings.resizeObserverBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserverSize extends js.Object {
  var blockSize: Double = js.native
  var inlineSize: Double = js.native
}

object ResizeObserverSize {
  @scala.inline
  def apply(blockSize: Double, inlineSize: Double): ResizeObserverSize = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], inlineSize = inlineSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverSize]
  }
  @scala.inline
  implicit class ResizeObserverSizeOps[Self <: ResizeObserverSize] (val x: Self) extends AnyVal {
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
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineSize(value: Double): Self = this.set("inlineSize", value.asInstanceOf[js.Any])
  }
  
}

