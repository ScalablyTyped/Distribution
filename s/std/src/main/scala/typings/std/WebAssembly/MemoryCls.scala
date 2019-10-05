package typings.std.WebAssembly

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Memory")
@js.native
class MemoryCls protected () extends Memory {
  def this(descriptor: MemoryDescriptor) = this()
  /* CompleteClass */
  override val buffer: ArrayBuffer = js.native
  /* CompleteClass */
  override def grow(delta: Double): Double = js.native
}

