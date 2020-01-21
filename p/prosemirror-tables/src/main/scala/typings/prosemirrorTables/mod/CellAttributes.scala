package typings.prosemirrorTables.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellAttributes extends js.Object {
  var default: js.Any
  var getFromDOM: js.UndefOr[typings.prosemirrorTables.mod.getFromDOM] = js.undefined
  var setDOMAttr: js.UndefOr[typings.prosemirrorTables.mod.setDOMAttr] = js.undefined
}

object CellAttributes {
  @scala.inline
  def apply(
    default: js.Any,
    getFromDOM: /* dom */ Element => js.Any = null,
    setDOMAttr: (/* value */ js.Any, /* attrs */ js.Any) => js.Any = null
  ): CellAttributes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (getFromDOM != null) __obj.updateDynamic("getFromDOM")(js.Any.fromFunction1(getFromDOM))
    if (setDOMAttr != null) __obj.updateDynamic("setDOMAttr")(js.Any.fromFunction2(setDOMAttr))
    __obj.asInstanceOf[CellAttributes]
  }
}

