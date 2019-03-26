package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType
  def pulse(value: scala.Double, duration: scala.Double): js.Promise[scala.Boolean]
}

@JSGlobal("GamepadHapticActuator")
@js.native
class GamepadHapticActuatorCls () extends GamepadHapticActuator {
  /* CompleteClass */
  override val `type`: GamepadHapticActuatorType = js.native
  /* CompleteClass */
  override def pulse(value: scala.Double, duration: scala.Double): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("GamepadHapticActuator")
@js.native
object GamepadHapticActuator
  extends org.scalablytyped.runtime.Instantiable0[GamepadHapticActuator]

