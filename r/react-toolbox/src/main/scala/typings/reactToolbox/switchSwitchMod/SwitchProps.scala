package typings.reactToolbox.switchSwitchMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchProps extends Props {
  /**
    * If true, the switch will be enabled.
    * @default false
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The text string to use for the floating label element.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The text string used as name of the input.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback function that is fired when when the switch is blurred.
    */
  var onBlur: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when the component's value changes.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when the switch is focused.
    */
  var onFocus: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SwitchTheme] = js.native
}

object SwitchProps {
  @scala.inline
  def apply(): SwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchProps]
  }
  @scala.inline
  implicit class SwitchPropsOps[Self <: SwitchProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
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
    def setTheme(value: SwitchTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

