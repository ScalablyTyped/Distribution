package typings
package reactDashToolboxLib.libListListDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDividerTheme extends js.Object {
  /**
    * Added to the root element.
    */
  var divider: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to root element if inset is true.
    */
  var inset: js.UndefOr[java.lang.String] = js.undefined
}

object ListDividerTheme {
  @scala.inline
  def apply(divider: java.lang.String = null, inset: java.lang.String = null): ListDividerTheme = {
    val __obj = js.Dynamic.literal()
    if (divider != null) __obj.updateDynamic("divider")(divider)
    if (inset != null) __obj.updateDynamic("inset")(inset)
    __obj.asInstanceOf[ListDividerTheme]
  }
}

