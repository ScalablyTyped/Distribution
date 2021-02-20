package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup extends StObject {
  
  /**
    * The key of the application execution property key-value map.
    */
  var propertyGroupId: String = js.native
  
  /**
    * Application execution property key-value map.
    */
  var propertyMap: StringDictionary[String] = js.native
}
object ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup {
  
  @scala.inline
  def apply(propertyGroupId: String, propertyMap: StringDictionary[String]): ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup = {
    val __obj = js.Dynamic.literal(propertyGroupId = propertyGroupId.asInstanceOf[js.Any], propertyMap = propertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupMutableBuilder[Self <: ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyGroupId(value: String): Self = StObject.set(x, "propertyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyMap(value: StringDictionary[String]): Self = StObject.set(x, "propertyMap", value.asInstanceOf[js.Any])
  }
}
