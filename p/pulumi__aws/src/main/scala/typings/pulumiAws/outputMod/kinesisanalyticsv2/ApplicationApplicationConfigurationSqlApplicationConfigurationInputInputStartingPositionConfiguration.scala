package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration extends js.Object {
  
  var inputStartingPosition: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration {
  
  @scala.inline
  def apply(inputStartingPosition: String): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal(inputStartingPosition = inputStartingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setInputStartingPosition(value: String): Self = this.set("inputStartingPosition", value.asInstanceOf[js.Any])
  }
}
