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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setKind(value: complete): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
