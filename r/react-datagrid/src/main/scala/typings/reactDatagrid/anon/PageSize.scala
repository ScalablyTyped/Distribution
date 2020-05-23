package typings.reactDatagrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSize extends js.Object {
  var pageSize: Double
  var skip: Double
}

object PageSize {
  @scala.inline
  def apply(pageSize: Double, skip: Double): PageSize = {
    val __obj = js.Dynamic.literal(pageSize = pageSize.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSize]
  }
}

