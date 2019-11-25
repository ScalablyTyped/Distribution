package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkspaceResponse extends js.Object {
  // the workspace that was created
  var data: js.UndefOr[Workspace] = js.undefined
}

object CreateWorkspaceResponse {
  @scala.inline
  def apply(data: Workspace = null): CreateWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceResponse]
  }
}

