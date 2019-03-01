package typings
package reactDashIntlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponent[P] extends js.Object {
  var WrappedComponent: reactLib.reactMod.ReactNs.ComponentType[P with reactDashIntlLib.ReactIntlNs.InjectedIntlProps]
}

object Anon_WrappedComponent {
  @scala.inline
  def apply[P](
    WrappedComponent: reactLib.reactMod.ReactNs.ComponentType[P with reactDashIntlLib.ReactIntlNs.InjectedIntlProps]
  ): Anon_WrappedComponent[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("WrappedComponent")(WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WrappedComponent[P]]
  }
}

