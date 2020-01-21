package typings.reactDatagrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPageSize extends js.Object {
  var pageSize: Double
  var skip: Double
}

object AnonPageSize {
  @scala.inline
  def apply(pageSize: Double, skip: Double): AnonPageSize = {
    val __obj = js.Dynamic.literal(pageSize = pageSize.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPageSize]
  }
}

