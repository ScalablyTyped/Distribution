package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaOptions extends js.Object {
  var allowAnchor: js.UndefOr[scala.Boolean] = js.undefined
  var allowLinker: js.UndefOr[scala.Boolean] = js.undefined
  var alwaysSendReferrer: js.UndefOr[scala.Boolean] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var cookieDomain: js.UndefOr[java.lang.String] = js.undefined
  var cookieExpires: js.UndefOr[scala.Double] = js.undefined
  var cookieName: js.UndefOr[java.lang.String] = js.undefined
  var legacyCookieDomain: js.UndefOr[java.lang.String] = js.undefined
  var legacyHistoryImport: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  var siteSpeedSampleRate: js.UndefOr[scala.Double] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object GaOptions {
  @scala.inline
  def apply(
    allowAnchor: js.UndefOr[scala.Boolean] = js.undefined,
    allowLinker: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysSendReferrer: js.UndefOr[scala.Boolean] = js.undefined,
    clientId: java.lang.String = null,
    cookieDomain: java.lang.String = null,
    cookieExpires: scala.Int | scala.Double = null,
    cookieName: java.lang.String = null,
    legacyCookieDomain: java.lang.String = null,
    legacyHistoryImport: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    sampleRate: scala.Int | scala.Double = null,
    siteSpeedSampleRate: scala.Int | scala.Double = null,
    userId: java.lang.String = null
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
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[GaOptions]
  }
}

