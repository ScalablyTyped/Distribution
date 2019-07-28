package typings.primereact.componentsPaginatorPaginatorMod

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
    val __obj = js.Dynamic.literal(first = first, page = page, pageCount = pageCount, rows = rows)
  
    __obj.asInstanceOf[PageState]
  }
}

