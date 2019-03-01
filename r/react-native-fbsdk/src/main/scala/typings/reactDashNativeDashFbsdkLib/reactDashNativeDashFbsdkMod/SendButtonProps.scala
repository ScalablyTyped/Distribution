package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

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
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object SendButtonProps {
  @scala.inline
  def apply(shareContent: ShareContent, style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null): SendButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shareContent")(shareContent)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SendButtonProps]
  }
}

