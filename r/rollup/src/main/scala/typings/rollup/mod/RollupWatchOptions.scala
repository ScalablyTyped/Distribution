package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupWatchOptions extends InputOptions {
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.native
}

object RollupWatchOptions {
  @scala.inline
  def apply(): RollupWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupWatchOptions]
  }
  @scala.inline
  implicit class RollupWatchOptionsOps[Self <: RollupWatchOptions] (val x: Self) extends AnyVal {
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
    def setOutputVarargs(value: OutputOptions*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: OutputOptions | js.Array[OutputOptions]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
  
}

