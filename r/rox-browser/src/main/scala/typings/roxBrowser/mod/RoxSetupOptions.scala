package typings.roxBrowser.mod

import typings.roxBrowser.roxBrowserStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoxSetupOptions extends js.Object {
  // https://support.rollout.io/docs/javascript-browser-api#section-configurationfetchedhandler
  var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.native
  var debugLevel: js.UndefOr[verbose] = js.native
  var devModeSecret: js.UndefOr[String] = js.native
  var disableNetworkFetch: js.UndefOr[Boolean] = js.native
  var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.native
  // https://support.rollout.io/docs/javascript-browser-api#section-using-the-impressionhandler-option
  var impressionHandler: js.UndefOr[
    js.Function3[
      /* reporting */ RoxReporting, 
      /* experiment */ RoxExperiment, 
      /* context */ js.Any, 
      Unit
    ]
  ] = js.native
  var platform: js.UndefOr[String] = js.native
  /**
    * Set Roxy's URL for automated tests or local development.
    *
    * https://support.rollout.io/docs/microservices-automated-testing-and-local-development
    */
  var roxy: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object RoxSetupOptions {
  @scala.inline
  def apply(): RoxSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoxSetupOptions]
  }
  @scala.inline
  implicit class RoxSetupOptionsOps[Self <: RoxSetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationFetchedHandler(value: /* fetcherResult */ RoxFetcherResult => Unit): Self = this.set("configurationFetchedHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConfigurationFetchedHandler: Self = this.set("configurationFetchedHandler", js.undefined)
    @scala.inline
    def setDebugLevel(value: verbose): Self = this.set("debugLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugLevel: Self = this.set("debugLevel", js.undefined)
    @scala.inline
    def setDevModeSecret(value: String): Self = this.set("devModeSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevModeSecret: Self = this.set("devModeSecret", js.undefined)
    @scala.inline
    def setDisableNetworkFetch(value: Boolean): Self = this.set("disableNetworkFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableNetworkFetch: Self = this.set("disableNetworkFetch", js.undefined)
    @scala.inline
    def setFreeze(value: RoxFlagFreezeLevel): Self = this.set("freeze", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeze: Self = this.set("freeze", js.undefined)
    @scala.inline
    def setImpressionHandler(
      value: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit
    ): Self = this.set("impressionHandler", js.Any.fromFunction3(value))
    @scala.inline
    def deleteImpressionHandler: Self = this.set("impressionHandler", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setRoxy(value: String): Self = this.set("roxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoxy: Self = this.set("roxy", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

