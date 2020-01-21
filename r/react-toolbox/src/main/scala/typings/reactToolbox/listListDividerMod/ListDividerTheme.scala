package typings.reactToolbox.listListDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDividerTheme extends js.Object {
  /**
    * Added to the root element.
    */
  var divider: js.UndefOr[String] = js.undefined
  /**
    * Added to root element if inset is true.
    */
  var inset: js.UndefOr[String] = js.undefined
}

object ListDividerTheme {
  @scala.inline
  def apply(divider: String = null, inset: String = null): ListDividerTheme = {
    val __obj = js.Dynamic.literal()
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDividerTheme]
  }
}

