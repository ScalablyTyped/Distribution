package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSStream extends js.Object {
  val `type`: java.lang.String
  def msClose(): Unit
  def msDetachStream(): js.Any
}

object MSStream {
  @scala.inline
  def apply(msClose: () => Unit, msDetachStream: () => js.Any, `type`: java.lang.String): MSStream = {
    val __obj = js.Dynamic.literal(msClose = js.Any.fromFunction0(msClose), msDetachStream = js.Any.fromFunction0(msDetachStream))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSStream]
  }
}

