package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteLengthQueuingStrategy extends js.Object {
  var highWaterMark: scala.Double = js.native
  def size(): scala.Double = js.native
  def size(chunk: js.Any): scala.Double = js.native
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy
  extends ScalablyTyped.runtime.Instantiable1[/* strategy */ QueuingStrategy, ByteLengthQueuingStrategy]

