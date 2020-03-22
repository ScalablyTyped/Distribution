package typings.reduxTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToReturn extends js.Object {
  def toReturn(expected: js.Any): Unit
}

object AnonToReturn {
  @scala.inline
  def apply(toReturn: js.Any => Unit): AnonToReturn = {
    val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
  
    __obj.asInstanceOf[AnonToReturn]
  }
}

