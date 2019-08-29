package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
trait ByteLengthQueuingStrategy extends QueuingStrategy[ArrayBufferView] {
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
class ByteLengthQueuingStrategyCls protected () extends ByteLengthQueuingStrategy {
  def this(options: Anon_HighWaterMark) = this()
  /* CompleteClass */
  @JSName("highWaterMark")
  override var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  /* CompleteClass */
  @JSName("size")
  override def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double = js.native
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy extends Instantiable1[/* options */ Anon_HighWaterMark, ByteLengthQueuingStrategy]

