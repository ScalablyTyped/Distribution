package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridChildrenProps extends js.Object {
  /**
    * Whether the component is aligned with the other components in the column/row.
    */
  var align: js.UndefOr[protonDashNativeLib.Anon_H] = js.undefined
  /**
    * What column the component resides in.
    */
  var column: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the component can expand in the direction.
    */
  var expand: js.UndefOr[protonDashNativeLib.Anon_H] = js.undefined
  /**
    * What row the component resides in.
    */
  var row: js.UndefOr[scala.Double] = js.undefined
  /**
    * How many rows/columns the component takes off.
    */
  var span: js.UndefOr[protonDashNativeLib.Anon_X] = js.undefined
}

object GridChildrenProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    column: scala.Int | scala.Double = null,
    expand: protonDashNativeLib.Anon_H = null,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null
  ): GridChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    __obj.asInstanceOf[GridChildrenProps]
  }
}

