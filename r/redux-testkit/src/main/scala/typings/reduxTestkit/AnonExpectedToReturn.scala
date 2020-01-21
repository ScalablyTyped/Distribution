package typings.reduxTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpectedToReturn extends js.Object {
  def toReturn(expected: js.Any): Unit
}

object AnonExpectedToReturn {
  @scala.inline
  def apply(toReturn: js.Any => Unit): AnonExpectedToReturn = {
    val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
  
    __obj.asInstanceOf[AnonExpectedToReturn]
  }
}

