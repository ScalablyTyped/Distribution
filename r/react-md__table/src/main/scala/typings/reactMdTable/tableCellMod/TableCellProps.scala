package typings.reactMdTable.tableCellMod

import typings.react.mod.ReactNode
import typings.reactMdTable.tableCellContentMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.TdHTMLAttributes<std.HTMLTableDataCellElement> | react.react.ThHTMLAttributes<std.HTMLTableHeaderCellElement>, 'colSpan' | 'scope'> ]: react.react.TdHTMLAttributes<std.HTMLTableDataCellElement> | react.react.ThHTMLAttributes<std.HTMLTableHeaderCellElement>[P]} */ @js.native
trait TableCellProps extends TableCellOptions {
  /**
    * If you want to apply a sort icon for a header cell, set this prop to either
    * `"ascending"` or `"descending"`. When you change the sort order, this prop
    * should change as well which will cause the sort icon to rotate. The default
    * behavior is to have the icon facing upwards and not-rotated when
    * `"ascending"`, otherwise it will rotate downwards when `"descending"`.
    *
    * If this prop is set to `"none"`, the cell will render the clickable button
    * in the children, just without the sort icon. This is so that the sort
    * behavior can still be toggled for keyboard users and will be tab-focusable.
    */
  var `aria-sort`: js.UndefOr[SortOrder] = js.native
  /**
    * Boolean if cell should no longer have any padding since you want a child
    * element to span the entire size of the cell instead. This is helpful when
    * rendering clickable and focusable elements within a cell.
    *
    * This will be defaulted to `true` if the `"aria-sort"` prop has been
    * provided and the `sortIcon` is not resoled as `null`. You can override this
    * default behavior by manually setting this to `true` or `false`.
    */
  var disablePadding: js.UndefOr[Boolean] = js.native
  /**
    * An optional sort icon to use. This will be defaulted to the configured sort
    * icon from the `@react-md/icon` package. If you do not want the default
    * implementation for the sort icon behavior from `react-md`, you can set this
    * prop to `null`.
    */
  var sortIcon: js.UndefOr[ReactNode] = js.native
  /**
    * Boolean if the sort icon should appear after the children in the cell
    * instead of before.
    */
  var sortIconAfter: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the sort icon should be rotated instead of the default
    * direction. When this is `undefined`, it will only be `true` when the
    * `"aria-sort"` prop is set to `"descending"`. If this is not `undefined`,
    * its boolean value will always be used.
    */
  var sortIconRotated: js.UndefOr[Boolean] = js.native
}

object TableCellProps {
  @scala.inline
  def apply(): TableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProps]
  }
  @scala.inline
  implicit class TableCellPropsOps[Self <: TableCellProps] (val x: Self) extends AnyVal {
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
    def `setAria-sort`(value: SortOrder): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def setDisablePadding(value: Boolean): Self = this.set("disablePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePadding: Self = this.set("disablePadding", js.undefined)
    @scala.inline
    def setSortIcon(value: ReactNode): Self = this.set("sortIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortIcon: Self = this.set("sortIcon", js.undefined)
    @scala.inline
    def setSortIconAfter(value: Boolean): Self = this.set("sortIconAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortIconAfter: Self = this.set("sortIconAfter", js.undefined)
    @scala.inline
    def setSortIconRotated(value: Boolean): Self = this.set("sortIconRotated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortIconRotated: Self = this.set("sortIconRotated", js.undefined)
  }
  
}

