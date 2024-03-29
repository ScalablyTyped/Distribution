package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfiguration extends StObject {
  
  var logDriver: LogDriver
  
  var options: js.UndefOr[StringDictionary[String]] = js.undefined
}
object LogConfiguration {
  
  inline def apply(logDriver: LogDriver): LogConfiguration = {
    val __obj = js.Dynamic.literal(logDriver = logDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfiguration]
  }
  
  extension [Self <: LogConfiguration](x: Self) {
    
    inline def setLogDriver(value: LogDriver): Self = StObject.set(x, "logDriver", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
