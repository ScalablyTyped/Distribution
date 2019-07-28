package typings.stdDashMocks.stdDashMocksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var stderr: js.UndefOr[Boolean] = js.undefined
  var stdout: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(stderr: js.UndefOr[Boolean] = js.undefined, stdout: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr)
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[Options]
  }
}

