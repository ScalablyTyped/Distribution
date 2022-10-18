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
  
  extension [Self <: Readonlynamestoresnapshot](x: Self) {
    
    inline def setName(value: storeDotsnapshot): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
