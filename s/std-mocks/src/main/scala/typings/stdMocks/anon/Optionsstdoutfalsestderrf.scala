package typings.stdMocks.anon

import typings.stdMocks.stdMocksBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std-mocks.std-mocks.Options & {  stdout :false,   stderr :false} */
@js.native
trait Optionsstdoutfalsestderrf extends js.Object {
  var stderr: js.UndefOr[Boolean] with `false` = js.native
  var stdout: js.UndefOr[Boolean] with `false` = js.native
}

object Optionsstdoutfalsestderrf {
  @scala.inline
  def apply(stderr: js.UndefOr[Boolean] with `false`, stdout: js.UndefOr[Boolean] with `false`): Optionsstdoutfalsestderrf = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsstdoutfalsestderrf]
  }
  @scala.inline
  implicit class OptionsstdoutfalsestderrfOps[Self <: Optionsstdoutfalsestderrf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStderr(value: js.UndefOr[Boolean] with `false`): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: js.UndefOr[Boolean] with `false`): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

