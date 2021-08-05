package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commands extends StObject {
  
  var commands: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  
  var lifecycleEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  var options: js.UndefOr[StringDictionary[Required]] = js.undefined
  
  var usage: js.UndefOr[String] = js.undefined
}
object Commands {
  
  inline def apply(): Commands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commands]
  }
  
  extension [Self <: Commands](x: Self) {
    
    inline def setCommands(value: StringDictionary[js.Object]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setLifecycleEvents(value: js.Array[String]): Self = StObject.set(x, "lifecycleEvents", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventsUndefined: Self = StObject.set(x, "lifecycleEvents", js.undefined)
    
    inline def setLifecycleEventsVarargs(value: String*): Self = StObject.set(x, "lifecycleEvents", js.Array(value :_*))
    
    inline def setOptions(value: StringDictionary[Required]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
