package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
  */
trait TypedLocalObjectReference extends StObject {
  
  /**
    * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
    */
  var apiGroup: String
  
  /**
    * Kind is the type of resource being referenced
    */
  var kind: String
  
  /**
    * Name is the name of resource being referenced
    */
  var name: String
}
object TypedLocalObjectReference {
  
  inline def apply(apiGroup: String, kind: String, name: String): TypedLocalObjectReference = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLocalObjectReference]
  }
  
  extension [Self <: TypedLocalObjectReference](x: Self) {
    
    inline def setApiGroup(value: String): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
