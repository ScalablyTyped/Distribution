package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayBufferView
import typings.std.anon.HighWaterMark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
class ByteLengthQueuingStrategy protected ()
  extends typings.std.ByteLengthQueuingStrategy {
  def this(options: HighWaterMark) = this()
  /* CompleteClass */
  @JSName("highWaterMark")
  override var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  /* CompleteClass */
  @JSName("size")
  override def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double = js.native
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy
  extends Instantiable1[/* options */ HighWaterMark, typings.std.ByteLengthQueuingStrategy]

