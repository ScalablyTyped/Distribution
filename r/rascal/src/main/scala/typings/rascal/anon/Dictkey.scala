package typings.rascal.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var channelMax: js.UndefOr[Double] = js.native
  
  var connection_timeout: js.UndefOr[Double] = js.native
  
  var heartbeat: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMax(value: Double): Self = StObject.set(x, "channelMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMaxUndefined: Self = StObject.set(x, "channelMax", js.undefined)
    
    @scala.inline
    def setConnection_timeout(value: Double): Self = StObject.set(x, "connection_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_timeoutUndefined: Self = StObject.set(x, "connection_timeout", js.undefined)
    
    @scala.inline
    def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
