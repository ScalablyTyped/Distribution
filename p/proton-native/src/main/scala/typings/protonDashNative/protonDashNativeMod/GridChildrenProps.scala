package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridChildrenProps extends js.Object {
  /**
    * Whether the component is aligned with the other components in the column/row.
    */
  var align: js.UndefOr[Anon_H] = js.undefined
  /**
    * What column the component resides in.
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * Whether the component can expand in the direction.
    */
  var expand: js.UndefOr[Anon_H] = js.undefined
  /**
    * What row the component resides in.
    */
  var row: js.UndefOr[Double] = js.undefined
  /**
    * How many rows/columns the component takes off.
    */
  var span: js.UndefOr[Anon_X] = js.undefined
}

object GridChildrenProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    column: Int | Double = null,
    expand: Anon_H = null,
    row: Int | Double = null,
    span: Anon_X = null
  ): GridChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridChildrenProps]
  }
}

