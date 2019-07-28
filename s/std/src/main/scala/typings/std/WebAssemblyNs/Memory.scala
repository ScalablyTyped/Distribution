package typings.std.WebAssemblyNs

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory extends js.Object {
  val buffer: ArrayBuffer
  def grow(delta: Double): Double
}

@JSGlobal("WebAssembly.Memory")
@js.native
class MemoryCls protected () extends Memory {
  def this(descriptor: MemoryDescriptor) = this()
  /* CompleteClass */
  override val buffer: ArrayBuffer = js.native
  /* CompleteClass */
  override def grow(delta: Double): Double = js.native
}

@JSGlobal("WebAssembly.Memory")
@js.native
object Memory extends Instantiable1[/* descriptor */ MemoryDescriptor, Memory]

