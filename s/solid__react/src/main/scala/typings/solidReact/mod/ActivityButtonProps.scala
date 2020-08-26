package typings.solidReact.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityButtonProps extends js.Object {
  var activateLabel: js.UndefOr[String | (js.Tuple3[String, String, ReactNode])] = js.native
  var activateText: js.UndefOr[String] = js.native
  var deactivateLabel: js.UndefOr[String | (js.Tuple3[String, String, ReactNode])] = js.native
  var deactivateText: js.UndefOr[String] = js.native
  var `object`: js.UndefOr[String] = js.native
  var shortName: js.UndefOr[String] = js.native
}

object ActivityButtonProps {
  @scala.inline
  def apply(): ActivityButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityButtonProps]
  }
  @scala.inline
  implicit class ActivityButtonPropsOps[Self <: ActivityButtonProps] (val x: Self) extends AnyVal {
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
    def setActivateLabel(value: String | (js.Tuple3[String, String, ReactNode])): Self = this.set("activateLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivateLabel: Self = this.set("activateLabel", js.undefined)
    @scala.inline
    def setActivateText(value: String): Self = this.set("activateText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivateText: Self = this.set("activateText", js.undefined)
    @scala.inline
    def setDeactivateLabel(value: String | (js.Tuple3[String, String, ReactNode])): Self = this.set("deactivateLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeactivateLabel: Self = this.set("deactivateLabel", js.undefined)
    @scala.inline
    def setDeactivateText(value: String): Self = this.set("deactivateText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeactivateText: Self = this.set("deactivateText", js.undefined)
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
  }
  
}

