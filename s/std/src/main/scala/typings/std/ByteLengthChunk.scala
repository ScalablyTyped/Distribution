package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteLengthChunk extends js.Object {
  var byteLength: js.UndefOr[Double] = js.undefined
}

object ByteLengthChunk {
  @scala.inline
  def apply(byteLength: js.UndefOr[Double] = js.undefined): ByteLengthChunk = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byteLength)) __obj.updateDynamic("byteLength")(byteLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteLengthChunk]
  }
}

