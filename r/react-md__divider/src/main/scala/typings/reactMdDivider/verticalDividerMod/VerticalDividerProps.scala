package typings.reactMdDivider.verticalDividerMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalDividerProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The max height for the vertical divider. This number **must** be greater
    * than 0 to work correctly.
    *
    * When the value is between 0 and 1, it will be used as a multiplier with the
    * parent element's height. When the value is greater than 1, it will be used
    * in `Math.min(parentElementHeight, maxHeight)`.
    */
  var maxHeight: js.UndefOr[Double] = js.native
}

object VerticalDividerProps {
  @scala.inline
  def apply(): VerticalDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalDividerProps]
  }
  @scala.inline
  implicit class VerticalDividerPropsOps[Self <: VerticalDividerProps] (val x: Self) extends AnyVal {
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
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
  }
  
}

