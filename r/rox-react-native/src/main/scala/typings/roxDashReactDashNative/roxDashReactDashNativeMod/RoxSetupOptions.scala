package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxSetupOptions extends js.Object {
  // https://support.rollout.io/docs/reactnative#section--asyncstorage-
  var AsyncStorage: js.UndefOr[js.Any] = js.undefined
  // https://support.rollout.io/docs/reactnative#section-configurationfetchedhandler
  var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
  var debugLevel: js.UndefOr[verbose] = js.undefined
  var devModeSecret: js.UndefOr[String] = js.undefined
  var disableNetworkFetch: js.UndefOr[Boolean] = js.undefined
  var freeze: js.UndefOr[FreezeOptions] = js.undefined
  // https://support.rollout.io/docs/reactnative#section-using-the-impressionhandler-option
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
    AsyncStorage: js.Any = null,
    configurationFetchedHandler: /* fetcherResult */ RoxFetcherResult => Unit = null,
    debugLevel: verbose = null,
    devModeSecret: String = null,
    disableNetworkFetch: js.UndefOr[Boolean] = js.undefined,
    freeze: FreezeOptions = null,
    impressionHandler: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit = null,
    platform: String = null,
    version: String = null
  ): RoxSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (AsyncStorage != null) __obj.updateDynamic("AsyncStorage")(AsyncStorage)
    if (configurationFetchedHandler != null) __obj.updateDynamic("configurationFetchedHandler")(js.Any.fromFunction1(configurationFetchedHandler))
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel)
    if (devModeSecret != null) __obj.updateDynamic("devModeSecret")(devModeSecret)
    if (!js.isUndefined(disableNetworkFetch)) __obj.updateDynamic("disableNetworkFetch")(disableNetworkFetch)
    if (freeze != null) __obj.updateDynamic("freeze")(freeze)
    if (impressionHandler != null) __obj.updateDynamic("impressionHandler")(js.Any.fromFunction3(impressionHandler))
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[RoxSetupOptions]
  }
}

