package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOptions extends js.Object {
  var dialogTitle: js.UndefOr[java.lang.String] = js.undefined
  var excludedActivityTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
}

object ShareOptions {
  @scala.inline
  def apply(
    dialogTitle: java.lang.String = null,
    excludedActivityTypes: js.Array[java.lang.String] = null,
    subject: java.lang.String = null,
    tintColor: java.lang.String = null
  ): ShareOptions = {
    val __obj = js.Dynamic.literal()
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle)
    if (excludedActivityTypes != null) __obj.updateDynamic("excludedActivityTypes")(excludedActivityTypes)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[ShareOptions]
  }
}

