package typings.storybookCsf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: js.Array[String]
  var root: String | Null
}

object Groups {
  @scala.inline
  def apply(groups: js.Array[String], root: String = null): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

