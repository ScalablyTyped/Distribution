package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Error")
@js.native
class Error ()
  extends typings.std.Error {
  def this(message: java.lang.String) = this()
}

@JSGlobal("Error")
@js.native
object Error extends TopLevel[ErrorConstructor]

