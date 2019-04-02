package typings
package semverLib.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includePrerelease: js.UndefOr[scala.Boolean] = js.undefined
  var loose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    includePrerelease: js.UndefOr[scala.Boolean] = js.undefined,
    loose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includePrerelease)) __obj.updateDynamic("includePrerelease")(includePrerelease)
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    __obj.asInstanceOf[Options]
  }
}

