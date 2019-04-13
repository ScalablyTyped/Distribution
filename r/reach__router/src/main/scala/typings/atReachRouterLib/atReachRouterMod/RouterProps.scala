package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var basepath: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ComponentType[js.Object] | java.lang.String] = js.undefined
  var location: js.UndefOr[WindowLocation] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
}

object RouterProps {
  @scala.inline
  def apply(
    basepath: java.lang.String = null,
    component: reactLib.reactMod.ComponentType[js.Object] | java.lang.String = null,
    location: WindowLocation = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined
  ): RouterProps = {
    val __obj = js.Dynamic.literal()
    if (basepath != null) __obj.updateDynamic("basepath")(basepath)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    __obj.asInstanceOf[RouterProps]
  }
}

