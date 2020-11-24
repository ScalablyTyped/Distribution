package typings.rascal.anon

import org.scalablytyped.runtime.StringDictionary
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
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelMax(value: Double): Self = this.set("channelMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMax: Self = this.set("channelMax", js.undefined)
    
    @scala.inline
    def setConnection_timeout(value: Double): Self = this.set("connection_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_timeout: Self = this.set("connection_timeout", js.undefined)
    
    @scala.inline
    def setHeartbeat(value: Double): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeat: Self = this.set("heartbeat", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
