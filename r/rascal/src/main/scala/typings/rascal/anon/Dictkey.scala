package typings.rascal.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var channelMax: js.UndefOr[Double] = js.undefined
  
  var connection_timeout: js.UndefOr[Double] = js.undefined
  
  var heartbeat: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    inline def setChannelMax(value: Double): Self = StObject.set(x, "channelMax", value.asInstanceOf[js.Any])
    
    inline def setChannelMaxUndefined: Self = StObject.set(x, "channelMax", js.undefined)
    
    inline def setConnection_timeout(value: Double): Self = StObject.set(x, "connection_timeout", value.asInstanceOf[js.Any])
    
    inline def setConnection_timeoutUndefined: Self = StObject.set(x, "connection_timeout", js.undefined)
    
    inline def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
