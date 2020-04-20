package typings.primereact.paginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageState extends js.Object {
  var first: Double
  var page: Double
  var pageCount: Double
  var rows: Double
}

object PageState {
  @scala.inline
  def apply(first: Double, page: Double, pageCount: Double, rows: Double): PageState = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageState]
  }
}

