package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeOptions extends js.Object {
  var alwaysSendToDefaultTracker: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var gaAddress: js.UndefOr[java.lang.String] = js.undefined
  var gaOptions: js.UndefOr[GaOptions] = js.undefined
  var standardImplementation: js.UndefOr[scala.Boolean] = js.undefined
  var testMode: js.UndefOr[scala.Boolean] = js.undefined
  var titleCase: js.UndefOr[scala.Boolean] = js.undefined
}

object InitializeOptions {
  @scala.inline
  def apply(
    alwaysSendToDefaultTracker: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    gaAddress: java.lang.String = null,
    gaOptions: GaOptions = null,
    standardImplementation: js.UndefOr[scala.Boolean] = js.undefined,
    testMode: js.UndefOr[scala.Boolean] = js.undefined,
    titleCase: js.UndefOr[scala.Boolean] = js.undefined
  ): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysSendToDefaultTracker)) __obj.updateDynamic("alwaysSendToDefaultTracker")(alwaysSendToDefaultTracker)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (gaAddress != null) __obj.updateDynamic("gaAddress")(gaAddress)
    if (gaOptions != null) __obj.updateDynamic("gaOptions")(gaOptions)
    if (!js.isUndefined(standardImplementation)) __obj.updateDynamic("standardImplementation")(standardImplementation)
    if (!js.isUndefined(testMode)) __obj.updateDynamic("testMode")(testMode)
    if (!js.isUndefined(titleCase)) __obj.updateDynamic("titleCase")(titleCase)
    __obj.asInstanceOf[InitializeOptions]
  }
}

