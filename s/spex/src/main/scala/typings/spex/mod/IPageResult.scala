package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageResult extends js.Object {
  var duration: Double
  var pages: Double
  var total: Double
}

object IPageResult {
  @scala.inline
  def apply(duration: Double, pages: Double, total: Double): IPageResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageResult]
  }
}

