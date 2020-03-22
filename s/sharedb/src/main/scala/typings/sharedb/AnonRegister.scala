package typings.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegister extends js.Object {
  def register(`type`: AnonDictkey): Unit
}

object AnonRegister {
  @scala.inline
  def apply(register: AnonDictkey => Unit): AnonRegister = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[AnonRegister]
  }
}

