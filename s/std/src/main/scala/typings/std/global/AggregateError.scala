package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.AggregateErrorConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AggregateError")
@js.native
class AggregateError protected ()
  extends typings.std.AggregateError {
  def this(errors: Iterable[_]) = this()
  def this(errors: Iterable[_], message: java.lang.String) = this()
}

@JSGlobal("AggregateError")
@js.native
object AggregateError extends TopLevel[AggregateErrorConstructor]

