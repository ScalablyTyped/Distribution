package typings.reactGa.mod

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
    cookieExpires: js.UndefOr[Double] = js.undefined,
    cookieName: String = null,
    legacyCookieDomain: String = null,
    legacyHistoryImport: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    sampleRate: js.UndefOr[Double] = js.undefined,
    siteSpeedSampleRate: js.UndefOr[Double] = js.undefined,
    storage: String = null,
    storeGac: js.UndefOr[Boolean] = js.undefined,
    userId: String = null
  ): GaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnchor)) __obj.updateDynamic("allowAnchor")(allowAnchor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLinker)) __obj.updateDynamic("allowLinker")(allowLinker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysSendReferrer)) __obj.updateDynamic("alwaysSendReferrer")(alwaysSendReferrer.get.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieExpires)) __obj.updateDynamic("cookieExpires")(cookieExpires.get.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (legacyCookieDomain != null) __obj.updateDynamic("legacyCookieDomain")(legacyCookieDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyHistoryImport)) __obj.updateDynamic("legacyHistoryImport")(legacyHistoryImport.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(siteSpeedSampleRate)) __obj.updateDynamic("siteSpeedSampleRate")(siteSpeedSampleRate.get.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (!js.isUndefined(storeGac)) __obj.updateDynamic("storeGac")(storeGac.get.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaOptions]
  }
}

