package typings
package atPulumiAwsLib.cloudformationGetExportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportArgs extends js.Object {
  /**
    * The name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
    */
  val name: java.lang.String
}

object GetExportArgs {
  @scala.inline
  def apply(name: java.lang.String): GetExportArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetExportArgs]
  }
}

