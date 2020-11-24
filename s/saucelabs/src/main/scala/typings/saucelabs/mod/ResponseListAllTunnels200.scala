package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseListAllTunnels200
  extends /* key */ StringDictionary[js.Any] {
  
  var tunnels: js.UndefOr[js.Array[Tunnel]] = js.native
}
object ResponseListAllTunnels200 {
  
  @scala.inline
  def apply(): ResponseListAllTunnels200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseListAllTunnels200]
  }
  
  @scala.inline
  implicit class ResponseListAllTunnels200Ops[Self <: ResponseListAllTunnels200] (val x: Self) extends AnyVal {
    
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
    def setTunnelsVarargs(value: Tunnel*): Self = this.set("tunnels", js.Array(value :_*))
    
    @scala.inline
    def setTunnels(value: js.Array[Tunnel]): Self = this.set("tunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnels: Self = this.set("tunnels", js.undefined)
  }
}
