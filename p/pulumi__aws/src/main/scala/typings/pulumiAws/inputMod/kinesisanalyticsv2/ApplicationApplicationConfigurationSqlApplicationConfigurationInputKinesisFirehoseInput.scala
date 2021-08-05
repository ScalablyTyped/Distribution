package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput extends StObject {
  
  /**
    * The ARN of the delivery stream.
    */
  var resourceArn: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput {
  
  inline def apply(resourceArn: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput](x: Self) {
    
    inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
