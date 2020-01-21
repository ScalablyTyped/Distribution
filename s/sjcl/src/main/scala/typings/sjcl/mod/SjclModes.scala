package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclModes extends js.Object {
  var cbc: SjclCBCMode
  var ccm: SjclCCMMode
  var gcm: SjclGCMMode
  var ocb2: SjclOCB2Mode
}

object SjclModes {
  @scala.inline
  def apply(cbc: SjclCBCMode, ccm: SjclCCMMode, gcm: SjclGCMMode, ocb2: SjclOCB2Mode): SjclModes = {
    val __obj = js.Dynamic.literal(cbc = cbc.asInstanceOf[js.Any], ccm = ccm.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], ocb2 = ocb2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclModes]
  }
}

