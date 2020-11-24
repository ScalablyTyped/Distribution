package typings.raspiGpio.mod

import typings.raspiPeripheral.mod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raspi-gpio", "DigitalInput")
@js.native
class DigitalInput protected () extends Peripheral {
  def this(config: String) = this()
  def this(config: Double) = this()
  def this(config: Config) = this()
  
  var _currentValue: js.Any = js.native
  
  var _input: js.Any = js.native
  
  def read(): Double = js.native
  
  val value: Double = js.native
}
