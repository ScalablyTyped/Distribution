package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStackProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
  def render(props: CardsRendererProps): ReactNode
}

object CardStackProps {
  @scala.inline
  def apply(render: CardsRendererProps => ReactNode, children: js.Array[ReactNode] = null): CardStackProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[CardStackProps]
  }
}

