package typings.reactDashToolbox.componentsListListSubHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubHeaderTheme extends js.Object {
  /**
    * Used as a wrapper class for the subheader element.
    */
  var subheader: js.UndefOr[String] = js.undefined
}

object ListSubHeaderTheme {
  @scala.inline
  def apply(subheader: String = null): ListSubHeaderTheme = {
    val __obj = js.Dynamic.literal()
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubHeaderTheme]
  }
}

