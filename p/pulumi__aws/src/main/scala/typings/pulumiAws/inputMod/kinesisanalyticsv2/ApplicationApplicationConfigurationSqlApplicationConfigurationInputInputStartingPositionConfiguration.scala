package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration extends StObject {
  
  var inputStartingPosition: js.UndefOr[Input[String]] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputStartingPosition(value: Input[String]): Self = StObject.set(x, "inputStartingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionUndefined: Self = StObject.set(x, "inputStartingPosition", js.undefined)
  }
}
