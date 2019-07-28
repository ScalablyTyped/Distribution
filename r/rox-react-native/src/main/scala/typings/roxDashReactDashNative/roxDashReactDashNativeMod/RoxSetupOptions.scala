package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.none
import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.untilLaunch
import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxSetupOptions extends js.Object {
  // https://support.rollout.io/docs/javascript-browser-api#section-configurationfetchedhandler
  var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
  var debugLevel: js.UndefOr[verbose] = js.undefined
  var freeze: js.UndefOr[untilLaunch | none] = js.undefined
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
  var version: js.UndefOr[String] = js.undefined
}

object RoxSetupOptions {
  @scala.inline
  def apply(
    configurationFetchedHandler: /* fetcherResult */ RoxFetcherResult => Unit = null,
    debugLevel: verbose = null,
    freeze: untilLaunch | none = null,
    impressionHandler: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit = null,
    platform: String = null,
    version: String = null
  ): RoxSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (configurationFetchedHandler != null) __obj.updateDynamic("configurationFetchedHandler")(js.Any.fromFunction1(configurationFetchedHandler))
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel)
    if (freeze != null) __obj.updateDynamic("freeze")(freeze.asInstanceOf[js.Any])
    if (impressionHandler != null) __obj.updateDynamic("impressionHandler")(js.Any.fromFunction3(impressionHandler))
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[RoxSetupOptions]
  }
}

