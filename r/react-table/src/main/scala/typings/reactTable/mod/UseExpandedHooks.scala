package typings.reactTable.mod

import typings.reactTable.anon.PartialTableCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseExpandedHooks[D /* <: js.Object */] extends js.Object {
  var getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
  var getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
}

object UseExpandedHooks {
  @scala.inline
  def apply[/* <: js.Object */ D](
    getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]],
    getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseExpandedHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllRowsExpandedProps = getToggleAllRowsExpandedProps.asInstanceOf[js.Any], getToggleRowsExpandedProps = getToggleRowsExpandedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedHooks[D]]
  }
  @scala.inline
  implicit class UseExpandedHooksOps[Self <: UseExpandedHooks[_], /* <: js.Object */ D] (val x: Self with UseExpandedHooks[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetToggleAllRowsExpandedPropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = this.set("getToggleAllRowsExpandedProps", js.Array(value :_*))
    @scala.inline
    def setGetToggleAllRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = this.set("getToggleAllRowsExpandedProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetToggleRowsExpandedPropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = this.set("getToggleRowsExpandedProps", js.Array(value :_*))
    @scala.inline
    def setGetToggleRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = this.set("getToggleRowsExpandedProps", value.asInstanceOf[js.Any])
  }
  
}

