package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration extends StObject {
  
  var inputStartingPosition: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration {
  
  @scala.inline
  def apply(inputStartingPosition: String): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal(inputStartingPosition = inputStartingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputStartingPosition(value: String): Self = StObject.set(x, "inputStartingPosition", value.asInstanceOf[js.Any])
  }
}
