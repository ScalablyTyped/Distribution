package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0x09`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelFrame extends Frame {
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var streamId: Double
  var `type`: `0x09`
}

object CancelFrame {
  @scala.inline
  def apply(flags: Double, streamId: Double, `type`: `0x09`, length: js.UndefOr[Double] = js.undefined): CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelFrame]
  }
}

