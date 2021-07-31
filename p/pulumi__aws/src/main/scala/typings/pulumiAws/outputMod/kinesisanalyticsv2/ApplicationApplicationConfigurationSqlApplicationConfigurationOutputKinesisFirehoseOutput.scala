package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput extends StObject {
  
  /**
    * The ARN of the destination delivery stream to write to.
    */
  var resourceArn: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput {
  
  @scala.inline
  def apply(resourceArn: String): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
