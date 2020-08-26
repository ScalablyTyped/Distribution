package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlickGridCheckBoxSelectColumnOptions extends PluginOptions {
  /**
    * Column to add the checkbox to
    * @default "_checkbox_selector"
    */
  var columnId: js.UndefOr[String] = js.native
  /**
    * CSS class to be added to cells in this column
    * @default null
    */
  var cssClass: js.UndefOr[String] = js.native
  /**
    * Tooltip text to display for this column
    * @default "Select/Deselect All"
    */
  var toolTip: js.UndefOr[String] = js.native
  /**
    * Width of the column
    * @default 30
    */
  var width: js.UndefOr[Double] = js.native
}

object SlickGridCheckBoxSelectColumnOptions {
  @scala.inline
  def apply(): SlickGridCheckBoxSelectColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickGridCheckBoxSelectColumnOptions]
  }
  @scala.inline
  implicit class SlickGridCheckBoxSelectColumnOptionsOps[Self <: SlickGridCheckBoxSelectColumnOptions] (val x: Self) extends AnyVal {
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
    def setColumnId(value: String): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnId: Self = this.set("columnId", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

