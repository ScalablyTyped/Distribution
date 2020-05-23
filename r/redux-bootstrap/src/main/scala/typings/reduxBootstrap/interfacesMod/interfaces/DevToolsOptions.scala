package typings.reduxBootstrap.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevToolsOptions extends js.Object {
  var actionBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
  var actionCreators: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  var actionSanitizer: js.UndefOr[js.Function] = js.undefined
  var actionWhitelist: js.UndefOr[String | js.Array[String]] = js.undefined
  var autoPause: js.UndefOr[Boolean] = js.undefined
  var features: js.UndefOr[js.Object] = js.undefined
  var latency: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pauseActionType: js.UndefOr[String] = js.undefined
  var predicate: js.UndefOr[js.Function] = js.undefined
  var serialize: js.UndefOr[Boolean | js.Object] = js.undefined
  var shouldHotReload: js.UndefOr[Boolean] = js.undefined
  var shouldRecordChanges: js.UndefOr[Boolean] = js.undefined
  var shouldStartLocked: js.UndefOr[Boolean] = js.undefined
  var stateSanitizer: js.UndefOr[js.Function] = js.undefined
}

object DevToolsOptions {
  @scala.inline
  def apply(
    actionBlacklist: String | js.Array[String] = null,
    actionCreators: js.Array[_] | js.Object = null,
    actionSanitizer: js.Function = null,
    actionWhitelist: String | js.Array[String] = null,
    autoPause: js.UndefOr[Boolean] = js.undefined,
    features: js.Object = null,
    latency: js.UndefOr[Double] = js.undefined,
    name: String = null,
    pauseActionType: String = null,
    predicate: js.Function = null,
    serialize: Boolean | js.Object = null,
    shouldHotReload: js.UndefOr[Boolean] = js.undefined,
    shouldRecordChanges: js.UndefOr[Boolean] = js.undefined,
    shouldStartLocked: js.UndefOr[Boolean] = js.undefined,
    stateSanitizer: js.Function = null
  ): DevToolsOptions = {
    val __obj = js.Dynamic.literal()
    if (actionBlacklist != null) __obj.updateDynamic("actionBlacklist")(actionBlacklist.asInstanceOf[js.Any])
    if (actionCreators != null) __obj.updateDynamic("actionCreators")(actionCreators.asInstanceOf[js.Any])
    if (actionSanitizer != null) __obj.updateDynamic("actionSanitizer")(actionSanitizer.asInstanceOf[js.Any])
    if (actionWhitelist != null) __obj.updateDynamic("actionWhitelist")(actionWhitelist.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPause)) __obj.updateDynamic("autoPause")(autoPause.get.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pauseActionType != null) __obj.updateDynamic("pauseActionType")(pauseActionType.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHotReload)) __obj.updateDynamic("shouldHotReload")(shouldHotReload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRecordChanges)) __obj.updateDynamic("shouldRecordChanges")(shouldRecordChanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldStartLocked)) __obj.updateDynamic("shouldStartLocked")(shouldStartLocked.get.asInstanceOf[js.Any])
    if (stateSanitizer != null) __obj.updateDynamic("stateSanitizer")(stateSanitizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevToolsOptions]
  }
}

