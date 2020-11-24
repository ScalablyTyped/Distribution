package typings.raspiGpio.mod

import typings.raspiPeripheral.mod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raspi-gpio", "DigitalOutput")
@js.native
class DigitalOutput protected () extends Peripheral {
  def this(config: String) = this()
  def this(config: Double) = this()
  def this(config: Config) = this()
  
  var _currentValue: js.Any = js.native
  
  var _output: js.Any = js.native
  
  val value: Double = js.native
  
  def write(value: Double): Unit = js.native
}
