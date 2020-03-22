package typings.reactNativeNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassProps extends js.Object {
  var name: String
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object AnonPassProps {
  @scala.inline
  def apply(name: String, passProps: js.Object = null): AnonPassProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassProps]
  }
}

