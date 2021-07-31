package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCoreInstanceFleetInstanceTypeConfigConfiguration extends StObject {
  
  /**
    * The classification within a configuration.
    */
  var classification: js.UndefOr[String] = js.undefined
  
  /**
    * A map of properties specified within a configuration classification
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object ClusterCoreInstanceFleetInstanceTypeConfigConfiguration {
  
  @scala.inline
  def apply(): ClusterCoreInstanceFleetInstanceTypeConfigConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetInstanceTypeConfigConfigurationMutableBuilder[Self <: ClusterCoreInstanceFleetInstanceTypeConfigConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
