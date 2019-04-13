package typings
package resolveDashPkgLib.resolveDashPkgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cwd)) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[Options]
  }
}

