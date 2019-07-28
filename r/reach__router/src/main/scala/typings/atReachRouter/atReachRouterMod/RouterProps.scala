package typings.atReachRouter.atReachRouterMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var basepath: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
  var location: js.UndefOr[WindowLocation] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
}

object RouterProps {
  @scala.inline
  def apply(
    basepath: String = null,
    component: ComponentType[js.Object] | String = null,
    location: WindowLocation = null,
    primary: js.UndefOr[Boolean] = js.undefined
  ): RouterProps = {
    val __obj = js.Dynamic.literal()
    if (basepath != null) __obj.updateDynamic("basepath")(basepath)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    __obj.asInstanceOf[RouterProps]
  }
}

