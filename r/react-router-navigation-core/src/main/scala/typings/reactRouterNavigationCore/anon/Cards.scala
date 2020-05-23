package typings.reactRouterNavigationCore.anon

import typings.reactRouterNavigationCore.mod.Card
import typings.reactRouterNavigationCore.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cards extends js.Object {
  var cards: js.Array[Card]
  var key: Double
  var navigationState: NavigationState[Params]
}

object Cards {
  @scala.inline
  def apply(cards: js.Array[Card], key: Double, navigationState: NavigationState[Params]): Cards = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cards]
  }
}

