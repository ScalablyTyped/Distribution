package typings.reactDashFlex.reactDashFlexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFlexProps extends js.Object {
  /**
    * A value for the `align-content` css property.
    */
  var alignContent: js.UndefOr[String] = js.undefined
  /**
    * A value for the `align-items` css property. Defaults to `'center'`.
    */
  var alignItems: js.UndefOr[String] = js.undefined
  /**
    * For `flex-direction: column`.
    */
  var column: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize the display to be `'flex'` or `'inline-flex'`.
    * Defaults to `'flex'`.
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * A number/string from 0 to 24 for the `flex` css property. `false` for `'none'`.
    */
  var flex: js.UndefOr[Double | String | Boolean] = js.undefined
  /**
    * For `display: inline-flex`.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * A value for the `justify-content` css property.
    */
  var justifyContent: js.UndefOr[String] = js.undefined
  /**
    * For reverse direction (eg. `flex-direction: column-reverse` or `row-reverse`).
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  /**
    * For `flex-direction: row`. Defaults to `true`.
    */
  var row: js.UndefOr[Boolean] = js.undefined
  /**
    * For custom style
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /**
    * For `flex-wrap: wrap`. Defaults to `true`.
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object CommonFlexProps {
  @scala.inline
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    column: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    flex: Double | String | Boolean = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    justifyContent: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[Boolean] = js.undefined
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

