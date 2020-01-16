package typings.atStorybookCsf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.Array[String]
  var root: String | Null
}

object Anon_Groups {
  @scala.inline
  def apply(groups: js.Array[String], root: String = null): Anon_Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Groups]
  }
}

