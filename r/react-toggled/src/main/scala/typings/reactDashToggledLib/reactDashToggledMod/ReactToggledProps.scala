package typings
package reactDashToggledLib.reactDashToggledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactToggledProps extends js.Object {
  val defaultOn: js.UndefOr[scala.Boolean] = js.undefined
  val on: js.UndefOr[scala.Boolean] = js.undefined
  val onToggle: js.UndefOr[
    js.Function2[/* on */ scala.Boolean, /* object */ TogglerStateAndHelpers, scala.Unit]
  ] = js.undefined
  def children(options: TogglerStateAndHelpers): reactLib.reactMod.ReactNs.ReactNode
}

object ReactToggledProps {
  @scala.inline
  def apply(
    children: js.Function1[TogglerStateAndHelpers, reactLib.reactMod.ReactNs.ReactNode],
    defaultOn: js.UndefOr[scala.Boolean] = js.undefined,
    on: js.UndefOr[scala.Boolean] = js.undefined,
    onToggle: js.Function2[/* on */ scala.Boolean, /* object */ TogglerStateAndHelpers, scala.Unit] = null
  ): ReactToggledProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (!js.isUndefined(defaultOn)) __obj.updateDynamic("defaultOn")(defaultOn)
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on)
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle)
    __obj.asInstanceOf[ReactToggledProps]
  }
}

