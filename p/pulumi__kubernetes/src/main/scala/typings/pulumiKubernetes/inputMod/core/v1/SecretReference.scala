package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
  */
@js.native
trait SecretReference extends StObject {
  
  /**
    * Name is unique within a namespace to reference a secret resource.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Namespace defines the space within which the secret name must be unique.
    */
  var namespace: js.UndefOr[Input[String]] = js.native
}
object SecretReference {
  
  @scala.inline
  def apply(): SecretReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretReference]
  }
  
  @scala.inline
  implicit class SecretReferenceMutableBuilder[Self <: SecretReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
