package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x0e`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeOkFrame extends Frame {
  var clientPosition: Double
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var streamId: `0`
  var `type`: `0x0e`
}

object ResumeOkFrame {
  @scala.inline
  def apply(clientPosition: Double, flags: Double, streamId: `0`, `type`: `0x0e`, length: Int | Double = null): ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeOkFrame]
  }
}

