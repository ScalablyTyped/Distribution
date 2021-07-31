package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceAOFOffInfo extends StObject {
  
  var aof_enabled: OFF
}
object PersistenceAOFOffInfo {
  
  @scala.inline
  def apply(aof_enabled: OFF): PersistenceAOFOffInfo = {
    val __obj = js.Dynamic.literal(aof_enabled = aof_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceAOFOffInfo]
  }
  
  @scala.inline
  implicit class PersistenceAOFOffInfoMutableBuilder[Self <: PersistenceAOFOffInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAof_enabled(value: OFF): Self = StObject.set(x, "aof_enabled", value.asInstanceOf[js.Any])
  }
}
