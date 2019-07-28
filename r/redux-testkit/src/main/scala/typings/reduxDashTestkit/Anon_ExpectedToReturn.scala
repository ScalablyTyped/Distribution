package typings.reduxDashTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpectedToReturn extends js.Object {
  def toReturn(expected: js.Any): Unit
}

object Anon_ExpectedToReturn {
  @scala.inline
  def apply(toReturn: js.Any => Unit): Anon_ExpectedToReturn = {
    val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
  
    __obj.asInstanceOf[Anon_ExpectedToReturn]
  }
}

