package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Array")
@js.native
class Array[T] protected ()
  extends typings.std.Array[T] {
  def this(arrayLength: Double) = this()
  def this(items: T*) = this()
}

@JSGlobal("Array")
@js.native
object Array extends TopLevel[ArrayConstructor]

