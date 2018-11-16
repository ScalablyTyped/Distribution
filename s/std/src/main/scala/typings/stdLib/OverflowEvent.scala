package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowEvent extends UIEvent {
  val BOTH: scala.Double = js.native
  val HORIZONTAL: scala.Double = js.native
  val VERTICAL: scala.Double = js.native
  val horizontalOverflow: scala.Boolean = js.native
  val orient: scala.Double = js.native
  val verticalOverflow: scala.Boolean = js.native
}

@JSGlobal("OverflowEvent")
@js.native
object OverflowEvent
  extends ScalablyTyped.runtime.Instantiable0[OverflowEvent] {
  val BOTH: scala.Double = js.native
  val HORIZONTAL: scala.Double = js.native
  val VERTICAL: scala.Double = js.native
}

