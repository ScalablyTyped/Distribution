package typings.storybookAddonA11y.a11YPanelMod

import typings.storybookAddonA11y.storybookAddonA11yStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11YPanelErrorState extends A11YPanelState {
  var error: js.Any = js.native
  var status: error = js.native
}

object A11YPanelErrorState {
  @scala.inline
  def apply(error: js.Any, status: error): A11YPanelErrorState = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11YPanelErrorState]
  }
  @scala.inline
  implicit class A11YPanelErrorStateOps[Self <: A11YPanelErrorState] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: error): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

