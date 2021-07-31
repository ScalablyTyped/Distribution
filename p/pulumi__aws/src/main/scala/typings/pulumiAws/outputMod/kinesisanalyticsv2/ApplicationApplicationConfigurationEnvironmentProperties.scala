package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationEnvironmentProperties extends StObject {
  
  /**
    * Describes the execution property groups.
    */
  var propertyGroups: js.Array[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]
}
object ApplicationApplicationConfigurationEnvironmentProperties {
  
  @scala.inline
  def apply(propertyGroups: js.Array[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]): ApplicationApplicationConfigurationEnvironmentProperties = {
    val __obj = js.Dynamic.literal(propertyGroups = propertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationEnvironmentProperties]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationEnvironmentPropertiesMutableBuilder[Self <: ApplicationApplicationConfigurationEnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyGroups(value: js.Array[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]): Self = StObject.set(x, "propertyGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyGroupsVarargs(value: ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup*): Self = StObject.set(x, "propertyGroups", js.Array(value :_*))
  }
}
