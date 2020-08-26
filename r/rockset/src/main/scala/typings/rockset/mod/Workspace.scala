package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workspace extends js.Object {
  // number of collections that are immediate children of workspace
  var collection_count: js.UndefOr[Double] = js.native
  // ISO-8601 date of when workspace was created
  var created_at: js.UndefOr[String] = js.native
  // email of user who created the workspace
  var created_by: js.UndefOr[String] = js.native
  // longer explanation for the workspace
  var description: js.UndefOr[String] = js.native
  // descriptive label and unique identifier
  var name: js.UndefOr[String] = js.native
}

object Workspace {
  @scala.inline
  def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  @scala.inline
  implicit class WorkspaceOps[Self <: Workspace] (val x: Self) extends AnyVal {
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
    def setCollection_count(value: Double): Self = this.set("collection_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection_count: Self = this.set("collection_count", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCreated_by(value: String): Self = this.set("created_by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_by: Self = this.set("created_by", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

