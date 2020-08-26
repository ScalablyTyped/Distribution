package typings.semanticUiReact.dropdownSearchInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictDropdownSearchInputProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** An input can have the auto complete. */
  var autoComplete: js.UndefOr[String] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** An input can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.native
  /** The HTML input type. */
  var `type`: js.UndefOr[String] = js.native
  /** Stored value. */
  var value: js.UndefOr[Double | String] = js.native
}

object StrictDropdownSearchInputProps {
  @scala.inline
  def apply(): StrictDropdownSearchInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictDropdownSearchInputProps]
  }
  @scala.inline
  implicit class StrictDropdownSearchInputPropsOps[Self <: StrictDropdownSearchInputProps] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setTabIndex(value: Double | String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

