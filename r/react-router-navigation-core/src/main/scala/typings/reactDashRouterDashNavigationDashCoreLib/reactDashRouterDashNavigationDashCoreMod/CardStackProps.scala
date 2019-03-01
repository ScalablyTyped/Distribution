package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStackProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  def render(props: CardsRendererProps): reactLib.reactMod.ReactNs.ReactNode
}

object CardStackProps {
  @scala.inline
  def apply(
    render: js.Function1[CardsRendererProps, reactLib.reactMod.ReactNs.ReactNode],
    children: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null
  ): CardStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[CardStackProps]
  }
}

