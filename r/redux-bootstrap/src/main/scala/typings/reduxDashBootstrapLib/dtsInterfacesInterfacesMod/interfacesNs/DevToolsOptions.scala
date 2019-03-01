package typings
package reduxDashBootstrapLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevToolsOptions extends js.Object {
  var actionBlacklist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var actionCreators: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  var actionSanitizer: js.UndefOr[js.Function] = js.undefined
  var actionWhitelist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var autoPause: js.UndefOr[scala.Boolean] = js.undefined
  var features: js.UndefOr[js.Object] = js.undefined
  var latency: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pauseActionType: js.UndefOr[java.lang.String] = js.undefined
  var predicate: js.UndefOr[js.Function] = js.undefined
  var serialize: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var shouldHotReload: js.UndefOr[scala.Boolean] = js.undefined
  var shouldRecordChanges: js.UndefOr[scala.Boolean] = js.undefined
  var shouldStartLocked: js.UndefOr[scala.Boolean] = js.undefined
  var stateSanitizer: js.UndefOr[js.Function] = js.undefined
}

object DevToolsOptions {
  @scala.inline
  def apply(
    actionBlacklist: java.lang.String | js.Array[java.lang.String] = null,
    actionCreators: js.Array[_] | js.Object = null,
    actionSanitizer: js.Function = null,
    actionWhitelist: java.lang.String | js.Array[java.lang.String] = null,
    autoPause: js.UndefOr[scala.Boolean] = js.undefined,
    features: js.Object = null,
    latency: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pauseActionType: java.lang.String = null,
    predicate: js.Function = null,
    serialize: scala.Boolean | js.Object = null,
    shouldHotReload: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRecordChanges: js.UndefOr[scala.Boolean] = js.undefined,
    shouldStartLocked: js.UndefOr[scala.Boolean] = js.undefined,
    stateSanitizer: js.Function = null
  ): DevToolsOptions = {
    val __obj = js.Dynamic.literal()
    if (actionBlacklist != null) __obj.updateDynamic("actionBlacklist")(actionBlacklist.asInstanceOf[js.Any])
    if (actionCreators != null) __obj.updateDynamic("actionCreators")(actionCreators.asInstanceOf[js.Any])
    if (actionSanitizer != null) __obj.updateDynamic("actionSanitizer")(actionSanitizer)
    if (actionWhitelist != null) __obj.updateDynamic("actionWhitelist")(actionWhitelist.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPause)) __obj.updateDynamic("autoPause")(autoPause)
    if (features != null) __obj.updateDynamic("features")(features)
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pauseActionType != null) __obj.updateDynamic("pauseActionType")(pauseActionType)
    if (predicate != null) __obj.updateDynamic("predicate")(predicate)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHotReload)) __obj.updateDynamic("shouldHotReload")(shouldHotReload)
    if (!js.isUndefined(shouldRecordChanges)) __obj.updateDynamic("shouldRecordChanges")(shouldRecordChanges)
    if (!js.isUndefined(shouldStartLocked)) __obj.updateDynamic("shouldStartLocked")(shouldStartLocked)
    if (stateSanitizer != null) __obj.updateDynamic("stateSanitizer")(stateSanitizer)
    __obj.asInstanceOf[DevToolsOptions]
  }
}

