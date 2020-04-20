package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclModes extends js.Object {
  var cbc: SjclCBCMode
  var ccm: SjclCCMMode
  var ctr: SjclCTRMode
  var gcm: SjclGCMMode
  var ocb2: SjclOCB2Mode
  var ocb2progressive: SjclOCB2ProgressiveMode
}

object SjclModes {
  @scala.inline
  def apply(
    cbc: SjclCBCMode,
    ccm: SjclCCMMode,
    ctr: SjclCTRMode,
    gcm: SjclGCMMode,
    ocb2: SjclOCB2Mode,
    ocb2progressive: SjclOCB2ProgressiveMode
  ): SjclModes = {
    val __obj = js.Dynamic.literal(cbc = cbc.asInstanceOf[js.Any], ccm = ccm.asInstanceOf[js.Any], ctr = ctr.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], ocb2 = ocb2.asInstanceOf[js.Any], ocb2progressive = ocb2progressive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclModes]
  }
}

