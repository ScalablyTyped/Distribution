package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellAttributes extends js.Object {
  var default: js.Any
  var getFromDOM: js.UndefOr[typings.prosemirrorDashTables.prosemirrorDashTablesMod.getFromDOM] = js.undefined
  var setDOMAttr: js.UndefOr[typings.prosemirrorDashTables.prosemirrorDashTablesMod.setDOMAttr] = js.undefined
}

object CellAttributes {
  @scala.inline
  def apply(default: js.Any, getFromDOM: getFromDOM = null, setDOMAttr: setDOMAttr = null): CellAttributes = {
    val __obj = js.Dynamic.literal(default = default)
    if (getFromDOM != null) __obj.updateDynamic("getFromDOM")(getFromDOM)
    if (setDOMAttr != null) __obj.updateDynamic("setDOMAttr")(setDOMAttr)
    __obj.asInstanceOf[CellAttributes]
  }
}

