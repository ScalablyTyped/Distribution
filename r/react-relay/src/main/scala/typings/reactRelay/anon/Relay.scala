package typings.reactRelay.anon

import typings.reactRelay.reactRelayTypesMod.RelayProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relay extends StObject {
  
  var relay: js.UndefOr[RelayProp] = js.undefined
}
object Relay {
  
  inline def apply(): Relay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Relay] (val x: Self) extends AnyVal {
    
    inline def setRelay(value: RelayProp): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    
    inline def setRelayUndefined: Self = StObject.set(x, "relay", js.undefined)
  }
}
