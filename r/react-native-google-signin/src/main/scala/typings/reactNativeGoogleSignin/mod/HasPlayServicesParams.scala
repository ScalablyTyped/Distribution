package typings.reactNativeGoogleSignin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasPlayServicesParams extends js.Object {
  /**
    * When showPlayServicesUpdateDialog is true, the user will be prompted to
    * install Play Services if on Android and they are not installed.
    * Default is true
    */
  var showPlayServicesUpdateDialog: js.UndefOr[Boolean] = js.native
}

object HasPlayServicesParams {
  @scala.inline
  def apply(): HasPlayServicesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasPlayServicesParams]
  }
  @scala.inline
  implicit class HasPlayServicesParamsOps[Self <: HasPlayServicesParams] (val x: Self) extends AnyVal {
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
    def setShowPlayServicesUpdateDialog(value: Boolean): Self = this.set("showPlayServicesUpdateDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPlayServicesUpdateDialog: Self = this.set("showPlayServicesUpdateDialog", js.undefined)
  }
  
}

