package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  def log(message: String): Null
}

object AnonLog {
  @scala.inline
  def apply(log: String => Null): AnonLog = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[AnonLog]
  }
}

