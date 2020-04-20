package typings.pulumiAws.getExportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportResult extends js.Object {
  /**
    * The exportingStackId (AWS ARNs) equivalent `ExportingStackId` from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
    */
  val exportingStackId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The value from Cloudformation export identified by the export name found from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
    */
  val value: String = js.native
}

object GetExportResult {
  @scala.inline
  def apply(exportingStackId: String, id: String, name: String, value: String): GetExportResult = {
    val __obj = js.Dynamic.literal(exportingStackId = exportingStackId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportResult]
  }
}

