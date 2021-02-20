package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class ResponseListAllTunnels200MutableBuilder[Self <: ResponseListAllTunnels200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTunnels(value: js.Array[Tunnel]): Self = StObject.set(x, "tunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelsUndefined: Self = StObject.set(x, "tunnels", js.undefined)
    
    @scala.inline
    def setTunnelsVarargs(value: Tunnel*): Self = StObject.set(x, "tunnels", js.Array(value :_*))
  }
}
