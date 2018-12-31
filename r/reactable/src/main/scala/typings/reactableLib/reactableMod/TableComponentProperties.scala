package typings
package reactableLib.reactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponentProperties[T] extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnsType]] = js.undefined
  var data: js.UndefOr[js.Array[T]] = js.undefined
  var defaultSort: js.UndefOr[reactableLib.Anon_Column] = js.undefined
  var filterBy: js.UndefOr[java.lang.String] = js.undefined
  var filterable: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onFilter: js.UndefOr[FilterMethodType] = js.undefined
  var sortable: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

