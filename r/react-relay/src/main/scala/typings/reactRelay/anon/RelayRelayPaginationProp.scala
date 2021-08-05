package typings.reactRelay.anon

import typings.reactRelay.mod.RelayPaginationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayRelayPaginationProp extends StObject {
  
  var relay: RelayPaginationProp
}
object RelayRelayPaginationProp {
  
  inline def apply(relay: RelayPaginationProp): RelayRelayPaginationProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayRelayPaginationProp]
  }
  
  extension [Self <: RelayRelayPaginationProp](x: Self) {
    
    inline def setRelay(value: RelayPaginationProp): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
  }
}
