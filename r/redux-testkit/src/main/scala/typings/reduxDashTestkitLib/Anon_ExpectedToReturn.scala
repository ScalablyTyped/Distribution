package typings
package reduxDashTestkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpectedToReturn extends js.Object {
  def toReturn(expected: js.Any): scala.Unit
}

object Anon_ExpectedToReturn {
  @scala.inline
  def apply(toReturn: js.Function1[js.Any, scala.Unit]): Anon_ExpectedToReturn = {
    val __obj = js.Dynamic.literal(toReturn = toReturn)
  
    __obj.asInstanceOf[Anon_ExpectedToReturn]
  }
}

