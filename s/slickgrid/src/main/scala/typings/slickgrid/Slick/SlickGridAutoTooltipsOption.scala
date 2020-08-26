package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlickGridAutoTooltipsOption extends PluginOptions {
  /**
    * Enable tooltip for grid cells
    * @default true
    */
  var enableForCells: js.UndefOr[Boolean] = js.native
  /**
    * Enable tooltip for header cells
    * @default false
    */
  var enableForHeaderCells: js.UndefOr[Boolean] = js.native
  /**
    * The maximum length for a tooltip
    * @default null
    */
  var maxToolTipLength: js.UndefOr[Double] = js.native
}

object SlickGridAutoTooltipsOption {
  @scala.inline
  def apply(): SlickGridAutoTooltipsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickGridAutoTooltipsOption]
  }
  @scala.inline
  implicit class SlickGridAutoTooltipsOptionOps[Self <: SlickGridAutoTooltipsOption] (val x: Self) extends AnyVal {
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
    def setEnableForCells(value: Boolean): Self = this.set("enableForCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableForCells: Self = this.set("enableForCells", js.undefined)
    @scala.inline
    def setEnableForHeaderCells(value: Boolean): Self = this.set("enableForHeaderCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableForHeaderCells: Self = this.set("enableForHeaderCells", js.undefined)
    @scala.inline
    def setMaxToolTipLength(value: Double): Self = this.set("maxToolTipLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxToolTipLength: Self = this.set("maxToolTipLength", js.undefined)
  }
  
}

