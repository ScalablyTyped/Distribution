package typings.reactRouterNavigation.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "Navigation")
@js.native
class Navigation ()
  extends Component[NavigationComponentProps, js.Object, js.Any] {
  @JSName("props")
  var props_Navigation: NavigationComponentProps = js.native
  def renderHeader(sceneProps: CardSubViewProps, props: CardSubViewProps): ReactNode = js.native
  def renderSceneComponent(sceneProps: CardSubViewProps): js.UndefOr[ComponentClass[_, ComponentState]] = js.native
}

