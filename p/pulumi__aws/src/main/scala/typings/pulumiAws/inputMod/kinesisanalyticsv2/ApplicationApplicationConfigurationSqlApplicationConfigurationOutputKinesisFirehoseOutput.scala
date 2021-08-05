package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput extends StObject {
  
  /**
    * The ARN of the destination delivery stream to write to.
    */
  var resourceArn: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput {
  
  inline def apply(resourceArn: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput](x: Self) {
    
    inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
