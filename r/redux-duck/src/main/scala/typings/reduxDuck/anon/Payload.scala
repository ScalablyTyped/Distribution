package typings.reduxDuck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  var payload: js.Any
}

object Payload {
  @scala.inline
  def apply(payload: js.Any): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

