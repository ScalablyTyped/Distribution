package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup extends StObject {
  
  /**
    * The key of the application execution property key-value map.
    */
  var propertyGroupId: String
  
  /**
    * Application execution property key-value map.
    */
  var propertyMap: StringDictionary[String]
}
object ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup {
  
  inline def apply(propertyGroupId: String, propertyMap: StringDictionary[String]): ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup = {
    val __obj = js.Dynamic.literal(propertyGroupId = propertyGroupId.asInstanceOf[js.Any], propertyMap = propertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]
  }
  
  extension [Self <: ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup](x: Self) {
    
    inline def setPropertyGroupId(value: String): Self = StObject.set(x, "propertyGroupId", value.asInstanceOf[js.Any])
    
    inline def setPropertyMap(value: StringDictionary[String]): Self = StObject.set(x, "propertyMap", value.asInstanceOf[js.Any])
  }
}
