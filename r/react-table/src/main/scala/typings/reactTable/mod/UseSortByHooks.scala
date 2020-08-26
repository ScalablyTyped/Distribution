package typings.reactTable.mod

import typings.reactTable.anon.PartialTableCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSortByHooks[D /* <: js.Object */] extends js.Object {
  var getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
}

object UseSortByHooks {
  @scala.inline
  def apply[/* <: js.Object */ D](
    getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseSortByHooks[D] = {
    val __obj = js.Dynamic.literal(getSortByToggleProps = getSortByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByHooks[D]]
  }
  @scala.inline
  implicit class UseSortByHooksOps[Self <: UseSortByHooks[_], /* <: js.Object */ D] (val x: Self with UseSortByHooks[D]) extends AnyVal {
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
    def setGetSortByTogglePropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = this.set("getSortByToggleProps", js.Array(value :_*))
    @scala.inline
    def setGetSortByToggleProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = this.set("getSortByToggleProps", value.asInstanceOf[js.Any])
  }
  
}

