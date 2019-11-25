package typings.reactDashBootstrap.libCollapseMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactElement
import typings.reactDashBootstrap.reactDashBootstrapMod.TransitionCallbacks
import typings.reactDashBootstrap.reactDashBootstrapStrings.height
import typings.reactDashBootstrap.reactDashBootstrapStrings.width
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends ClassAttributes[Collapse]
     with TransitionCallbacks {
  var dimension: js.UndefOr[height | width | js.Function0[String]] = js.undefined
  var getDimensionValue: js.UndefOr[js.Function2[/* dimension */ Double, /* element */ ReactElement, Double]] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transitionAppear: js.UndefOr[Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    dimension: height | width | js.Function0[String] = null,
    getDimensionValue: (/* dimension */ Double, /* element */ ReactElement) => Double = null,
    in: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onEnter: /* node */ HTMLElement => _ = null,
    onEntered: /* node */ HTMLElement => _ = null,
    onEntering: /* node */ HTMLElement => _ = null,
    onExit: /* node */ HTMLElement => _ = null,
    onExited: /* node */ HTMLElement => _ = null,
    onExiting: /* node */ HTMLElement => _ = null,
    ref: LegacyRef[Collapse] = null,
    timeout: Int | Double = null,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (getDimensionValue != null) __obj.updateDynamic("getDimensionValue")(js.Any.fromFunction2(getDimensionValue))
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

