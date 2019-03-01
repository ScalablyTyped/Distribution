package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutStackChildren extends js.Object {
  /**
    * Set component
    */
  var component: js.UndefOr[LayoutComponent[js.Object]] = js.undefined
}

object LayoutStackChildren {
  @scala.inline
  def apply(component: LayoutComponent[js.Object] = null): LayoutStackChildren = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    __obj.asInstanceOf[LayoutStackChildren]
  }
}

