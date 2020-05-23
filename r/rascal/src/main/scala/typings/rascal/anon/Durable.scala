package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Durable extends js.Object {
  var durable: Boolean
}

object Durable {
  @scala.inline
  def apply(durable: Boolean): Durable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durable]
  }
}

