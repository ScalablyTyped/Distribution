package typings.redactSecrets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redactor extends js.Object {
  def forEach(obj: js.Any): Unit
  def map(obj: js.Any): js.Any
}

object Redactor {
  @scala.inline
  def apply(forEach: js.Any => Unit, map: js.Any => js.Any): Redactor = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[Redactor]
  }
}

