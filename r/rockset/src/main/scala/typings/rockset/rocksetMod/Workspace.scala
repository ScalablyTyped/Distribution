package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workspace extends js.Object {
  // number of collections that are immediate children of workspace
  var collection_count: js.UndefOr[Double] = js.undefined
  // ISO-8601 date of when workspace was created
  var created_at: js.UndefOr[String] = js.undefined
  // email of user who created the workspace
  var created_by: js.UndefOr[String] = js.undefined
  // longer explanation for the workspace
  var description: js.UndefOr[String] = js.undefined
  // descriptive label and unique identifier
  var name: js.UndefOr[String] = js.undefined
}

object Workspace {
  @scala.inline
  def apply(
    collection_count: Int | Double = null,
    created_at: String = null,
    created_by: String = null,
    description: String = null,
    name: String = null
  ): Workspace = {
    val __obj = js.Dynamic.literal()
    if (collection_count != null) __obj.updateDynamic("collection_count")(collection_count.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (created_by != null) __obj.updateDynamic("created_by")(created_by.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
}

