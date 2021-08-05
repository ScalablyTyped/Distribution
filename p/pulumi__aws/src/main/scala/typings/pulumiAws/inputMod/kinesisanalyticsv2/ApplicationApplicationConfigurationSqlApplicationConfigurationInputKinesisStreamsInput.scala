package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput extends StObject {
  
  /**
    * The ARN of the input Kinesis data stream to read.
    */
  var resourceArn: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput {
  
  inline def apply(resourceArn: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput](x: Self) {
    
    inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
