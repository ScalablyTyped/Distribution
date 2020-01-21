package typings.semanticUiReact.transitionTransitionMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticTRANSITIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTransitionProps extends js.Object {
  /** Named animation event to used. Must be defined in CSS. */
  var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Whether it is directional animation event or not. Use it only for custom transitions. */
  var directional: js.UndefOr[Boolean] = js.undefined
  /** Duration of the CSS transition animation in milliseconds. */
  var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.undefined
  /** Wait until the first "enter" transition to mount the component (add it to the DOM). */
  var mountOnShow: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback on each transition that changes visibility to shown.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onComplete: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
  /**
    * Callback on each transition that changes visibility to hidden.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onHide: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
  /**
    * Callback on each transition that changes visibility to shown.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onShow: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
  /**
    * Callback on animation start.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onStart: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
  /** React's key of the element. */
  var reactKey: js.UndefOr[String] = js.undefined
  /** Run the enter animation when the component mounts, if it is initially shown. */
  var transitionOnMount: js.UndefOr[Boolean] = js.undefined
  /** Unmount the component (remove it from the DOM) when it is not shown. */
  var unmountOnHide: js.UndefOr[Boolean] = js.undefined
  /** Show the component; triggers the enter or exit animation. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StrictTransitionProps {
  @scala.inline
  def apply(
    animation: SemanticTRANSITIONS | String = null,
    children: ReactNode = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null,
    mountOnShow: js.UndefOr[Boolean] = js.undefined,
    onComplete: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    onShow: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    reactKey: String = null,
    transitionOnMount: js.UndefOr[Boolean] = js.undefined,
    unmountOnHide: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StrictTransitionProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnShow)) __obj.updateDynamic("mountOnShow")(mountOnShow.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2(onComplete))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (reactKey != null) __obj.updateDynamic("reactKey")(reactKey.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionOnMount)) __obj.updateDynamic("transitionOnMount")(transitionOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnHide)) __obj.updateDynamic("unmountOnHide")(unmountOnHide.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTransitionProps]
  }
}

