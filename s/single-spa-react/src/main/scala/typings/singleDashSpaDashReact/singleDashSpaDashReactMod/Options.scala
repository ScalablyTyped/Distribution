package typings.singleDashSpaDashReact.singleDashSpaDashReactMod

import typings.react.reactMod.ComponentClass
import typings.singleDashSpaDashReact.TypeofReact
import typings.singleDashSpaDashReact.TypeofReactDOM
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var React: TypeofReact
  var ReactDOM: TypeofReactDOM
  var domElementGetter: js.UndefOr[js.Function0[Element]] = js.undefined
  var loadRootComponent: js.UndefOr[js.Function0[js.Promise[ComponentClass[_, _]]]] = js.undefined
  var parcelCanUpdate: js.UndefOr[Boolean] = js.undefined
  var rootComponent: js.UndefOr[ComponentClass[_, _]] = js.undefined
  var suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    React: TypeofReact,
    ReactDOM: TypeofReactDOM,
    domElementGetter: () => Element = null,
    loadRootComponent: () => js.Promise[ComponentClass[_, _]] = null,
    parcelCanUpdate: js.UndefOr[Boolean] = js.undefined,
    rootComponent: ComponentClass[_, _] = null,
    suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(React = React.asInstanceOf[js.Any], ReactDOM = ReactDOM.asInstanceOf[js.Any])
    if (domElementGetter != null) __obj.updateDynamic("domElementGetter")(js.Any.fromFunction0(domElementGetter))
    if (loadRootComponent != null) __obj.updateDynamic("loadRootComponent")(js.Any.fromFunction0(loadRootComponent))
    if (!js.isUndefined(parcelCanUpdate)) __obj.updateDynamic("parcelCanUpdate")(parcelCanUpdate.asInstanceOf[js.Any])
    if (rootComponent != null) __obj.updateDynamic("rootComponent")(rootComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressComponentDidCatchWarning)) __obj.updateDynamic("suppressComponentDidCatchWarning")(suppressComponentDidCatchWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

