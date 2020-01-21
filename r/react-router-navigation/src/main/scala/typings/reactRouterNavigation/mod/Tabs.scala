package typings.reactRouterNavigation.mod

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactRouterNavigation.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "Tabs")
@js.native
class Tabs ()
  extends Component[TabBarComponentProps, AnonKey, js.Any] {
  @JSName("props")
  var props_Tabs: TabBarComponentProps = js.native
  def renderFooter(sceneProps: TabSubViewProps): ReactElement | Null = js.native
  def renderHeader(sceneProps: TabSubViewProps): ReactElement | Null = js.native
  def renderScene(sceneProps: TabSubViewProps): ReactElement | Null = js.native
  def renderTabBar(sceneProps: TabSubViewProps, props: TabSubViewProps): ReactElement | Null = js.native
}

