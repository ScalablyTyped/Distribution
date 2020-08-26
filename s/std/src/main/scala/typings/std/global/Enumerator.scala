package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.EnumeratorConstructor
import typings.std.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Enumerator")
@js.native
class Enumerator[T] protected ()
  extends typings.std.Enumerator[T] {
  def this(collection: js.Any) = this()
  def this(collection: Item[T]) = this()
  def this(safearray: typings.std.SafeArray[T]) = this()
}

@JSGlobal("Enumerator")
@js.native
object Enumerator extends TopLevel[EnumeratorConstructor]

