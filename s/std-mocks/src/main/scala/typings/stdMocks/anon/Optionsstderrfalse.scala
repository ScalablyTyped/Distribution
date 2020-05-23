package typings.stdMocks.anon

import typings.stdMocks.stdMocksBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std-mocks.std-mocks.Options & {  stderr  :false} */
trait Optionsstderrfalse extends js.Object {
  var stderr: js.UndefOr[Boolean with `false`] = js.undefined
  var stdout: js.UndefOr[Boolean] = js.undefined
}

object Optionsstderrfalse {
  @scala.inline
  def apply(
    stderr: js.UndefOr[Boolean with `false`] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined
  ): Optionsstderrfalse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsstderrfalse]
  }
}

