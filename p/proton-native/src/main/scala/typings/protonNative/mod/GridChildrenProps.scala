package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridChildrenProps extends js.Object {
  /**
    * Whether the component is aligned with the other components in the column/row.
    */
  var align: js.UndefOr[H] = js.undefined
  /**
    * What column the component resides in.
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * Whether the component can expand in the direction.
    */
  var expand: js.UndefOr[H] = js.undefined
  /**
    * What row the component resides in.
    */
  var row: js.UndefOr[Double] = js.undefined
  /**
    * How many rows/columns the component takes off.
    */
  var span: js.UndefOr[X] = js.undefined
}

object GridChildrenProps {
  @scala.inline
  def apply(
    align: H = null,
    column: js.UndefOr[Double] = js.undefined,
    expand: H = null,
    row: js.UndefOr[Double] = js.undefined,
    span: X = null
  ): GridChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridChildrenProps]
  }
}

