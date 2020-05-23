package typings.reduxTestkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToReturn extends js.Object {
  def toReturn(expected: js.Any): Unit
}

object ToReturn {
  @scala.inline
  def apply(toReturn: js.Any => Unit): ToReturn = {
    val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
    __obj.asInstanceOf[ToReturn]
  }
}

