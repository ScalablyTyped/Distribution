package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput extends StObject {
  
  /**
    * The ARN of the delivery stream.
    */
  var resourceArn: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput {
  
  @scala.inline
  def apply(resourceArn: String): ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
