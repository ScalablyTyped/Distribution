package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.SharedArrayBufferConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SharedArrayBuffer")
@js.native
class SharedArrayBuffer protected ()
  extends typings.std.SharedArrayBuffer {
  def this(byteLength: Double) = this()
}

@JSGlobal("SharedArrayBuffer")
@js.native
object SharedArrayBuffer extends TopLevel[SharedArrayBufferConstructor]

