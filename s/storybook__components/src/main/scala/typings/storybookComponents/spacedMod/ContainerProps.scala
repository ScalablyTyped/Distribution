package typings.storybookComponents.spacedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProps extends js.Object {
  var col: js.UndefOr[Double] = js.native
  var outer: js.UndefOr[Double] = js.native
  var row: js.UndefOr[Double] = js.native
}

object ContainerProps {
  @scala.inline
  def apply(
    col: js.UndefOr[Double] = js.undefined,
    outer: js.UndefOr[Double] = js.undefined,
    row: js.UndefOr[Double] = js.undefined
  ): ContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(col)) __obj.updateDynamic("col")(col.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
}

