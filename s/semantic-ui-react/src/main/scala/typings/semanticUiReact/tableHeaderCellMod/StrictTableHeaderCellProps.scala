package typings.semanticUiReact.tableHeaderCellMod

import typings.semanticUiReact.semanticUiReactStrings.ascending
import typings.semanticUiReact.semanticUiReactStrings.descending
import typings.semanticUiReact.tableCellMod.StrictTableCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictTableHeaderCellProps extends StrictTableCellProps {
  /** A header cell can be sorted in ascending or descending order. */
  var sorted: js.UndefOr[ascending | descending] = js.native
}

object StrictTableHeaderCellProps {
  @scala.inline
  def apply(): StrictTableHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTableHeaderCellProps]
  }
  @scala.inline
  implicit class StrictTableHeaderCellPropsOps[Self <: StrictTableHeaderCellProps] (val x: Self) extends AnyVal {
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
    def setSorted(value: ascending | descending): Self = this.set("sorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
  }
  
}

