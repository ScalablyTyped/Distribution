package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationEnvironmentProperties extends js.Object {
  
  /**
    * Describes the execution property groups.
    */
  var propertyGroups: js.Array[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup] = js.native
}
object ApplicationApplicationConfigurationEnvironmentProperties {
  
  @scala.inline
  def apply(propertyGroups: js.Array[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]): ApplicationApplicationConfigurationEnvironmentProperties = {
    val __obj = js.Dynamic.literal(propertyGroups = propertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationEnvironmentProperties]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationEnvironmentPropertiesOps[Self <: ApplicationApplicationConfigurationEnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPropertyGroupsVarargs(value: ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup*): Self = this.set("propertyGroups", js.Array(value :_*))
    
    @scala.inline
    def setPropertyGroups(value: js.Array[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]): Self = this.set("propertyGroups", value.asInstanceOf[js.Any])
  }
}
