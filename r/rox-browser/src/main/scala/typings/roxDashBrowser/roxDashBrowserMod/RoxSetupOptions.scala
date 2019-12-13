package typings.roxDashBrowser.roxDashBrowserMod

import typings.roxDashBrowser.roxDashBrowserStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxSetupOptions extends js.Object {
  // https://support.rollout.io/docs/javascript-browser-api#section-configurationfetchedhandler
  var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
  var debugLevel: js.UndefOr[verbose] = js.undefined
  var devModeSecret: js.UndefOr[String] = js.undefined
  var disableNetworkFetch: js.UndefOr[Boolean] = js.undefined
  var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.undefined
  // https://support.rollout.io/docs/javascript-browser-api#section-using-the-impressionhandler-option
  var impressionHandler: js.UndefOr[
    js.Function3[
      /* reporting */ RoxReporting, 
      /* experiment */ RoxExperiment, 
      /* context */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  /**
    * Set Roxy's URL for automated tests or local development.
    *
    * https://support.rollout.io/docs/microservices-automated-testing-and-local-development
    */
  var roxy: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object RoxSetupOptions {
  @scala.inline
  def apply(
    configurationFetchedHandler: /* fetcherResult */ RoxFetcherResult => Unit = null,
    debugLevel: verbose = null,
    devModeSecret: String = null,
    disableNetworkFetch: js.UndefOr[Boolean] = js.undefined,
    freeze: RoxFlagFreezeLevel = null,
    impressionHandler: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit = null,
    platform: String = null,
    roxy: String = null,
    version: String = null
  ): RoxSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (configurationFetchedHandler != null) __obj.updateDynamic("configurationFetchedHandler")(js.Any.fromFunction1(configurationFetchedHandler))
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel.asInstanceOf[js.Any])
    if (devModeSecret != null) __obj.updateDynamic("devModeSecret")(devModeSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNetworkFetch)) __obj.updateDynamic("disableNetworkFetch")(disableNetworkFetch.asInstanceOf[js.Any])
    if (freeze != null) __obj.updateDynamic("freeze")(freeze.asInstanceOf[js.Any])
    if (impressionHandler != null) __obj.updateDynamic("impressionHandler")(js.Any.fromFunction3(impressionHandler))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (roxy != null) __obj.updateDynamic("roxy")(roxy.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoxSetupOptions]
  }
}

