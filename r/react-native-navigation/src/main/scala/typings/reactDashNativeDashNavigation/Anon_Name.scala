package typings.reactDashNativeDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, passProps: js.Object = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (passProps != null) __obj.updateDynamic("passProps")(passProps)
    __obj.asInstanceOf[Anon_Name]
  }
}

