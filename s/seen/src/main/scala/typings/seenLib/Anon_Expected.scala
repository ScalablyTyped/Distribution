package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expected extends js.Object {
  def SyntaxError(message: java.lang.String, expected: java.lang.String, found: java.lang.String, location: js.Any): scala.Unit
  def parse(input: java.lang.String): js.Any
}

object Anon_Expected {
  @scala.inline
  def apply(
    SyntaxError: (java.lang.String, java.lang.String, java.lang.String, js.Any) => scala.Unit,
    parse: java.lang.String => js.Any
  ): Anon_Expected = {
    val __obj = js.Dynamic.literal(SyntaxError = js.Any.fromFunction4(SyntaxError), parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[Anon_Expected]
  }
}

