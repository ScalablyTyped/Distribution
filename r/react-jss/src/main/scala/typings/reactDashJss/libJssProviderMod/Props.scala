package typings.reactDashJss.libJssProviderMod

import typings.jss.jssMod.GenerateClassName
import typings.jss.jssMod.JSS
import typings.jss.jssMod.Rule
import typings.jss.jssMod.SheetsRegistry
import typings.jss.jssMod.StyleSheet
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var classNamePrefix: js.UndefOr[String] = js.undefined
  var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
  var generateClassName: js.UndefOr[GenerateClassName[_]] = js.undefined
  var jss: js.UndefOr[JSS] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    classNamePrefix: String = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    generateClassName: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[_]]) => String = null,
    jss: JSS = null,
    registry: SheetsRegistry = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration)
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(js.Any.fromFunction2(generateClassName))
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Props]
  }
}

