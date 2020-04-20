package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupOutput extends js.Object {
  var output: Array[OutputChunk | OutputAsset]
}

object RollupOutput {
  @scala.inline
  def apply(output: Array[OutputChunk | OutputAsset]): RollupOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupOutput]
  }
}

