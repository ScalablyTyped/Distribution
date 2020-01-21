package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  val count: String
  val cursor: String
}

object AnonCount {
  @scala.inline
  def apply(count: String, cursor: String): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCount]
  }
}

