package typings
package primereactLib.componentsPaginatorPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageState extends js.Object {
  var first: scala.Double
  var page: scala.Double
  var pageCount: scala.Double
  var rows: scala.Double
}

object PageState {
  @scala.inline
  def apply(first: scala.Double, page: scala.Double, pageCount: scala.Double, rows: scala.Double): PageState = {
    val __obj = js.Dynamic.literal(first = first, page = page, pageCount = pageCount, rows = rows)
  
    __obj.asInstanceOf[PageState]
  }
}

