package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendButtonProps extends js.Object {
  /**
    * Content to be shared.
    */
  var shareContent: ShareContent
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
}

object SendButtonProps {
  @scala.inline
  def apply(shareContent: ShareContent, style: ViewStyle = null): SendButtonProps = {
    val __obj = js.Dynamic.literal(shareContent = shareContent)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SendButtonProps]
  }
}

