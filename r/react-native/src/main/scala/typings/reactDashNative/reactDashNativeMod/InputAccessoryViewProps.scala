package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputAccessoryViewProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * An ID which is used to associate this InputAccessoryView to specified TextInput(s).
    */
  var nativeID: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object InputAccessoryViewProps {
  @scala.inline
  def apply(backgroundColor: String = null, nativeID: String = null, style: StyleProp[ViewStyle] = null): InputAccessoryViewProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAccessoryViewProps]
  }
}

