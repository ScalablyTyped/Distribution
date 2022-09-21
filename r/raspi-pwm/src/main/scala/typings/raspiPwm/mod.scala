package typings.raspiPwm

import typings.raspiPeripheral.mod.Peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-pwm", "PWM")
  @js.native
  open class PWM () extends Peripheral {
    def this(config: String) = this()
    def this(config: Double) = this()
    def this(config: Config) = this()
    
    /* private */ var _dutyCycleValue: Any = js.native
    
    /* private */ var _frequencyValue: Any = js.native
    
    /* private */ var _pwm: Any = js.native
    
    /* private */ var _pwmPort: Any = js.native
    
    val dutyCycle: Double = js.native
    
    val frequency: Double = js.native
    
    def write(dutyCycle: Double): Unit = js.native
  }
  
  trait Config extends StObject {
    
    var frequency: js.UndefOr[Double] = js.undefined
    
    var pin: js.UndefOr[Double | String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    }
  }
}
