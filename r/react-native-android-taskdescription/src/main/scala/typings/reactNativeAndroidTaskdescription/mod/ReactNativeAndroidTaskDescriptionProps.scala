package typings.reactNativeAndroidTaskdescription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativeAndroidTaskDescriptionProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
}

object ReactNativeAndroidTaskDescriptionProps {
  @scala.inline
  def apply(): ReactNativeAndroidTaskDescriptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativeAndroidTaskDescriptionProps]
  }
  @scala.inline
  implicit class ReactNativeAndroidTaskDescriptionPropsOps[Self <: ReactNativeAndroidTaskDescriptionProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

