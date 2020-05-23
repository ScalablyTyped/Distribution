package typings.sharedb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Register extends js.Object {
  def register(`type`: Dictkey): Unit
}

object Register {
  @scala.inline
  def apply(register: Dictkey => Unit): Register = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[Register]
  }
}

