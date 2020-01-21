package typings.reactRouterNavigation.mod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "NavBar")
@js.native
class NavBar ()
  extends Component[CardSubViewProps, Unit, js.Any] {
  @JSName("props")
  var props_NavBar: CardSubViewProps = js.native
  def renderLeftComponent(sceneProps: CardSubViewProps): ReactNode = js.native
  def renderRightComponent(sceneProps: CardSubViewProps): ReactNode = js.native
  def renderTitleComponent(sceneProps: CardSubViewProps): ReactNode = js.native
}

