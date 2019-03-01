package typings
package reactDashToolboxLib.libNavigationNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTheme extends js.Object {
  /**
    * Used for buttons provided in the component.
    */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element if the layout is horizontal.
    */
  var horizontal: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for links provided in the component.
    */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element if the layout is vertical.
    */
  var vertical: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationTheme {
  @scala.inline
  def apply(
    button: java.lang.String = null,
    horizontal: java.lang.String = null,
    link: java.lang.String = null,
    vertical: java.lang.String = null
  ): NavigationTheme = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (link != null) __obj.updateDynamic("link")(link)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[NavigationTheme]
  }
}

