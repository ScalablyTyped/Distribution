package typings.reactDashNativeDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NamePassProps extends js.Object {
  var name: String
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object Anon_NamePassProps {
  @scala.inline
  def apply(name: String, passProps: js.Object = null): Anon_NamePassProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (passProps != null) __obj.updateDynamic("passProps")(passProps)
    __obj.asInstanceOf[Anon_NamePassProps]
  }
}

