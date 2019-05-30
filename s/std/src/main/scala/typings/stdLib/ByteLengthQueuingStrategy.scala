package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the Streams API provides a built-in byte length queuing strategy that can be used when constructing streams. */
trait ByteLengthQueuingStrategy extends QueuingStrategy[ArrayBufferView] {
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: scala.Double
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): scala.Double
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
class ByteLengthQueuingStrategyCls protected () extends ByteLengthQueuingStrategy {
  def this(options: Anon_HighWaterMark) = this()
  /* CompleteClass */
  @JSName("highWaterMark")
  override var highWaterMark_ByteLengthQueuingStrategy: scala.Double = js.native
  /* CompleteClass */
  @JSName("size")
  override def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): scala.Double = js.native
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy
  extends org.scalablytyped.runtime.Instantiable1[/* options */ Anon_HighWaterMark, ByteLengthQueuingStrategy]

