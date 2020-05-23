package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAny extends js.Object {
  var message: js.Any
}

object MessageAny {
  @scala.inline
  def apply(message: js.Any): MessageAny = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAny]
  }
}

