package typings
package reactDashToolboxLib.libListListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTheme extends js.Object {
  /**
    * Used for the root element of the list.
    */
  var list: js.UndefOr[java.lang.String] = js.undefined
}

object ListTheme {
  @scala.inline
  def apply(list: java.lang.String = null): ListTheme = {
    val __obj = js.Dynamic.literal()
    if (list != null) __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ListTheme]
  }
}

