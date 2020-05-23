package typings.reactCssModules.mod

import typings.reactCssModules.reactCssModulesStrings.`throw`
import typings.reactCssModules.reactCssModulesStrings.ignore
import typings.reactCssModules.reactCssModulesStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOptions extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  var handleNotFoundStyleName: js.UndefOr[`throw` | log | ignore] = js.undefined
}

object TypeOptions {
  @scala.inline
  def apply(
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    handleNotFoundStyleName: `throw` | log | ignore = null
  ): TypeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.get.asInstanceOf[js.Any])
    if (handleNotFoundStyleName != null) __obj.updateDynamic("handleNotFoundStyleName")(handleNotFoundStyleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOptions]
  }
}

