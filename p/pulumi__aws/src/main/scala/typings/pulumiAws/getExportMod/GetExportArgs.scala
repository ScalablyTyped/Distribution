package typings.pulumiAws.getExportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportArgs extends js.Object {
  /**
    * The name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
    */
  val name: String = js.native
}

object GetExportArgs {
  @scala.inline
  def apply(name: String): GetExportArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportArgs]
  }
}

