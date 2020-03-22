package typings.rcTable.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedCell[RecordType] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var props: js.UndefOr[CellType[RecordType]] = js.undefined
}

object RenderedCell {
  @scala.inline
  def apply[RecordType](children: ReactNode = null, props: CellType[RecordType] = null): RenderedCell[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedCell[RecordType]]
  }
}

