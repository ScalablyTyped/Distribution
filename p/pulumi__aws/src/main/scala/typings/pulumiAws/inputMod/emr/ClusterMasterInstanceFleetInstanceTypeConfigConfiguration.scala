package typings.pulumiAws.inputMod.emr

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMasterInstanceFleetInstanceTypeConfigConfiguration extends StObject {
  
  /**
    * The classification within a configuration.
    */
  var classification: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A map of properties specified within a configuration classification
    */
  var properties: js.UndefOr[Input[StringDictionary[js.Any]]] = js.undefined
}
object ClusterMasterInstanceFleetInstanceTypeConfigConfiguration {
  
  inline def apply(): ClusterMasterInstanceFleetInstanceTypeConfigConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMasterInstanceFleetInstanceTypeConfigConfiguration]
  }
  
  extension [Self <: ClusterMasterInstanceFleetInstanceTypeConfigConfiguration](x: Self) {
    
    inline def setClassification(value: Input[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setProperties(value: Input[StringDictionary[js.Any]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
