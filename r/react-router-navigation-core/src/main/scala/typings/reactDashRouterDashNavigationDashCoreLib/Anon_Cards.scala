package typings
package reactDashRouterDashNavigationDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cards extends js.Object {
  var cards: js.Array[
    reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Card
  ]
  var key: scala.Double
  var navigationState: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.NavigationState[Anon_Params]
}

object Anon_Cards {
  @scala.inline
  def apply(
    cards: js.Array[
      reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Card
    ],
    key: scala.Double,
    navigationState: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.NavigationState[Anon_Params]
  ): Anon_Cards = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cards")(cards)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("navigationState")(navigationState)
    __obj.asInstanceOf[Anon_Cards]
  }
}

