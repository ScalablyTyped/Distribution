package typings
package reactDashDatagridLib.reactDashDatagridMod.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortInfo extends js.Object {
  var dir: java.lang.String
  var name: java.lang.String
}

object SortInfo {
  @scala.inline
  def apply(dir: java.lang.String, name: java.lang.String): SortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir")(dir)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SortInfo]
  }
}

