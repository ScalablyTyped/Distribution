package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurable extends js.Object {
  var durable: Boolean
}

object AnonDurable {
  @scala.inline
  def apply(durable: Boolean): AnonDurable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurable]
  }
}

