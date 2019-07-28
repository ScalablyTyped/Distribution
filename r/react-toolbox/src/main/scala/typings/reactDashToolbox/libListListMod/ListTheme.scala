package typings.reactDashToolbox.libListListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTheme extends js.Object {
  /**
    * Used for the root element of the list.
    */
  var list: js.UndefOr[String] = js.undefined
}

object ListTheme {
  @scala.inline
  def apply(list: String = null): ListTheme = {
    val __obj = js.Dynamic.literal()
    if (list != null) __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ListTheme]
  }
}

