package typings.atPulumiAws.cloudformationGetExportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportResult extends js.Object {
  /**
    * The exporting_stack_id (AWS ARNs) equivalent `ExportingStackId` from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
    */
  val exportingStackId: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * The value from Cloudformation export identified by the export name found from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
    */
  val value: String
}

object GetExportResult {
  @scala.inline
  def apply(exportingStackId: String, id: String, name: String, value: String): GetExportResult = {
    val __obj = js.Dynamic.literal(exportingStackId = exportingStackId, id = id, name = name, value = value)
  
    __obj.asInstanceOf[GetExportResult]
  }
}

