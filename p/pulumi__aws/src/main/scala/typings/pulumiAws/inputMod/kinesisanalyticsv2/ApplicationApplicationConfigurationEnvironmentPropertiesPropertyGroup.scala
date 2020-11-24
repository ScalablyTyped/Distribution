package typings.pulumiAws.inputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup extends js.Object {
  
  /**
    * The key of the application execution property key-value map.
    */
  var propertyGroupId: Input[String] = js.native
  
  /**
    * Application execution property key-value map.
    */
  var propertyMap: Input[StringDictionary[Input[String]]] = js.native
}
object ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup {
  
  @scala.inline
  def apply(propertyGroupId: Input[String], propertyMap: Input[StringDictionary[Input[String]]]): ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup = {
    val __obj = js.Dynamic.literal(propertyGroupId = propertyGroupId.asInstanceOf[js.Any], propertyMap = propertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupOps[Self <: ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup] (val x: Self) extends AnyVal {
    
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
    def setPropertyGroupId(value: Input[String]): Self = this.set("propertyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyMap(value: Input[StringDictionary[Input[String]]]): Self = this.set("propertyMap", value.asInstanceOf[js.Any])
  }
}
