package typings.reactDashToggled.reactDashToggledMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactToggledProps extends js.Object {
  val children: ChildrenFunction
  val defaultOn: js.UndefOr[Boolean] = js.undefined
  val on: js.UndefOr[Boolean] = js.undefined
  val onToggle: js.UndefOr[js.Function2[/* on */ Boolean, /* object */ TogglerStateAndHelpers, Unit]] = js.undefined
}

object ReactToggledProps {
  @scala.inline
  def apply(
    children: /* options */ TogglerStateAndHelpers => ReactNode,
    defaultOn: js.UndefOr[Boolean] = js.undefined,
    on: js.UndefOr[Boolean] = js.undefined,
    onToggle: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Unit = null
  ): ReactToggledProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(defaultOn)) __obj.updateDynamic("defaultOn")(defaultOn.asInstanceOf[js.Any])
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    __obj.asInstanceOf[ReactToggledProps]
  }
}

