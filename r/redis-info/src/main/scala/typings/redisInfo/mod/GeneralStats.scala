package typings.redisInfo.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.redisInfo.anon.Calls
import typings.redisInfo.anon.Expires
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralStats extends StObject {
  
  var commands: StringDictionary[Calls]
  
  var databases: NumberDictionary[Expires]
}
object GeneralStats {
  
  inline def apply(commands: StringDictionary[Calls], databases: NumberDictionary[Expires]): GeneralStats = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], databases = databases.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralStats]
  }
  
  extension [Self <: GeneralStats](x: Self) {
    
    inline def setCommands(value: StringDictionary[Calls]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setDatabases(value: NumberDictionary[Expires]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
  }
}
