package typings.reactNativeFbsdk.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareButtonProps extends js.Object {
  /**
    * Content to be shared.
    */
  var shareContent: ShareContent = js.native
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.native
}

object ShareButtonProps {
  @scala.inline
  def apply(shareContent: ShareContent): ShareButtonProps = {
    val __obj = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareButtonProps]
  }
  @scala.inline
  implicit class ShareButtonPropsOps[Self <: ShareButtonProps] (val x: Self) extends AnyVal {
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
    def setShareContent(value: ShareContent): Self = this.set("shareContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

