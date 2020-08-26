package typings.reactRouterNavigationCore.anon

import typings.reactRouterNavigationCore.mod.Card
import typings.reactRouterNavigationCore.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cards extends js.Object {
  var cards: js.Array[Card] = js.native
  var key: Double = js.native
  var navigationState: NavigationState[Params] = js.native
}

object Cards {
  @scala.inline
  def apply(cards: js.Array[Card], key: Double, navigationState: NavigationState[Params]): Cards = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cards]
  }
  @scala.inline
  implicit class CardsOps[Self <: Cards] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCardsVarargs(value: Card*): Self = this.set("cards", js.Array(value :_*))
    @scala.inline
    def setCards(value: js.Array[Card]): Self = this.set("cards", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationState(value: NavigationState[Params]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
  }
  
}

