package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadButton extends js.Object {
  val pressed: scala.Boolean
  val touched: scala.Boolean
  val value: scala.Double
}

@JSGlobal("GamepadButton")
@js.native
class GamepadButtonCls () extends GamepadButton {
  /* CompleteClass */
  override val pressed: scala.Boolean = js.native
  /* CompleteClass */
  override val touched: scala.Boolean = js.native
  /* CompleteClass */
  override val value: scala.Double = js.native
}

@JSGlobal("GamepadButton")
@js.native
object GamepadButton
  extends org.scalablytyped.runtime.Instantiable0[GamepadButton]

