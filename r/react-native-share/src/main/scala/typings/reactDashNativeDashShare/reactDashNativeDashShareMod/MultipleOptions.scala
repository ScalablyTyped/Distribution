package typings.reactDashNativeDashShare.reactDashNativeDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleOptions extends js.Object {
  var excludedActivityTypes: js.UndefOr[String] = js.undefined
  var failOnCancel: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var showAppsToView: js.UndefOr[Boolean] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.Array[String]
}

object MultipleOptions {
  @scala.inline
  def apply(
    urls: js.Array[String],
    excludedActivityTypes: String = null,
    failOnCancel: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    showAppsToView: js.UndefOr[Boolean] = js.undefined,
    subject: String = null,
    title: String = null,
    `type`: String = null,
    url: String = null
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

