package typings.relayRuntime.anon

import typings.relayRuntime.libUtilRelayReplaySubjectMod.Event
import typings.relayRuntime.relayRuntimeStrings.complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with Event[Any] {
  
  var kind: complete
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(kind = "complete")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setKind(value: complete): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
