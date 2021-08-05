package typings.raspiSoftPwm

import typings.raspiPeripheral.mod.Peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-soft-pwm", "SoftPWM")
  @js.native
  class SoftPWM protected () extends Peripheral {
    def this(config: String) = this()
    def this(config: Double) = this()
    def this(config: Config) = this()
    
    /* private */ var _dutyCycle: js.Any = js.native
    
    /* private */ var _frequency: js.Any = js.native
    
    /* private */ var _pwm: js.Any = js.native
    
    /* private */ var _range: js.Any = js.native
    
    val dutyCycle: Double = js.native
    
    val frequency: Double = js.native
    
    val range: Double = js.native
    
    def write(dutyCycle: Double): Unit = js.native
  }
  
  trait Config extends StObject {
    
    var frequency: js.UndefOr[Double] = js.undefined
    
    var pin: Double | String
    
    var range: js.UndefOr[Double] = js.undefined
  }
  object Config {
    
    inline def apply(pin: Double | String): Config = {
      val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
}
