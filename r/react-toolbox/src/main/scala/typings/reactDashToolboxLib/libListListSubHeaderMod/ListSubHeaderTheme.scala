package typings
package reactDashToolboxLib.libListListSubHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubHeaderTheme extends js.Object {
  /**
    * Used as a wrapper class for the subheader element.
    */
  var subheader: js.UndefOr[java.lang.String] = js.undefined
}

object ListSubHeaderTheme {
  @scala.inline
  def apply(subheader: java.lang.String = null): ListSubHeaderTheme = {
    val __obj = js.Dynamic.literal()
    if (subheader != null) __obj.updateDynamic("subheader")(subheader)
    __obj.asInstanceOf[ListSubHeaderTheme]
  }
}

