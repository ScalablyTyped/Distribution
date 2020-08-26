package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait SjclModes extends js.Object {
  var cbc: SjclCBCMode = js.native
  var ccm: SjclCCMMode = js.native
  var ctr: SjclCTRMode = js.native
  var gcm: SjclGCMMode = js.native
  var ocb2: SjclOCB2Mode = js.native
  var ocb2progressive: SjclOCB2ProgressiveMode = js.native
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
  @scala.inline
  implicit class SjclModesOps[Self <: SjclModes] (val x: Self) extends AnyVal {
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
    def setCbc(value: SjclCBCMode): Self = this.set("cbc", value.asInstanceOf[js.Any])
    @scala.inline
    def setCcm(value: SjclCCMMode): Self = this.set("ccm", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtr(value: SjclCTRMode): Self = this.set("ctr", value.asInstanceOf[js.Any])
    @scala.inline
    def setGcm(value: SjclGCMMode): Self = this.set("gcm", value.asInstanceOf[js.Any])
    @scala.inline
    def setOcb2(value: SjclOCB2Mode): Self = this.set("ocb2", value.asInstanceOf[js.Any])
    @scala.inline
    def setOcb2progressive(value: SjclOCB2ProgressiveMode): Self = this.set("ocb2progressive", value.asInstanceOf[js.Any])
  }
  
}

