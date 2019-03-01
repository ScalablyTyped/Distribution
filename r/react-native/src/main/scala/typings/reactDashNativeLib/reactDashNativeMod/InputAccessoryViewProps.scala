package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputAccessoryViewProps extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An ID which is used to associate this InputAccessoryView to specified TextInput(s).
    */
  var nativeID: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object InputAccessoryViewProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    nativeID: java.lang.String = null,
    style: StyleProp[ViewStyle] = null
  ): InputAccessoryViewProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAccessoryViewProps]
  }
}

