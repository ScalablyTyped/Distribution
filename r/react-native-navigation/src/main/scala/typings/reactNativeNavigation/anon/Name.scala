package typings.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, passProps: js.Object = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

