package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormat extends js.Object {
  
  /**
    * The Mapping Information for the record format.
    * See Mapping Parameters below for more details.
    */
  var mappingParameters: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]] = js.native
  
  /**
    * The type of Record Format. Can be `CSV` or `JSON`.
    */
  var recordFormatType: js.UndefOr[Input[String]] = js.native
}
object AnalyticsApplicationInputsSchemaRecordFormat {
  
  @scala.inline
  def apply(): AnalyticsApplicationInputsSchemaRecordFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormat]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordFormatOps[Self <: AnalyticsApplicationInputsSchemaRecordFormat] (val x: Self) extends AnyVal {
    
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
    def setMappingParameters(value: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]): Self = this.set("mappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappingParameters: Self = this.set("mappingParameters", js.undefined)
    
    @scala.inline
    def setRecordFormatType(value: Input[String]): Self = this.set("recordFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordFormatType: Self = this.set("recordFormatType", js.undefined)
  }
}
