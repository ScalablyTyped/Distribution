package typings.reactDashNativeDashShare.reactDashNativeDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var excludedActivityTypes: js.UndefOr[String] = js.undefined
  var failOnCancel: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var showAppsToView: js.UndefOr[Boolean] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    excludedActivityTypes: String = null,
    failOnCancel: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    showAppsToView: js.UndefOr[Boolean] = js.undefined,
    subject: String = null,
    title: String = null,
    `type`: String = null,
    url: String = null,
    urls: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (excludedActivityTypes != null) __obj.updateDynamic("excludedActivityTypes")(excludedActivityTypes)
    if (!js.isUndefined(failOnCancel)) __obj.updateDynamic("failOnCancel")(failOnCancel)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(showAppsToView)) __obj.updateDynamic("showAppsToView")(showAppsToView)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[Options]
  }
}

