package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupOutput extends js.Object {
  var output: js.Array[OutputChunk | OutputAsset]
}

object RollupOutput {
  @scala.inline
  def apply(output: js.Array[OutputChunk | OutputAsset]): RollupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[RollupOutput]
  }
}

