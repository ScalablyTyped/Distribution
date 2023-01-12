package typings.reactNativeReanimated.mod

import typings.reactNativeReanimated.reactNativeReanimatedStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorConfig extends StObject {
  
  var interval: Double | auto
}
object SensorConfig {
  
  inline def apply(interval: Double | auto): SensorConfig = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensorConfig] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double | auto): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
