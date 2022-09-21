package typings.reactRelay.anon

import typings.reactRelay.reactRelayTypesMod.RelayRefetchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayRelayRefetchProp extends StObject {
  
  var relay: RelayRefetchProp
}
object RelayRelayRefetchProp {
  
  inline def apply(relay: RelayRefetchProp): RelayRelayRefetchProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayRelayRefetchProp]
  }
  
  extension [Self <: RelayRelayRefetchProp](x: Self) {
    
    inline def setRelay(value: RelayRefetchProp): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
  }
}
