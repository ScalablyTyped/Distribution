package typings.reactDashNativeDashAndroidDashTaskdescription.reactDashNativeDashAndroidDashTaskdescriptionMod

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
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ReactNativeAndroidTaskDescriptionProps]
  }
}

