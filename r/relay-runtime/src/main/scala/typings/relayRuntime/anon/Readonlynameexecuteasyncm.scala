package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDotasyncDotmodule
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.async.module',   executeId :number,   operationName :string,   duration :number}> */
trait Readonlynameexecuteasyncm
  extends StObject
     with LogEvent {
  
  val duration: Double
  
  val executeId: Double
  
  val name: executeDotasyncDotmodule
  
  val operationName: String
}
object Readonlynameexecuteasyncm {
  
  inline def apply(duration: Double, executeId: Double, operationName: String): Readonlynameexecuteasyncm = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.async.module", operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteasyncm]
  }
  
  extension [Self <: Readonlynameexecuteasyncm](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setExecuteId(value: Double): Self = StObject.set(x, "executeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: executeDotasyncDotmodule): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
  }
}
