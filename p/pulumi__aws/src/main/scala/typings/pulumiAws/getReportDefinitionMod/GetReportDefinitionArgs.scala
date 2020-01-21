package typings.pulumiAws.getReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

