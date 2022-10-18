package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.entrypointDotrootDotconsume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'entrypoint.root.consume',   profilerContext :unknown,   rootModuleID :string}> */
trait Readonlynameentrypointroo
  extends StObject
     with LogEvent {
  
  val name: entrypointDotrootDotconsume
  
  val profilerContext: Any
  
  val rootModuleID: String
}
object Readonlynameentrypointroo {
  
  inline def apply(profilerContext: Any, rootModuleID: String): Readonlynameentrypointroo = {
    val __obj = js.Dynamic.literal(name = "entrypoint.root.consume", profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameentrypointroo]
  }
  
  extension [Self <: Readonlynameentrypointroo](x: Self) {
    
    inline def setName(value: entrypointDotrootDotconsume): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProfilerContext(value: Any): Self = StObject.set(x, "profilerContext", value.asInstanceOf[js.Any])
    
    inline def setRootModuleID(value: String): Self = StObject.set(x, "rootModuleID", value.asInstanceOf[js.Any])
  }
}
