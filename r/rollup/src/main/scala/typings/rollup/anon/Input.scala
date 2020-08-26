package typings.rollup.anon

import typings.rollup.mod.InputOption
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.BUNDLE_START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends RollupWatcherEvent {
  var code: BUNDLE_START = js.native
  var input: InputOption = js.native
  var output: js.Array[String] = js.native
}

object Input {
  @scala.inline
  def apply(code: BUNDLE_START, input: InputOption, output: js.Array[String]): Input = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
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
    def setCode(value: BUNDLE_START): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputVarargs(value: String*): Self = this.set("input", js.Array(value :_*))
    @scala.inline
    def setInput(value: InputOption): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputVarargs(value: String*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: js.Array[String]): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

