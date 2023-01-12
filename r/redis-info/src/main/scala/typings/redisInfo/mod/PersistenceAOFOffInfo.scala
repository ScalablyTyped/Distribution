package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceAOFOffInfo extends StObject {
  
  var aof_enabled: OFF
}
object PersistenceAOFOffInfo {
  
  inline def apply(aof_enabled: OFF): PersistenceAOFOffInfo = {
    val __obj = js.Dynamic.literal(aof_enabled = aof_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceAOFOffInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistenceAOFOffInfo] (val x: Self) extends AnyVal {
    
    inline def setAof_enabled(value: OFF): Self = StObject.set(x, "aof_enabled", value.asInstanceOf[js.Any])
  }
}
