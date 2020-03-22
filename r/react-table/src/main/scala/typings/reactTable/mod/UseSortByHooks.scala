package typings.reactTable.mod

import typings.reactTable.PartialTableCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSortByHooks[D /* <: js.Object */] extends js.Object {
  var getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
}

object UseSortByHooks {
  @scala.inline
  def apply[D /* <: js.Object */](
    getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseSortByHooks[D] = {
    val __obj = js.Dynamic.literal(getSortByToggleProps = getSortByToggleProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseSortByHooks[D]]
  }
}

