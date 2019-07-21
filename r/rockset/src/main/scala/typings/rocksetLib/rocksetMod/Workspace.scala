package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workspace extends js.Object {
  // number of collections that are immediate children of workspace
  var collection_count: js.UndefOr[scala.Double] = js.undefined
  // ISO-8601 date of when workspace was created
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  // email of user who created the workspace
  var created_by: js.UndefOr[java.lang.String] = js.undefined
  // longer explanation for the workspace
  var description: js.UndefOr[java.lang.String] = js.undefined
  // descriptive label and unique identifier
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Workspace {
  @scala.inline
  def apply(
    collection_count: scala.Int | scala.Double = null,
    created_at: java.lang.String = null,
    created_by: java.lang.String = null,
    description: java.lang.String = null,
    name: java.lang.String = null
  ): Workspace = {
    val __obj = js.Dynamic.literal()
    if (collection_count != null) __obj.updateDynamic("collection_count")(collection_count.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (created_by != null) __obj.updateDynamic("created_by")(created_by)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Workspace]
  }
}

