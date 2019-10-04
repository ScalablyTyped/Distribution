package typings.roxDashNode.roxDashNodeMod

import typings.roxDashNode.roxDashNodeStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxSetupOptions extends js.Object {
  // https://support.rollout.io/docs/configuration-fetched-handler
  var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
  var debugLevel: js.UndefOr[verbose] = js.undefined
  var devModeSecret: js.UndefOr[String] = js.undefined
  var disableNetworkFetch: js.UndefOr[Boolean] = js.undefined
  var fetchIntervalInSec: js.UndefOr[Double] = js.undefined
  // https://support.rollout.io/docs/nodejs-api#section-using-the-impressionhandler-option
  var impressionHandler: js.UndefOr[
    js.Function3[
      /* reporting */ RoxReporting, 
      /* experiment */ RoxExperiment, 
      /* context */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object RoxSetupOptions {
  @scala.inline
  def apply(
    configurationFetchedHandler: /* fetcherResult */ RoxFetcherResult => Unit = null,
    debugLevel: verbose = null,
    devModeSecret: String = null,
    disableNetworkFetch: js.UndefOr[Boolean] = js.undefined,
    fetchIntervalInSec: Int | Double = null,
    impressionHandler: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit = null,
    platform: String = null,
    version: String = null
  ): RoxSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (configurationFetchedHandler != null) __obj.updateDynamic("configurationFetchedHandler")(js.Any.fromFunction1(configurationFetchedHandler))
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel)
    if (devModeSecret != null) __obj.updateDynamic("devModeSecret")(devModeSecret)
    if (!js.isUndefined(disableNetworkFetch)) __obj.updateDynamic("disableNetworkFetch")(disableNetworkFetch)
    if (fetchIntervalInSec != null) __obj.updateDynamic("fetchIntervalInSec")(fetchIntervalInSec.asInstanceOf[js.Any])
    if (impressionHandler != null) __obj.updateDynamic("impressionHandler")(js.Any.fromFunction3(impressionHandler))
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[RoxSetupOptions]
  }
}

