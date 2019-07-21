package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkspaceResponse extends js.Object {
  // the workspace that was requested
  var data: js.UndefOr[Workspace] = js.undefined
}

object GetWorkspaceResponse {
  @scala.inline
  def apply(data: Workspace = null): GetWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[GetWorkspaceResponse]
  }
}

