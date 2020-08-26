package typings.reactMdUtils.createHorizontalPositionMod

import typings.reactMdUtils.typesMod.HorizontalPosition
import typings.std.ClientRect
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@react-md/utils.@react-md/utils/types/positioning/createHorizontalPosition.Options, 'x' | 'vw' | 'elWidth' | 'xMargin' | 'vwMargin' | 'containerRect' | 'initialX'> */
@js.native
trait EqualWidthOptions extends js.Object {
  var containerRect: DOMRect | ClientRect = js.native
  var elWidth: Double = js.native
  var initialX: js.UndefOr[Double] = js.native
  var isMinWidth: Boolean = js.native
  var vw: Double = js.native
  var vwMargin: Double = js.native
  var x: HorizontalPosition = js.native
  var xMargin: Double = js.native
}

object EqualWidthOptions {
  @scala.inline
  def apply(
    containerRect: DOMRect | ClientRect,
    elWidth: Double,
    isMinWidth: Boolean,
    vw: Double,
    vwMargin: Double,
    x: HorizontalPosition,
    xMargin: Double
  ): EqualWidthOptions = {
    val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], elWidth = elWidth.asInstanceOf[js.Any], isMinWidth = isMinWidth.asInstanceOf[js.Any], vw = vw.asInstanceOf[js.Any], vwMargin = vwMargin.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xMargin = xMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualWidthOptions]
  }
  @scala.inline
  implicit class EqualWidthOptionsOps[Self <: EqualWidthOptions] (val x: Self) extends AnyVal {
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
    def setIsMinWidth(value: Boolean): Self = this.set("isMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setVw(value: Double): Self = this.set("vw", value.asInstanceOf[js.Any])
    @scala.inline
    def setVwMargin(value: Double): Self = this.set("vwMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: HorizontalPosition): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXMargin(value: Double): Self = this.set("xMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialX: Self = this.set("initialX", js.undefined)
  }
  
}

