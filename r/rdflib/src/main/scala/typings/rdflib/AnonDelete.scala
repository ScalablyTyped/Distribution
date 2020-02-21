package typings.rdflib

import typings.rdflib.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  var delete: js.UndefOr[js.Array[Statement]] = js.undefined
  var patch: js.UndefOr[js.Array[Statement]] = js.undefined
}

object AnonDelete {
  @scala.inline
  def apply(delete: js.Array[Statement] = null, patch: js.Array[Statement] = null): AnonDelete = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelete]
  }
}

