package typings.reactFacebookLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactFacebookLoginState extends js.Object {
  var isProcessing: js.UndefOr[Boolean] = js.native
  var isSdkLoaded: js.UndefOr[Boolean] = js.native
}

object ReactFacebookLoginState {
  @scala.inline
  def apply(): ReactFacebookLoginState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactFacebookLoginState]
  }
  @scala.inline
  implicit class ReactFacebookLoginStateOps[Self <: ReactFacebookLoginState] (val x: Self) extends AnyVal {
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
    def setIsProcessing(value: Boolean): Self = this.set("isProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsProcessing: Self = this.set("isProcessing", js.undefined)
    @scala.inline
    def setIsSdkLoaded(value: Boolean): Self = this.set("isSdkLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSdkLoaded: Self = this.set("isSdkLoaded", js.undefined)
  }
  
}

