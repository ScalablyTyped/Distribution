package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
  */
trait SecretReference extends StObject {
  
  /**
    * Name is unique within a namespace to reference a secret resource.
    */
  var name: String
  
  /**
    * Namespace defines the space within which the secret name must be unique.
    */
  var namespace: String
}
object SecretReference {
  
  @scala.inline
  def apply(name: String, namespace: String): SecretReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretReference]
  }
  
  @scala.inline
  implicit class SecretReferenceMutableBuilder[Self <: SecretReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
