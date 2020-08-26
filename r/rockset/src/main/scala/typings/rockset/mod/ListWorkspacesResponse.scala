package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkspacesResponse extends js.Object {
  // list of workspaces
  var data: js.UndefOr[js.Array[Workspace]] = js.native
}

object ListWorkspacesResponse {
  @scala.inline
  def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  @scala.inline
  implicit class ListWorkspacesResponseOps[Self <: ListWorkspacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: Workspace*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Workspace]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

