package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomNavigationAction extends js.Object {
  var active: Boolean = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: Element | String = js.native
  var key: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[Active] = js.native
  var testID: js.UndefOr[String] = js.native
}

object BottomNavigationAction {
  @scala.inline
  def apply(active: Boolean, icon: Element | String): BottomNavigationAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomNavigationAction]
  }
  @scala.inline
  implicit class BottomNavigationActionOps[Self <: BottomNavigationAction] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: Element | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setStyle(value: Active): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
  }
  
}

