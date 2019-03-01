package typings
package pslLib.pslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
  var error: pslLib.Anon_Code
  var input: java.lang.String
}

object ParseError {
  @scala.inline
  def apply(error: pslLib.Anon_Code, input: java.lang.String): ParseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("input")(input)
    __obj.asInstanceOf[ParseError]
  }
}

