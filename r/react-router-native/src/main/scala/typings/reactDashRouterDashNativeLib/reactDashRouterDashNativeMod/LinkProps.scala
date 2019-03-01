package typings
package reactDashRouterDashNativeLib.reactDashRouterDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_]] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]
}

object LinkProps {
  @scala.inline
  def apply(
    to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    component: reactLib.reactMod.ReactNs.ComponentType[_] = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LinkProps]
  }
}

