package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput extends StObject {
  
  /**
    * The ARN of the input Kinesis data stream to read.
    */
  var resourceArn: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput {
  
  inline def apply(resourceArn: String): ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
