package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseListAllTunnels200
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var tunnels: js.UndefOr[js.Array[Tunnel]] = js.undefined
}
object ResponseListAllTunnels200 {
  
  inline def apply(): ResponseListAllTunnels200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseListAllTunnels200]
  }
  
  extension [Self <: ResponseListAllTunnels200](x: Self) {
    
    inline def setTunnels(value: js.Array[Tunnel]): Self = StObject.set(x, "tunnels", value.asInstanceOf[js.Any])
    
    inline def setTunnelsUndefined: Self = StObject.set(x, "tunnels", js.undefined)
    
    inline def setTunnelsVarargs(value: Tunnel*): Self = StObject.set(x, "tunnels", js.Array(value :_*))
  }
}
