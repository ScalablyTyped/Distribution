package typings.rockset.mod

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
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceResponse]
  }
}

