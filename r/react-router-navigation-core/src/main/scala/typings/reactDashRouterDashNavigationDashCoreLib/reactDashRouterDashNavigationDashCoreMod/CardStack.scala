package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "CardStack")
@js.native
class CardStack protected ()
  extends reactLib.reactMod.PureComponent[CardStackProps, reactDashRouterDashNavigationDashCoreLib.Anon_Cards, js.Any] {
  def this(props: CardStackProps) = this()
  def this(props: CardStackProps, context: js.Any) = this()
  def onListenHistory(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    nextHistory: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  ): scala.Unit = js.native
  // Pop to previous scene (n-1)
  def onNavigateBack(): scala.Boolean = js.native
  def unlistenHistory(): scala.Unit = js.native
}

