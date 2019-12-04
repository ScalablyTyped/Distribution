package typings.reactDashToolbox.componentsNavigationNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTheme extends js.Object {
  /**
    * Used for buttons provided in the component.
    */
  var button: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element if the layout is horizontal.
    */
  var horizontal: js.UndefOr[String] = js.undefined
  /**
    * Used for links provided in the component.
    */
  var link: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element if the layout is vertical.
    */
  var vertical: js.UndefOr[String] = js.undefined
}

object NavigationTheme {
  @scala.inline
  def apply(button: String = null, horizontal: String = null, link: String = null, vertical: String = null): NavigationTheme = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTheme]
  }
}

