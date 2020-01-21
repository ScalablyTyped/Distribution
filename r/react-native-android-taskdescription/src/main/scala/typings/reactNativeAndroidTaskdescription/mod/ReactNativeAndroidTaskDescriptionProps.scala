package typings.reactNativeAndroidTaskdescription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeAndroidTaskDescriptionProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object ReactNativeAndroidTaskDescriptionProps {
  @scala.inline
  def apply(backgroundColor: String = null, label: String = null): ReactNativeAndroidTaskDescriptionProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativeAndroidTaskDescriptionProps]
  }
}

