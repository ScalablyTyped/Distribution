package typings.reactMdUtils.getCoordMod

import typings.std.ClientRect
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XCoordConfig extends js.Object {
  var containerRect: DOMRect | ClientRect = js.native
  var elWidth: Double = js.native
  var initialX: js.UndefOr[Double] = js.native
  var xMargin: Double = js.native
}

object XCoordConfig {
  @scala.inline
  def apply(containerRect: DOMRect | ClientRect, elWidth: Double, xMargin: Double): XCoordConfig = {
    val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], elWidth = elWidth.asInstanceOf[js.Any], xMargin = xMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCoordConfig]
  }
  @scala.inline
  implicit class XCoordConfigOps[Self <: XCoordConfig] (val x: Self) extends AnyVal {
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
    def setContainerRect(value: DOMRect | ClientRect): Self = this.set("containerRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setElWidth(value: Double): Self = this.set("elWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setXMargin(value: Double): Self = this.set("xMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialX: Self = this.set("initialX", js.undefined)
  }
  
}

