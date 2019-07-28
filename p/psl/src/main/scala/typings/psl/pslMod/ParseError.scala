package typings.psl.pslMod

import typings.psl.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
  var error: Anon_Code
  var input: String
}

object ParseError {
  @scala.inline
  def apply(error: Anon_Code, input: String): ParseError = {
    val __obj = js.Dynamic.literal(error = error, input = input)
  
    __obj.asInstanceOf[ParseError]
  }
}

