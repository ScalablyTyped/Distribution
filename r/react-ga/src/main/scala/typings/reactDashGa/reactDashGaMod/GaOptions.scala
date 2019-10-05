package typings.reactDashGa.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaOptions extends js.Object {
  var allowAnchor: js.UndefOr[Boolean] = js.undefined
  var allowLinker: js.UndefOr[Boolean] = js.undefined
  var alwaysSendReferrer: js.UndefOr[Boolean] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var cookieDomain: js.UndefOr[String] = js.undefined
  var cookieExpires: js.UndefOr[Double] = js.undefined
  var cookieName: js.UndefOr[String] = js.undefined
  var legacyCookieDomain: js.UndefOr[String] = js.undefined
  var legacyHistoryImport: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var siteSpeedSampleRate: js.UndefOr[Double] = js.undefined
  var storage: js.UndefOr[String] = js.undefined
  var storeGac: js.UndefOr[Boolean] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object GaOptions {
  @scala.inline
  def apply(
    allowAnchor: js.UndefOr[Boolean] = js.undefined,
    allowLinker: js.UndefOr[Boolean] = js.undefined,
    alwaysSendReferrer: js.UndefOr[Boolean] = js.undefined,
    clientId: String = null,
    cookieDomain: String = null,
    cookieExpires: Int | Double = null,
    cookieName: String = null,
    legacyCookieDomain: String = null,
    legacyHistoryImport: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    sampleRate: Int | Double = null,
    siteSpeedSampleRate: Int | Double = null,
    storage: String = null,
    storeGac: js.UndefOr[Boolean] = js.undefined,
    userId: String = null
  ): GaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnchor)) __obj.updateDynamic("allowAnchor")(allowAnchor)
    if (!js.isUndefined(allowLinker)) __obj.updateDynamic("allowLinker")(allowLinker)
    if (!js.isUndefined(alwaysSendReferrer)) __obj.updateDynamic("alwaysSendReferrer")(alwaysSendReferrer)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain)
    if (cookieExpires != null) __obj.updateDynamic("cookieExpires")(cookieExpires.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName)
    if (legacyCookieDomain != null) __obj.updateDynamic("legacyCookieDomain")(legacyCookieDomain)
    if (!js.isUndefined(legacyHistoryImport)) __obj.updateDynamic("legacyHistoryImport")(legacyHistoryImport)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (siteSpeedSampleRate != null) __obj.updateDynamic("siteSpeedSampleRate")(siteSpeedSampleRate.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (!js.isUndefined(storeGac)) __obj.updateDynamic("storeGac")(storeGac)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[GaOptions]
  }
}

