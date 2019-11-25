package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkspaceResponse extends js.Object {
  // the workspace that was deleted
  var data: js.UndefOr[Workspace] = js.undefined
}

object DeleteWorkspaceResponse {
  @scala.inline
  def apply(data: Workspace = null): DeleteWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceResponse]
  }
}

