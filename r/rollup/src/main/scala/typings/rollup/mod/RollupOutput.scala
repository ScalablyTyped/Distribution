package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupOutput extends js.Object {
  var output: Array[OutputChunk | OutputAsset] = js.native
}

object RollupOutput {
  @scala.inline
  def apply(output: Array[OutputChunk | OutputAsset]): RollupOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupOutput]
  }
  @scala.inline
  implicit class RollupOutputOps[Self <: RollupOutput] (val x: Self) extends AnyVal {
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
    def setOutput(value: Array[OutputChunk | OutputAsset]): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

