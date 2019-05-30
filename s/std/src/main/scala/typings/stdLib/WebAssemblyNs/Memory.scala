package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory extends js.Object {
  val buffer: stdLib.ArrayBuffer
  def grow(delta: scala.Double): scala.Double
}

@JSGlobal("WebAssembly.Memory")
@js.native
class MemoryCls protected () extends Memory {
  def this(descriptor: MemoryDescriptor) = this()
  /* CompleteClass */
  override val buffer: stdLib.ArrayBuffer = js.native
  /* CompleteClass */
  override def grow(delta: scala.Double): scala.Double = js.native
}

@JSGlobal("WebAssembly.Memory")
@js.native
object Memory
  extends org.scalablytyped.runtime.Instantiable1[/* descriptor */ MemoryDescriptor, Memory]

