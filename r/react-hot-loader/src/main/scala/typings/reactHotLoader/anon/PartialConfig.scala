package typings.reactHotLoader.anon

import typings.react.mod.ComponentType
import typings.reactHotLoader.mod.HotError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-hot-loader.react-hot-loader.Config> */
trait PartialConfig extends js.Object {
  var ErrorOverlay: js.UndefOr[ComponentType[Errors]] = js.undefined
  var allowSFC: js.UndefOr[Boolean] = js.undefined
  var disableHotRenderer: js.UndefOr[Boolean] = js.undefined
  var disableHotRendererWhenInjected: js.UndefOr[Boolean] = js.undefined
  var errorReporter: js.UndefOr[ComponentType[HotError]] = js.undefined
  var ignoreComponents: js.UndefOr[Boolean] = js.undefined
  var ignoreSFC: js.UndefOr[Boolean] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  var onComponentCreate: js.UndefOr[js.Function2[/* type */ js.Any, /* displayName */ String, _]] = js.undefined
  var onComponentRegister: js.UndefOr[
    js.Function3[/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String, _]
  ] = js.undefined
  var pureRender: js.UndefOr[Boolean] = js.undefined
  var pureSFC: js.UndefOr[Boolean] = js.undefined
  var reloadHooks: js.UndefOr[Boolean] = js.undefined
  var showReactDomPatchNotification: js.UndefOr[Boolean] = js.undefined
  var trackTailUpdates: js.UndefOr[Boolean] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    ErrorOverlay: ComponentType[Errors] = null,
    allowSFC: js.UndefOr[Boolean] = js.undefined,
    disableHotRenderer: js.UndefOr[Boolean] = js.undefined,
    disableHotRendererWhenInjected: js.UndefOr[Boolean] = js.undefined,
    errorReporter: ComponentType[HotError] = null,
    ignoreComponents: js.UndefOr[Boolean] = js.undefined,
    ignoreSFC: js.UndefOr[Boolean] = js.undefined,
    logLevel: String = null,
    onComponentCreate: (/* type */ js.Any, /* displayName */ String) => _ = null,
    onComponentRegister: (/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String) => _ = null,
    pureRender: js.UndefOr[Boolean] = js.undefined,
    pureSFC: js.UndefOr[Boolean] = js.undefined,
    reloadHooks: js.UndefOr[Boolean] = js.undefined,
    showReactDomPatchNotification: js.UndefOr[Boolean] = js.undefined,
    trackTailUpdates: js.UndefOr[Boolean] = js.undefined
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (ErrorOverlay != null) __obj.updateDynamic("ErrorOverlay")(ErrorOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSFC)) __obj.updateDynamic("allowSFC")(allowSFC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHotRenderer)) __obj.updateDynamic("disableHotRenderer")(disableHotRenderer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHotRendererWhenInjected)) __obj.updateDynamic("disableHotRendererWhenInjected")(disableHotRendererWhenInjected.get.asInstanceOf[js.Any])
    if (errorReporter != null) __obj.updateDynamic("errorReporter")(errorReporter.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreComponents)) __obj.updateDynamic("ignoreComponents")(ignoreComponents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSFC)) __obj.updateDynamic("ignoreSFC")(ignoreSFC.get.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (onComponentCreate != null) __obj.updateDynamic("onComponentCreate")(js.Any.fromFunction2(onComponentCreate))
    if (onComponentRegister != null) __obj.updateDynamic("onComponentRegister")(js.Any.fromFunction3(onComponentRegister))
    if (!js.isUndefined(pureRender)) __obj.updateDynamic("pureRender")(pureRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pureSFC)) __obj.updateDynamic("pureSFC")(pureSFC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadHooks)) __obj.updateDynamic("reloadHooks")(reloadHooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showReactDomPatchNotification)) __obj.updateDynamic("showReactDomPatchNotification")(showReactDomPatchNotification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackTailUpdates)) __obj.updateDynamic("trackTailUpdates")(trackTailUpdates.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}

