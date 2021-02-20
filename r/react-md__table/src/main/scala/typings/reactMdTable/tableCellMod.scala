package typings.reactMdTable

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.ThHTMLAttributes
import typings.reactMdTable.configMod.TableCellConfig
import typings.reactMdTable.reactMdTableStrings.`100Percentsign`
import typings.reactMdTable.reactMdTableStrings.`header-cell`
import typings.reactMdTable.reactMdTableStrings.cell
import typings.reactMdTable.reactMdTableStrings.col
import typings.reactMdTable.reactMdTableStrings.colSpan
import typings.reactMdTable.reactMdTableStrings.colgroup
import typings.reactMdTable.reactMdTableStrings.header
import typings.reactMdTable.reactMdTableStrings.row
import typings.reactMdTable.reactMdTableStrings.rowgroup
import typings.reactMdTable.reactMdTableStrings.scope
import typings.reactMdTable.tableCellContentMod.SortOrder
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod {
  
  @JSImport("@react-md/table/types/TableCell", "TableCell")
  @js.native
  val TableCell: ForwardRefExoticComponent[TableCellProps with RefAttributes[TableCellElement]] = js.native
  
  type TableCellAttributes = Omit[
    TdHTMLAttributes[HTMLTableDataCellElement] | ThHTMLAttributes[HTMLTableHeaderCellElement], 
    colSpan | scope
  ]
  
  type TableCellElement = HTMLTableDataCellElement | HTMLTableHeaderCellElement
  
  @js.native
  trait TableCellOptions extends TableCellConfig {
    
    /**
      * The number of columns that the cell should span. If you would like a cell
      * to span an entire row ignoring the other rows and cells, you can set this
      * value to the number of columns within your table or `"100%"`.
      */
    var colSpan: js.UndefOr[Double | `100Percentsign`] = js.native
    
    /**
      * This is a bit of a "weird" prop since all it does is apply `width: 100%` to
      * this cell. This will make this specific cell fill the remaining width of
      * the table (if there is any). If no cells have this prop enabled and the
      * `fullWidth` table configuration is enabled, all cells will have an
      * equal-sized width.
      */
    var grow: js.UndefOr[Boolean] = js.native
    
    /**
      * This prop is only valid when the `header` prop is enabled or the
      * `TableCell` is a child of the `TableHeader` component. This will generally
      * be used with a value of `"row"` if you have table headers that are at the
      * start of each row instead of at the top of the table.
      */
    var scope: js.UndefOr[row | col | rowgroup | colgroup] = js.native
    
    /**
      * If this is a trueish value, the cell will become a sticky cell that will be
      * fixed while the user scrolls the table. When this is a `boolean` (or
      * inherited from a `TableHeader`) or set to `"header"`, the cell will act as
      * a sticky header that will be visible for vertical scrolling.
      *
      * When this is set to `"cell"`, the cell will be fixed to the left or right
      * for horizontal scrolling.
      *
      * Finally, if this is set to `"header-cell"`, it will be a combination of
      * both vertical and horizontal scrolling. This means that other sticky header
      * cells will scroll beneath this cell.
      */
    var sticky: js.UndefOr[Boolean | header | cell | `header-cell`] = js.native
  }
  object TableCellOptions {
    
    @scala.inline
    def apply(): TableCellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellOptions]
    }
    
    @scala.inline
    implicit class TableCellOptionsMutableBuilder[Self <: TableCellOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColSpan(value: Double | `100Percentsign`): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setGrow(value: Boolean): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
      
      @scala.inline
      def setScope(value: row | col | rowgroup | colgroup): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSticky(value: Boolean | header | cell | `header-cell`): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    }
  }
  
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
    implicit class TableCellPropsMutableBuilder[Self <: TableCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-sort`(value: SortOrder): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      @scala.inline
      def setSortIcon(value: ReactNode): Self = StObject.set(x, "sortIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortIconAfter(value: Boolean): Self = StObject.set(x, "sortIconAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortIconAfterUndefined: Self = StObject.set(x, "sortIconAfter", js.undefined)
      
      @scala.inline
      def setSortIconRotated(value: Boolean): Self = StObject.set(x, "sortIconRotated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortIconRotatedUndefined: Self = StObject.set(x, "sortIconRotated", js.undefined)
      
      @scala.inline
      def setSortIconUndefined: Self = StObject.set(x, "sortIcon", js.undefined)
    }
  }
}
