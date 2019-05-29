package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-table.react-table.Column.Basics<D> ]:? react-table.react-table.Column.Basics<D>[P]}
- Dropped {[ P in keyof react-table.react-table.Column.CellProps<D> ]:? react-table.react-table.Column.CellProps<D>[P]}
- Dropped {[ P in keyof react-table.react-table.Column.FilterProps<D> ]:? react-table.react-table.Column.FilterProps<D>[P]}
- Dropped {[ P in keyof react-table.react-table.Column.FooterProps<D> ]:? react-table.react-table.Column.FooterProps<D>[P]}
- Dropped {[ P in keyof react-table.react-table.Column.HeaderProps<D> ]:? react-table.react-table.Column.HeaderProps<D>[P]} */ trait Column[D] extends js.Object {
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

object Column {
  @scala.inline
  def apply[D](
    accessor: Accessor[D] = null,
    aggregate: Aggregator = null,
    columns: js.Array[Column[D]] = null,
    expander: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    maxWidth: scala.Int | scala.Double = null,
    pivot: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Column[D] = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(accessor.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(expander)) __obj.updateDynamic("expander")(expander)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(pivot)) __obj.updateDynamic("pivot")(pivot)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[D]]
  }
}

