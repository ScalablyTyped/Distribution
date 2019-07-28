package typings.reactDashDatagrid.reactDashDatagridMod.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortInfo extends js.Object {
  var dir: String
  var name: String
}

object SortInfo {
  @scala.inline
  def apply(dir: String, name: String): SortInfo = {
    val __obj = js.Dynamic.literal(dir = dir, name = name)
  
    __obj.asInstanceOf[SortInfo]
  }
}

