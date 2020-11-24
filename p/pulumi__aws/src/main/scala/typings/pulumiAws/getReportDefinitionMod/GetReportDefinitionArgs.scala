package typings.pulumiAws.getReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReportDefinitionArgs extends js.Object {
  
  /**
    * The name of the report definition to match.
    */
  val reportName: String = js.native
}
object GetReportDefinitionArgs {
  
  @scala.inline
  def apply(reportName: String): GetReportDefinitionArgs = {
    val __obj = js.Dynamic.literal(reportName = reportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportDefinitionArgs]
  }
  
  @scala.inline
  implicit class GetReportDefinitionArgsOps[Self <: GetReportDefinitionArgs] (val x: Self) extends AnyVal {
    
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
    def setReportName(value: String): Self = this.set("reportName", value.asInstanceOf[js.Any])
  }
}
