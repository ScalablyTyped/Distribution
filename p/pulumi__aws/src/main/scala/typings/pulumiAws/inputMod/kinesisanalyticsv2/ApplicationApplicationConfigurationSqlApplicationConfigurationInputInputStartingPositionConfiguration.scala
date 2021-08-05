package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration extends StObject {
  
  var inputStartingPosition: js.UndefOr[Input[String]] = js.undefined
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration {
  
  inline def apply(): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration](x: Self) {
    
    inline def setInputStartingPosition(value: Input[String]): Self = StObject.set(x, "inputStartingPosition", value.asInstanceOf[js.Any])
    
    inline def setInputStartingPositionUndefined: Self = StObject.set(x, "inputStartingPosition", js.undefined)
  }
}
