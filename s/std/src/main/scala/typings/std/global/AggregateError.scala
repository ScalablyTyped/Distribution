package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.AggregateErrorConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AggregateError")
@js.native
class AggregateError protected ()
  extends typings.std.AggregateError {
  def this(errors: Iterable[_]) = this()
  def this(errors: Iterable[_], message: java.lang.String) = this()
  /* CompleteClass */
  override var errors: js.Array[_] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("AggregateError")
@js.native
object AggregateError extends TopLevel[AggregateErrorConstructor]

