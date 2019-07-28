package typings.reactDashRouterDashNavigationDashCore

import typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.Card
import typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cards extends js.Object {
  var cards: js.Array[Card]
  var key: Double
  var navigationState: NavigationState[Anon_Params]
}

object Anon_Cards {
  @scala.inline
  def apply(cards: js.Array[Card], key: Double, navigationState: NavigationState[Anon_Params]): Anon_Cards = {
    val __obj = js.Dynamic.literal(cards = cards, key = key, navigationState = navigationState)
  
    __obj.asInstanceOf[Anon_Cards]
  }
}

