package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.SyntaxErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SyntaxError")
@js.native
class SyntaxError ()
  extends typings.std.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("SyntaxError")
@js.native
object SyntaxError extends TopLevel[SyntaxErrorConstructor]

