package typings.rdflib

import typings.rdflib.rdflibMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete extends js.Object {
  var delete: js.UndefOr[js.Array[Statement]] = js.undefined
  var patch: js.UndefOr[js.Array[Statement]] = js.undefined
}

object Anon_Delete {
  @scala.inline
  def apply(delete: js.Array[Statement] = null, patch: js.Array[Statement] = null): Anon_Delete = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[Anon_Delete]
  }
}

