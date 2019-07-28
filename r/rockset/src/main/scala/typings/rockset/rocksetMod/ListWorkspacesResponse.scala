package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkspacesResponse extends js.Object {
  // list of workspaces
  var data: js.UndefOr[js.Array[Workspace]] = js.undefined
}

object ListWorkspacesResponse {
  @scala.inline
  def apply(data: js.Array[Workspace] = null): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
}

