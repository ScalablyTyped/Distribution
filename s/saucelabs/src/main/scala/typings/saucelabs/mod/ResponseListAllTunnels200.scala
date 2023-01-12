package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseListAllTunnels200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var tunnels: js.UndefOr[js.Array[Tunnel]] = js.undefined
}
object ResponseListAllTunnels200 {
  
  inline def apply(): ResponseListAllTunnels200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseListAllTunnels200]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseListAllTunnels200] (val x: Self) extends AnyVal {
    
    inline def setTunnels(value: js.Array[Tunnel]): Self = StObject.set(x, "tunnels", value.asInstanceOf[js.Any])
    
    inline def setTunnelsUndefined: Self = StObject.set(x, "tunnels", js.undefined)
    
    inline def setTunnelsVarargs(value: Tunnel*): Self = StObject.set(x, "tunnels", js.Array(value*))
  }
}
