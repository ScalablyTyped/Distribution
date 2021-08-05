package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceValidation is a list of validation methods for CustomResources.
  */
trait CustomResourceValidation extends StObject {
  
  /**
    * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
    */
  var openAPIV3Schema: js.UndefOr[Input[JSONSchemaProps]] = js.undefined
}
object CustomResourceValidation {
  
  inline def apply(): CustomResourceValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceValidation]
  }
  
  extension [Self <: CustomResourceValidation](x: Self) {
    
    inline def setOpenAPIV3Schema(value: Input[JSONSchemaProps]): Self = StObject.set(x, "openAPIV3Schema", value.asInstanceOf[js.Any])
    
    inline def setOpenAPIV3SchemaUndefined: Self = StObject.set(x, "openAPIV3Schema", js.undefined)
  }
}
