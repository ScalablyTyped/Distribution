package typings.reactRouterNavigationCore

import typings.reactRouterNavigationCore.mod.Card
import typings.reactRouterNavigationCore.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCards extends js.Object {
  var cards: js.Array[Card]
  var key: Double
  var navigationState: NavigationState[AnonParams]
}

object AnonCards {
  @scala.inline
  def apply(cards: js.Array[Card], key: Double, navigationState: NavigationState[AnonParams]): AnonCards = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCards]
  }
}

