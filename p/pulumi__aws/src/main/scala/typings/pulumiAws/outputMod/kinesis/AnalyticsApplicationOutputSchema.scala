package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationOutputSchema extends js.Object {
  
  /**
    * The Format Type of the records on the output stream. Can be `CSV` or `JSON`.
    */
  var recordFormatType: js.UndefOr[String] = js.native
}
object AnalyticsApplicationOutputSchema {
  
  @scala.inline
  def apply(): AnalyticsApplicationOutputSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationOutputSchema]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationOutputSchemaOps[Self <: AnalyticsApplicationOutputSchema] (val x: Self) extends AnyVal {
    
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
    def setRecordFormatType(value: String): Self = this.set("recordFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordFormatType: Self = this.set("recordFormatType", js.undefined)
  }
}
