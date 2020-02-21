package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclArrayBufferModes extends js.Object {
  var ccm: SjclArrayBufferCCMMode
}

object SjclArrayBufferModes {
  @scala.inline
  def apply(ccm: SjclArrayBufferCCMMode): SjclArrayBufferModes = {
    val __obj = js.Dynamic.literal(ccm = ccm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclArrayBufferModes]
  }
}

