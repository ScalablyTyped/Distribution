package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBufferConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ArrayBuffer")
@js.native
class ArrayBuffer protected ()
  extends typings.std.ArrayBuffer {
  def this(byteLength: Double) = this()
}

@JSGlobal("ArrayBuffer")
@js.native
object ArrayBuffer extends TopLevel[ArrayBufferConstructor]

