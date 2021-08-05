package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
  */
trait CustomResourceDefinitionStatus extends StObject {
  
  /**
    * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
    */
  var acceptedNames: Input[CustomResourceDefinitionNames]
  
  /**
    * conditions indicate state for particular aspects of a CustomResourceDefinition
    */
  var conditions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionCondition]]]] = js.undefined
  
  /**
    * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
    */
  var storedVersions: Input[js.Array[Input[String]]]
}
object CustomResourceDefinitionStatus {
  
  inline def apply(
    acceptedNames: Input[CustomResourceDefinitionNames],
    storedVersions: Input[js.Array[Input[String]]]
  ): CustomResourceDefinitionStatus = {
    val __obj = js.Dynamic.literal(acceptedNames = acceptedNames.asInstanceOf[js.Any], storedVersions = storedVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionStatus]
  }
  
  extension [Self <: CustomResourceDefinitionStatus](x: Self) {
    
    inline def setAcceptedNames(value: Input[CustomResourceDefinitionNames]): Self = StObject.set(x, "acceptedNames", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: Input[js.Array[Input[CustomResourceDefinitionCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[CustomResourceDefinitionCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setStoredVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "storedVersions", value.asInstanceOf[js.Any])
    
    inline def setStoredVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "storedVersions", js.Array(value :_*))
  }
}
