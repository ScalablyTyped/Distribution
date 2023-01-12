package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.storeDotsnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.snapshot'}> */
trait Readonlynamestoresnapshot
  extends StObject
     with LogEvent {
  
  val name: storeDotsnapshot
}
object Readonlynamestoresnapshot {
  
  inline def apply(): Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = "store.snapshot")
    __obj.asInstanceOf[Readonlynamestoresnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlynamestoresnapshot] (val x: Self) extends AnyVal {
    
    inline def setName(value: storeDotsnapshot): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
