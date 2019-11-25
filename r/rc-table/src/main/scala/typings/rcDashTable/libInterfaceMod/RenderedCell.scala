package typings.rcDashTable.libInterfaceMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedCell extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var props: js.UndefOr[Cell] = js.undefined
}

object RenderedCell {
  @scala.inline
  def apply(children: ReactNode = null, props: Cell = null): RenderedCell = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedCell]
  }
}

