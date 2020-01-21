package typings.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutStackChildren extends js.Object {
  /**
    * Set component
    */
  var component: js.UndefOr[LayoutComponent[js.Object]] = js.undefined
  /**
    * Set the external component
    */
  var externalComponent: js.UndefOr[ExternalComponent] = js.undefined
}

object LayoutStackChildren {
  @scala.inline
  def apply(component: LayoutComponent[js.Object] = null, externalComponent: ExternalComponent = null): LayoutStackChildren = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (externalComponent != null) __obj.updateDynamic("externalComponent")(externalComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutStackChildren]
  }
}

