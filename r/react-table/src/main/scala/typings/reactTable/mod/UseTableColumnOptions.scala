package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseTableColumnOptions[D /* <: js.Object */] extends js.Object {
  var Header: js.UndefOr[Renderer[HeaderProps[D]]] = js.undefined
  var id: js.UndefOr[IdType[D]] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object UseTableColumnOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    Header: Renderer[HeaderProps[D]] = null,
    id: IdType[D] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    width: Double | String = null
  ): UseTableColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableColumnOptions[D]]
  }
}

