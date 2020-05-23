package typings.reactBootstrap.overlayTriggerMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayTriggerProps extends Props[OverlayTrigger] {
   // TODO: Add more specific type
  // Optional
  var animation: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var container: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var containerPadding: js.UndefOr[Double] = js.undefined
  var defaultOverlayShown: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var delayHide: js.UndefOr[Double] = js.undefined
  var delayShow: js.UndefOr[Double] = js.undefined
  var onEnter: js.UndefOr[js.Function] = js.undefined
  var onEntered: js.UndefOr[js.Function] = js.undefined
  var onEntering: js.UndefOr[js.Function] = js.undefined
  var onExit: js.UndefOr[js.Function] = js.undefined
  var onExited: js.UndefOr[js.Function] = js.undefined
  var onExiting: js.UndefOr[js.Function] = js.undefined
  // Required
  var overlay: js.Any
  var placement: js.UndefOr[String] = js.undefined
  var rootClose: js.UndefOr[Boolean] = js.undefined
  var trigger: js.UndefOr[String | js.Array[String]] = js.undefined
}

object OverlayTriggerProps {
  @scala.inline
  def apply(
    overlay: js.Any,
    animation: js.Any = null,
    children: ReactNode = null,
    container: js.Any = null,
    containerPadding: js.UndefOr[Double] = js.undefined,
    defaultOverlayShown: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    delayHide: js.UndefOr[Double] = js.undefined,
    delayShow: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    onEnter: js.Function = null,
    onEntered: js.Function = null,
    onEntering: js.Function = null,
    onExit: js.Function = null,
    onExited: js.Function = null,
    onExiting: js.Function = null,
    placement: String = null,
    ref: js.UndefOr[Null | LegacyRef[OverlayTrigger]] = js.undefined,
    rootClose: js.UndefOr[Boolean] = js.undefined,
    trigger: String | js.Array[String] = null
  ): OverlayTriggerProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(containerPadding)) __obj.updateDynamic("containerPadding")(containerPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOverlayShown)) __obj.updateDynamic("defaultOverlayShown")(defaultOverlayShown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayHide)) __obj.updateDynamic("delayHide")(delayHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayShow)) __obj.updateDynamic("delayShow")(delayShow.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(rootClose)) __obj.updateDynamic("rootClose")(rootClose.get.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayTriggerProps]
  }
}

