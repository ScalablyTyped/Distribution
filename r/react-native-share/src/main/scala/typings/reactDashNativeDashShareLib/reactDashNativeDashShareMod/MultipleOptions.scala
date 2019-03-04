package typings
package reactDashNativeDashShareLib.reactDashNativeDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleOptions extends js.Object {
  var excludedActivityTypes: js.UndefOr[java.lang.String] = js.undefined
  var failOnCancel: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var showAppsToView: js.UndefOr[scala.Boolean] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.Array[java.lang.String]
}

object MultipleOptions {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    excludedActivityTypes: java.lang.String = null,
    failOnCancel: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    showAppsToView: js.UndefOr[scala.Boolean] = js.undefined,
    subject: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
  ): MultipleOptions = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (excludedActivityTypes != null) __obj.updateDynamic("excludedActivityTypes")(excludedActivityTypes)
    if (!js.isUndefined(failOnCancel)) __obj.updateDynamic("failOnCancel")(failOnCancel)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(showAppsToView)) __obj.updateDynamic("showAppsToView")(showAppsToView)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MultipleOptions]
  }
}

