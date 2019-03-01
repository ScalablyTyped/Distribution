package typings
package reactDashFlexLib.reactDashFlexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFlexProps extends js.Object {
  /**
    * A value for the `align-content` css property.
    */
  var alignContent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value for the `align-items` css property. Defaults to `'center'`.
    */
  var alignItems: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For `flex-direction: column`.
    */
  var column: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Customize the display to be `'flex'` or `'inline-flex'`.
    * Defaults to `'flex'`.
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A number/string from 0 to 24 for the `flex` css property. `false` for `'none'`.
    */
  var flex: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
  /**
    * For `display: inline-flex`.
    */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A value for the `justify-content` css property.
    */
  var justifyContent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For reverse direction (eg. `flex-direction: column-reverse` or `row-reverse`).
    */
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For `flex-direction: row`. Defaults to `true`.
    */
  var row: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For custom style
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /**
    * For `flex-wrap: wrap`. Defaults to `true`.
    */
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonFlexProps {
  @scala.inline
  def apply(
    alignContent: java.lang.String = null,
    alignItems: java.lang.String = null,
    column: js.UndefOr[scala.Boolean] = js.undefined,
    display: java.lang.String = null,
    flex: scala.Double | java.lang.String | scala.Boolean = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    justifyContent: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    row: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonFlexProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column)
    if (display != null) __obj.updateDynamic("display")(display)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[CommonFlexProps]
  }
}

