package typings.reactTable.mod

import typings.reactTable.PartialTableCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseExpandedHooks[D /* <: js.Object */] extends js.Object {
  var getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  var getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
}

object UseExpandedHooks {
  @scala.inline
  def apply[D /* <: js.Object */](
    getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]],
    getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseExpandedHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllRowsExpandedProps = getToggleAllRowsExpandedProps.asInstanceOf[js.Any], getToggleRowsExpandedProps = getToggleRowsExpandedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedHooks[D]]
  }
}

