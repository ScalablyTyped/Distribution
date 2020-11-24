package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema extends js.Object {
  
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
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecordFormatType(value: Input[String]): Self = this.set("recordFormatType", value.asInstanceOf[js.Any])
  }
}
