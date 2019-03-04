package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareButtonProps extends js.Object {
  /**
    * Content to be shared.
    */
  var shareContent: ShareContent
  /**
    * View style, if any.
    */
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object ShareButtonProps {
  @scala.inline
  def apply(shareContent: ShareContent, style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null): ShareButtonProps = {
    val __obj = js.Dynamic.literal(shareContent = shareContent)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ShareButtonProps]
  }
}

