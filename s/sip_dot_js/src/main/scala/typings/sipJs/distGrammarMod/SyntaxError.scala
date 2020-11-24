package typings.sipJs.distGrammarMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "SyntaxError")
@js.native
class SyntaxError protected () extends Error {
  def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
  def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  
  var expected: js.Array[Expectation] = js.native
  
  var found: String | Null = js.native
  
  var location: IFileRange = js.native
}
/* static members */
@JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "SyntaxError")
@js.native
object SyntaxError extends js.Object {
  
  def buildMessage(expected: js.Array[Expectation]): String = js.native
  def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
}
