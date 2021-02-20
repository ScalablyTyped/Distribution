package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema extends StObject {
  
  /**
    * Specifies the format of the records on the output stream. Valid values: `CSV`, `JSON`.
    */
  var recordFormatType: Input[String] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema {
  
  @scala.inline
  def apply(recordFormatType: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordFormatType(value: Input[String]): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
