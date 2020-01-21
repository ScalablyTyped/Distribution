package typings.reactRouterNavigation.mod

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactRouterNavigation.AnonKey
import typings.reactRouterNavigation.AnonLazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "BottomNavigation")
@js.native
class BottomNavigation ()
  extends Component[BottomNavigationProps, AnonKey, js.Any] {
  def renderNavigationBar(sceneProps: TabSubViewProps, props: TabSubViewProps): ReactNode = js.native
  def renderPager(sceneProps: TabSubViewProps): ReactNode = js.native
  def renderScene(sceneProps: TabSubViewProps): ReactElement = js.native
  def renderSceneView(sceneProps: TabSubViewProps): ReactNode = js.native
}

/* static members */
@JSImport("react-router-navigation", "BottomNavigation")
@js.native
object BottomNavigation extends js.Object {
  var defaultProps: AnonLazy = js.native
}

