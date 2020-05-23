package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.TypeErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeError")
@js.native
class TypeError ()
  extends typings.std.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("TypeError")
@js.native
object TypeError extends TopLevel[TypeErrorConstructor]

