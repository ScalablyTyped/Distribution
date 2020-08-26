package typings.reactToolbox.checkboxCheckboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxProps
  extends Props
     with /**
  * Additional properties passed to inner input element.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Value for the checkbox, can be true or false.
    * @default false
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, the checkbox shown as disabled and cannot be modified.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Text label to attach next to the checkbox element.
    */
  var label: js.UndefOr[ReactNode] = js.native
  /**
    * The name of the field to set in the input checkbox.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback called when the checkbox is blurred.
    */
  var onBlur: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the checkbox value is changed.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[CheckboxTheme] = js.native
}

object CheckboxProps {
  @scala.inline
  def apply(): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxProps]
  }
  @scala.inline
  implicit class CheckboxPropsOps[Self <: CheckboxProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
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
    def setTheme(value: CheckboxTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

