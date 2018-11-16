package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnSortEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var multiColumnSort: scala.Boolean
  var sortAsc: scala.Boolean
  // Single column returned
  var sortCol: js.UndefOr[Column[T]] = js.undefined
  // Multiple columns returned
  var sortCols: js.UndefOr[js.Array[SortColumn[T]]] = js.undefined
}

