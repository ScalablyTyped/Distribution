package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.react.reactMod.PureComponent
import typings.reactDashRouterDashNavigationDashCore.Anon_Cards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "CardStack")
@js.native
class CardStack protected ()
  extends PureComponent[CardStackProps, Anon_Cards, js.Any] {
  def this(props: CardStackProps) = this()
  def this(props: CardStackProps, context: js.Any) = this()
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
  // Pop to previous scene (n-1)
  def onNavigateBack(): Boolean = js.native
  def unlistenHistory(): Unit = js.native
}

