package typings.reactRouterNavigation.mod

import typings.react.mod.ReactElement
import typings.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card
  extends RouteProps
     with NavBarProps {
  var key: String
}

@JSImport("react-router-navigation", "Card")
@js.native
object Card extends js.Object {
  def apply(props: CardProps): ReactElement = js.native
}

