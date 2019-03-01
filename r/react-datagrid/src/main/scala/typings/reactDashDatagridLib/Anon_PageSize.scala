package typings
package reactDashDatagridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PageSize extends js.Object {
  var pageSize: scala.Double
  var skip: scala.Double
}

object Anon_PageSize {
  @scala.inline
  def apply(pageSize: scala.Double, skip: scala.Double): Anon_PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pageSize")(pageSize)
    __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[Anon_PageSize]
  }
}

