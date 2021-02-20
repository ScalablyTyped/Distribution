package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput extends StObject {
  
  /**
    * The ARN of the destination Kinesis data stream to write to.
    */
  var resourceArn: Input[String] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput {
  
  @scala.inline
  def apply(resourceArn: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
