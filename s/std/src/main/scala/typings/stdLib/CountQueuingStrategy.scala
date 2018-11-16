package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CountQueuingStrategy extends js.Object {
  var highWaterMark: scala.Double
  def size(): scala.Double
}

@JSGlobal("CountQueuingStrategy")
@js.native
object CountQueuingStrategy
  extends ScalablyTyped.runtime.Instantiable1[/* strategy */ QueuingStrategy, CountQueuingStrategy]

