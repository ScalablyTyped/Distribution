package typings.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintDefaultOptions extends js.Object {
  /**
    * use options from nearest package.json?
    * @default true
    */
  var usePackageJson: js.UndefOr[Boolean] = js.undefined
}

object LintDefaultOptions {
  @scala.inline
  def apply(usePackageJson: js.UndefOr[Boolean] = js.undefined): LintDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(usePackageJson)) __obj.updateDynamic("usePackageJson")(usePackageJson.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintDefaultOptions]
  }
}

