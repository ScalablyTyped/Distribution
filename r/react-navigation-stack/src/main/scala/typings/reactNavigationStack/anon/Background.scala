package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: String
  var border: String
  var card: String
  var primary: String
  var text: String
}

object Background {
  @scala.inline
  def apply(background: String, border: String, card: String, primary: String, text: String): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

