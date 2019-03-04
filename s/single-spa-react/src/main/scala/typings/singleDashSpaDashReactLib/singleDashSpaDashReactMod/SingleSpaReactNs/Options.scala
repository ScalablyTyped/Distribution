package typings
package singleDashSpaDashReactLib.singleDashSpaDashReactMod.SingleSpaReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var React: singleDashSpaDashReactLib.Anon_A
  var ReactDOM: singleDashSpaDashReactLib.Anon_AB
  var domElementGetter: js.UndefOr[js.Function0[reactLib.Element]] = js.undefined
  var loadRootComponent: js.UndefOr[js.Function0[js.Promise[reactLib.reactMod.ReactNs.ComponentClass[_, _]]]] = js.undefined
  var parcelCanUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var rootComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentClass[_, _]] = js.undefined
  var suppressComponentDidCatchWarning: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    React: singleDashSpaDashReactLib.Anon_A,
    ReactDOM: singleDashSpaDashReactLib.Anon_AB,
    domElementGetter: js.Function0[reactLib.Element] = null,
    loadRootComponent: js.Function0[js.Promise[reactLib.reactMod.ReactNs.ComponentClass[_, _]]] = null,
    parcelCanUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    rootComponent: reactLib.reactMod.ReactNs.ComponentClass[_, _] = null,
    suppressComponentDidCatchWarning: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(React = React, ReactDOM = ReactDOM)
    if (domElementGetter != null) __obj.updateDynamic("domElementGetter")(domElementGetter)
    if (loadRootComponent != null) __obj.updateDynamic("loadRootComponent")(loadRootComponent)
    if (!js.isUndefined(parcelCanUpdate)) __obj.updateDynamic("parcelCanUpdate")(parcelCanUpdate)
    if (rootComponent != null) __obj.updateDynamic("rootComponent")(rootComponent)
    if (!js.isUndefined(suppressComponentDidCatchWarning)) __obj.updateDynamic("suppressComponentDidCatchWarning")(suppressComponentDidCatchWarning)
    __obj.asInstanceOf[Options]
  }
}

