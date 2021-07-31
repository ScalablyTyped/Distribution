package typings.pulumiAws.inputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup extends StObject {
  
  /**
    * The key of the application execution property key-value map.
    */
  var propertyGroupId: Input[String]
  
  /**
    * Application execution property key-value map.
    */
  var propertyMap: Input[StringDictionary[Input[String]]]
}
object ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup {
  
  @scala.inline
  def apply(propertyGroupId: Input[String], propertyMap: Input[StringDictionary[Input[String]]]): ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup = {
    val __obj = js.Dynamic.literal(propertyGroupId = propertyGroupId.asInstanceOf[js.Any], propertyMap = propertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupMutableBuilder[Self <: ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyGroupId(value: Input[String]): Self = StObject.set(x, "propertyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyMap(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "propertyMap", value.asInstanceOf[js.Any])
  }
}
