package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-table.react-table.Column.Basics ]:? react-table.react-table.Column.Basics[P]}
- Dropped {[ P in keyof react-table.react-table.Column.CellProps ]:? react-table.react-table.Column.CellProps[P]}
- Dropped {[ P in keyof react-table.react-table.Column.FilterProps ]:? react-table.react-table.Column.FilterProps[P]}
- Dropped {[ P in keyof react-table.react-table.Column.FooterProps ]:? react-table.react-table.Column.FooterProps[P]}
- Dropped {[ P in keyof react-table.react-table.Column.HeaderProps ]:? react-table.react-table.Column.HeaderProps[P]} */ trait Column[D] extends js.Object {
  /**
    * Property name as string or Accessor
    * @example: 'myProperty'
    * @example ["a.b", "c"]
    * @example ["a", "b", "c"]
    * @example {"a": {"b": {"c": $}}}
    * @example (row) => row.propertyName
    */
  var accessor: js.UndefOr[Accessor[D]] = js.undefined
  /**
    * No description
    * @example (values, rows) => _.round(_.mean(values))
    * @example (values, rows) => _.sum(values)
    */
  var aggregate: js.UndefOr[Aggregator] = js.undefined
  /** Header Groups only */
  var columns: js.UndefOr[js.Array[Column[D]]] = js.undefined
  /**
    * Turns this column into a special column for specifying expander and pivot column options.
    * If this option is true and there is NOT a pivot column, the `expanderDefaults` options will be applied on top of the column options.
    * If this option is true and there IS a pivot column, the `pivotDefaults` options will be applied on top of the column options.
    * Adding a column with the `expander` option set will allow you to rearrange expander and pivot column orderings in the table.
    * It will also let you specify rendering of the header (and header group if this special column is placed in the `columns` option of another column) and the rendering of the expander itself.
    */
  var expander: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Conditional - A unique ID is required if the accessor is not a string or if you would like to override the column name used in server-side calls
    * @example 'myProperty'
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: undefined - A maximum width for this column.
    * @default undefined
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Turns this column into a special column for specifying pivot position in your column definitions.
    * The `pivotDefaults` options will be applied on top of this column's options.
    * It will also let you specify rendering of the header (and header group if this special column is placed in the `columns` option of another column)
    */
  var pivot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: undefined - A hardcoded width for the column. This overrides both min and max width options
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

