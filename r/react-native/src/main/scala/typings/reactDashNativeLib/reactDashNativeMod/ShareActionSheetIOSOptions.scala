package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareActionSheetIOSOptions extends js.Object {
  /** The activities to exclude from the ActionSheet.
    * For example: ['com.apple.UIKit.activity.PostToTwitter']
    */
  var excludedActivityTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ShareActionSheetIOSOptions {
  @scala.inline
  def apply(
    excludedActivityTypes: js.Array[java.lang.String] = null,
    message: java.lang.String = null,
    subject: java.lang.String = null,
    url: java.lang.String = null
  ): ShareActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal()
    if (excludedActivityTypes != null) __obj.updateDynamic("excludedActivityTypes")(excludedActivityTypes)
    if (message != null) __obj.updateDynamic("message")(message)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ShareActionSheetIOSOptions]
  }
}

