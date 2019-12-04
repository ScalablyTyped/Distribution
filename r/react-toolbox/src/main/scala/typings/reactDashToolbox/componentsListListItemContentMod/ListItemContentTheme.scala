package typings.reactDashToolbox.componentsListListItemContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemContentTheme extends js.Object {
  /**
    * Added to the content wrapper element if type is "auto".
    */
  var auto: js.UndefOr[String] = js.undefined
  /**
    * Used for the content wrapper element in list item.
    */
  var itemContentRoot: js.UndefOr[String] = js.undefined
  /**
    * Added to the content wrapper element if type is "large".
    */
  var large: js.UndefOr[String] = js.undefined
  /**
    * Added to the content wrapper element if type is "normal".
    */
  var normal: js.UndefOr[String] = js.undefined
}

object ListItemContentTheme {
  @scala.inline
  def apply(auto: String = null, itemContentRoot: String = null, large: String = null, normal: String = null): ListItemContentTheme = {
    val __obj = js.Dynamic.literal()
    if (auto != null) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (itemContentRoot != null) __obj.updateDynamic("itemContentRoot")(itemContentRoot.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemContentTheme]
  }
}

