package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotstart
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.notify.start'}> */
trait Readonlynamestorenotifyst
  extends StObject
     with LogEvent {
  
  val name: storeDotnotifyDotstart
}
object Readonlynamestorenotifyst {
  
  inline def apply(): Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = "store.notify.start")
    __obj.asInstanceOf[Readonlynamestorenotifyst]
  }
  
  extension [Self <: Readonlynamestorenotifyst](x: Self) {
    
    inline def setName(value: storeDotnotifyDotstart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
