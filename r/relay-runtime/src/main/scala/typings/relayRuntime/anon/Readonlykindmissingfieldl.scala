package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.missing_fieldDotlog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  kind :'missing_field.log',   owner :string,   fieldPath :string}> */
trait Readonlykindmissingfieldl extends StObject {
  
  val fieldPath: String
  
  val kind: missing_fieldDotlog
  
  val owner: String
}
object Readonlykindmissingfieldl {
  
  inline def apply(fieldPath: String, owner: String): Readonlykindmissingfieldl = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any], kind = "missing_field.log", owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlykindmissingfieldl]
  }
  
  extension [Self <: Readonlykindmissingfieldl](x: Self) {
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setKind(value: missing_fieldDotlog): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
