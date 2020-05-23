package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.VBArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBArray")
@js.native
class VBArray[T] protected ()
  extends typings.std.VBArray[T] {
  def this(safeArray: typings.std.SafeArray[T]) = this()
}

@JSGlobal("VBArray")
@js.native
object VBArray extends TopLevel[VBArrayConstructor]

