package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCard extends js.Object {
  var card: String
}

object AnonCard {
  @scala.inline
  def apply(card: String): AnonCard = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCard]
  }
}

