package typings.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std-mocks.std-mocks.Options & {  print ? :boolean} */
trait Optionsprintboolean extends js.Object {
  var print: js.UndefOr[Boolean] = js.undefined
  var stderr: js.UndefOr[Boolean] = js.undefined
  var stdout: js.UndefOr[Boolean] = js.undefined
}

object Optionsprintboolean {
  @scala.inline
  def apply(
    print: js.UndefOr[Boolean] = js.undefined,
    stderr: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined
  ): Optionsprintboolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsprintboolean]
  }
}

