package typings.reactDnd.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DndOptions[Props] extends js.Object {
  var arePropsEqual: js.UndefOr[js.Function2[/* first */ Props, /* second */ Props, Boolean]] = js.undefined
}

object DndOptions {
  @scala.inline
  def apply[Props](arePropsEqual: (/* first */ Props, /* second */ Props) => Boolean = null): DndOptions[Props] = {
    val __obj = js.Dynamic.literal()
    if (arePropsEqual != null) __obj.updateDynamic("arePropsEqual")(js.Any.fromFunction2(arePropsEqual))
    __obj.asInstanceOf[DndOptions[Props]]
  }
}

