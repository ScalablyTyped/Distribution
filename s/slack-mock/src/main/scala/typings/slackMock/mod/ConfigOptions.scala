package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigOptions extends StObject {
  
  var logLevel: js.UndefOr[String] = js.undefined
  
  var rtmPort: js.UndefOr[Double] = js.undefined
}
object ConfigOptions {
  
  inline def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setRtmPort(value: Double): Self = StObject.set(x, "rtmPort", value.asInstanceOf[js.Any])
    
    inline def setRtmPortUndefined: Self = StObject.set(x, "rtmPort", js.undefined)
  }
}
