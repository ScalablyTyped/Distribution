package typings
package reactDashToggledLib.reactDashToggledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactToggledProps extends js.Object {
  val children: ChildrenFunction
  val defaultOn: js.UndefOr[scala.Boolean] = js.undefined
  val on: js.UndefOr[scala.Boolean] = js.undefined
  val onToggle: js.UndefOr[
    js.Function2[/* on */ scala.Boolean, /* object */ TogglerStateAndHelpers, scala.Unit]
  ] = js.undefined
}

object ReactToggledProps {
  @scala.inline
  def apply(
    children: ChildrenFunction,
    defaultOn: js.UndefOr[scala.Boolean] = js.undefined,
    on: js.UndefOr[scala.Boolean] = js.undefined,
    onToggle: (/* on */ scala.Boolean, /* object */ TogglerStateAndHelpers) => scala.Unit = null
  ): ReactToggledProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (!js.isUndefined(defaultOn)) __obj.updateDynamic("defaultOn")(defaultOn)
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on)
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    __obj.asInstanceOf[ReactToggledProps]
  }
}

