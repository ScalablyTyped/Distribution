package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationEnvironmentProperties extends StObject {
  
  /**
    * Describes the execution property groups.
    */
  var propertyGroups: Input[
    js.Array[Input[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]]
  ] = js.native
}
object ApplicationApplicationConfigurationEnvironmentProperties {
  
  @scala.inline
  def apply(
    propertyGroups: Input[
      js.Array[Input[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]]
    ]
  ): ApplicationApplicationConfigurationEnvironmentProperties = {
    val __obj = js.Dynamic.literal(propertyGroups = propertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationEnvironmentProperties]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationEnvironmentPropertiesMutableBuilder[Self <: ApplicationApplicationConfigurationEnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyGroups(
      value: Input[
          js.Array[Input[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]]
        ]
    ): Self = StObject.set(x, "propertyGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyGroupsVarargs(value: Input[ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup]*): Self = StObject.set(x, "propertyGroups", js.Array(value :_*))
  }
}
