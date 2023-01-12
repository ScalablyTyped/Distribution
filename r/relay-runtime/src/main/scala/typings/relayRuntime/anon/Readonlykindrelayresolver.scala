package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.relay_resolverDoterror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  kind :'relay_resolver.error',   owner :string,   fieldPath :string,   error :std.Error}> */
trait Readonlykindrelayresolver extends StObject {
  
  val error: js.Error
  
  val fieldPath: String
  
  val kind: relay_resolverDoterror
  
  val owner: String
}
object Readonlykindrelayresolver {
  
  inline def apply(error: js.Error, fieldPath: String, owner: String): Readonlykindrelayresolver = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any], kind = "relay_resolver.error", owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlykindrelayresolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlykindrelayresolver] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setKind(value: relay_resolverDoterror): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
