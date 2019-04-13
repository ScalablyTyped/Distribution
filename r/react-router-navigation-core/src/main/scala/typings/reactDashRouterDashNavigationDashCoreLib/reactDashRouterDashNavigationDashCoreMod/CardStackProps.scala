package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStackProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode]] = js.undefined
  def render(props: CardsRendererProps): reactLib.reactMod.ReactNode
}

object CardStackProps {
  @scala.inline
  def apply(
    render: CardsRendererProps => reactLib.reactMod.ReactNode,
    children: js.Array[reactLib.reactMod.ReactNode] = null
  ): CardStackProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[CardStackProps]
  }
}

