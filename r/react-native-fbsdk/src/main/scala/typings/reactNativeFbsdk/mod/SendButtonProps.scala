package typings.reactNativeFbsdk.mod

import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendButtonProps]
  }
}

