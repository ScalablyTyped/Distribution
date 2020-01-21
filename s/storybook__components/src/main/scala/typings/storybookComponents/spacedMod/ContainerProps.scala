package typings.storybookComponents.spacedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var col: js.UndefOr[Double] = js.undefined
  var outer: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(col: Int | Double = null, outer: Int | Double = null, row: Int | Double = null): ContainerProps = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
}

