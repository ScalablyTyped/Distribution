package typings.reactNativeNavigation.layoutMod

import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutComponent[P] extends js.Object {
  /**
    * Component reference id, Auto generated if empty
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Name of your component
    */
  var name: String | Double
  /**
    * Styling options
    */
  var options: js.UndefOr[Options] = js.undefined
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[P] = js.undefined
}

object LayoutComponent {
  @scala.inline
  def apply[P](name: String | Double, id: String = null, options: Options = null, passProps: P = null): LayoutComponent[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutComponent[P]]
  }
}

