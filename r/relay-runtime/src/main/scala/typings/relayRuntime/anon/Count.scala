package typings.relayRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  val count: String
  val cursor: String
}

object Count {
  @scala.inline
  def apply(count: String, cursor: String): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

