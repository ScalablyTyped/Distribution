package typings.raspiPwm

import typings.raspiPeripheral.mod.Peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-pwm", "PWM")
  @js.native
  class PWM () extends Peripheral {
    def this(config: String) = this()
    def this(config: Double) = this()
    def this(config: Config) = this()
    
    var _dutyCycleValue: js.Any = js.native
    
    var _frequencyValue: js.Any = js.native
    
    var _pwm: js.Any = js.native
    
    var _pwmPort: js.Any = js.native
    
    val dutyCycle: Double = js.native
    
    val frequency: Double = js.native
    
    def write(dutyCycle: Double): Unit = js.native
  }
  
  @js.native
  trait Config extends StObject {
    
    var frequency: js.UndefOr[Double] = js.native
    
    var pin: js.UndefOr[Double | String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    }
  }
}
