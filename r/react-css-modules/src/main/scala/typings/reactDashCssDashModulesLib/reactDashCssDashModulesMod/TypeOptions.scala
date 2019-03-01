package typings
package reactDashCssDashModulesLib.reactDashCssDashModulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOptions extends js.Object {
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var handleNotFoundStyleName: js.UndefOr[
    reactDashCssDashModulesLib.reactDashCssDashModulesLibStrings.`throw` | reactDashCssDashModulesLib.reactDashCssDashModulesLibStrings.log | reactDashCssDashModulesLib.reactDashCssDashModulesLibStrings.ignore
  ] = js.undefined
}

object TypeOptions {
  @scala.inline
  def apply(
    allowMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    handleNotFoundStyleName: reactDashCssDashModulesLib.reactDashCssDashModulesLibStrings.`throw` | reactDashCssDashModulesLib.reactDashCssDashModulesLibStrings.log | reactDashCssDashModulesLib.reactDashCssDashModulesLibStrings.ignore = null
  ): TypeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (handleNotFoundStyleName != null) __obj.updateDynamic("handleNotFoundStyleName")(handleNotFoundStyleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOptions]
  }
}

