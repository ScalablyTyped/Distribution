package typings.atPulumiAws.curGetReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportDefinitionArgs extends js.Object {
  /**
    * The name of the report definition to match.
    */
  val reportName: String
}

object GetReportDefinitionArgs {
  @scala.inline
  def apply(reportName: String): GetReportDefinitionArgs = {
    val __obj = js.Dynamic.literal(reportName = reportName)
  
    __obj.asInstanceOf[GetReportDefinitionArgs]
  }
}

