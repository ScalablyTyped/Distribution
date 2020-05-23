package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeOptions extends js.Object {
  var alwaysSendToDefaultTracker: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var gaAddress: js.UndefOr[String] = js.undefined
  var gaOptions: js.UndefOr[GaOptions] = js.undefined
  var standardImplementation: js.UndefOr[Boolean] = js.undefined
  var testMode: js.UndefOr[Boolean] = js.undefined
  var titleCase: js.UndefOr[Boolean] = js.undefined
}

object InitializeOptions {
  @scala.inline
  def apply(
    alwaysSendToDefaultTracker: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    gaAddress: String = null,
    gaOptions: GaOptions = null,
    standardImplementation: js.UndefOr[Boolean] = js.undefined,
    testMode: js.UndefOr[Boolean] = js.undefined,
    titleCase: js.UndefOr[Boolean] = js.undefined
  ): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysSendToDefaultTracker)) __obj.updateDynamic("alwaysSendToDefaultTracker")(alwaysSendToDefaultTracker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (gaAddress != null) __obj.updateDynamic("gaAddress")(gaAddress.asInstanceOf[js.Any])
    if (gaOptions != null) __obj.updateDynamic("gaOptions")(gaOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(standardImplementation)) __obj.updateDynamic("standardImplementation")(standardImplementation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(testMode)) __obj.updateDynamic("testMode")(testMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleCase)) __obj.updateDynamic("titleCase")(titleCase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeOptions]
  }
}

