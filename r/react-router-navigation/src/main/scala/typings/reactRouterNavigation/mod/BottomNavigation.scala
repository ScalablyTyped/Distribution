package typings.reactRouterNavigation.mod

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactRouterNavigation.anon.Key
import typings.reactRouterNavigation.anon.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "BottomNavigation")
@js.native
class BottomNavigation ()
  extends Component[BottomNavigationProps, Key, js.Any] {
  def renderNavigationBar(sceneProps: TabSubViewProps, props: TabSubViewProps): ReactNode = js.native
  def renderPager(sceneProps: TabSubViewProps): ReactNode = js.native
  def renderScene(sceneProps: TabSubViewProps): ReactElement = js.native
  def renderSceneView(sceneProps: TabSubViewProps): ReactNode = js.native
}

/* static members */
@JSImport("react-router-navigation", "BottomNavigation")
@js.native
object BottomNavigation extends js.Object {
  var defaultProps: Lazy = js.native
}

