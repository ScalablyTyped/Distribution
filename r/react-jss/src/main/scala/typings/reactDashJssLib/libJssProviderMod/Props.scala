package typings
package reactDashJssLib.libJssProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var classNamePrefix: js.UndefOr[java.lang.String] = js.undefined
  var disableStylesGeneration: js.UndefOr[scala.Boolean] = js.undefined
  var generateClassName: js.UndefOr[jssLib.jssMod.GenerateClassName[_]] = js.undefined
  var jss: js.UndefOr[jssLib.jssMod.JSS] = js.undefined
  var registry: js.UndefOr[jssLib.jssMod.SheetsRegistry] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    classNamePrefix: java.lang.String = null,
    disableStylesGeneration: js.UndefOr[scala.Boolean] = js.undefined,
    generateClassName: jssLib.jssMod.GenerateClassName[_] = null,
    jss: jssLib.jssMod.JSS = null,
    registry: jssLib.jssMod.SheetsRegistry = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration)
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(generateClassName)
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Props]
  }
}

