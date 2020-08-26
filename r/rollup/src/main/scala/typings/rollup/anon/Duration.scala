package typings.rollup.anon

import typings.rollup.mod.InputOption
import typings.rollup.mod.RollupBuild
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.BUNDLE_END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends RollupWatcherEvent {
  var code: BUNDLE_END = js.native
  var duration: Double = js.native
  var input: InputOption = js.native
  var output: js.Array[String] = js.native
  var result: RollupBuild = js.native
}

object Duration {
  @scala.inline
  def apply(
    code: BUNDLE_END,
    duration: Double,
    input: InputOption,
    output: js.Array[String],
    result: RollupBuild
  ): Duration = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setCode(value: BUNDLE_END): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputVarargs(value: String*): Self = this.set("input", js.Array(value :_*))
    @scala.inline
    def setInput(value: InputOption): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputVarargs(value: String*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: js.Array[String]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: RollupBuild): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

