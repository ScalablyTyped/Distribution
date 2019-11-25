package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOptions extends js.Object {
  var dialogTitle: js.UndefOr[String] = js.undefined
  var excludedActivityTypes: js.UndefOr[js.Array[String]] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
}

object ShareOptions {
  @scala.inline
  def apply(
    dialogTitle: String = null,
    excludedActivityTypes: js.Array[String] = null,
    subject: String = null,
    tintColor: String = null
  ): ShareOptions = {
    val __obj = js.Dynamic.literal()
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle.asInstanceOf[js.Any])
    if (excludedActivityTypes != null) __obj.updateDynamic("excludedActivityTypes")(excludedActivityTypes.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOptions]
  }
}

