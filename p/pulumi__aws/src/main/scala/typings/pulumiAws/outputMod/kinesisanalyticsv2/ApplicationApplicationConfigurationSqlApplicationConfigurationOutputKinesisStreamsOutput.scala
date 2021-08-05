package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput extends StObject {
  
  /**
    * The ARN of the destination Kinesis data stream to write to.
    */
  var resourceArn: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput {
  
  inline def apply(resourceArn: String): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
