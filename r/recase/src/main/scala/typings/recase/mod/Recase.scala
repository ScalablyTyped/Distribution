package typings.recase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recase extends js.Object {
  def camelCopy(orig: js.Any): js.Any
  def snakeCopy(orig: js.Any): js.Any
}

object Recase {
  @scala.inline
  def apply(camelCopy: js.Any => js.Any, snakeCopy: js.Any => js.Any): Recase = {
    val __obj = js.Dynamic.literal(camelCopy = js.Any.fromFunction1(camelCopy), snakeCopy = js.Any.fromFunction1(snakeCopy))
    __obj.asInstanceOf[Recase]
  }
}

