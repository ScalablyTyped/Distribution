package typings
package stdDashMocksLib.stdDashMocksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var stderr: js.UndefOr[scala.Boolean] = js.undefined
  var stdout: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(stderr: js.UndefOr[scala.Boolean] = js.undefined, stdout: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr)
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[Options]
  }
}

