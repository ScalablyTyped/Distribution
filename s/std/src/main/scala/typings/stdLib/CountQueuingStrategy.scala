package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountQueuingStrategy
  extends QueuingStrategy[js.Any] {
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: scala.Double
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): stdLib.stdLibNumbers.`1`
}

@JSGlobal("CountQueuingStrategy")
@js.native
class CountQueuingStrategyCls protected () extends CountQueuingStrategy {
  def this(options: Anon_HighWaterMark) = this()
  /* CompleteClass */
  @JSName("highWaterMark")
  override var highWaterMark_CountQueuingStrategy: scala.Double = js.native
  /* CompleteClass */
  @JSName("size")
  override def size_MCountQueuingStrategy(chunk: js.Any): stdLib.stdLibNumbers.`1` = js.native
}

@JSGlobal("CountQueuingStrategy")
@js.native
object CountQueuingStrategy
  extends org.scalablytyped.runtime.Instantiable1[/* options */ Anon_HighWaterMark, CountQueuingStrategy]

