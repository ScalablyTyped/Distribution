package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var message: java.lang.String
  var result: scala.Boolean
}

object Anon_Actual {
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, message: java.lang.String, result: scala.Boolean): Anon_Actual = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, message = message, result = result)
  
    __obj.asInstanceOf[Anon_Actual]
  }
}

