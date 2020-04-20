package typings.reactNotifyToast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactNotifyToastColor extends js.Object {
  var background: String
  var text: String
}

object reactNotifyToastColor {
  @scala.inline
  def apply(background: String, text: String): reactNotifyToastColor = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[reactNotifyToastColor]
  }
}

