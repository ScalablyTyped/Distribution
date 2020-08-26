package typings.reactToolbox.listCheckboxMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCheckboxProps extends Props {
  /**
    * Main text of the item. Required.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * If true the checkbox appears checked by default.
    * @default false
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * If true, the item is displayed as disabled and it's not clickable.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[String] = js.native
  /**
    * Name for the checkbox input item.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback called when the input element is blurred.
    */
  var onBlur: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the input element is changed.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the input element is focused.
    */
  var onFocus: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ListCheckboxTheme] = js.native
}

object ListCheckboxProps {
  @scala.inline
  def apply(): ListCheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCheckboxProps]
  }
  @scala.inline
  implicit class ListCheckboxPropsOps[Self <: ListCheckboxProps] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLegend(value: String): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: js.Function): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: js.Function): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setTheme(value: ListCheckboxTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

