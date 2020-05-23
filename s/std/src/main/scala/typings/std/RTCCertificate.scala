package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCCertificate extends js.Object {
  val expires: Double
  def getFingerprints(): js.Array[RTCDtlsFingerprint]
}

object RTCCertificate {
  @scala.inline
  def apply(expires: Double, getFingerprints: () => js.Array[RTCDtlsFingerprint]): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getFingerprints = js.Any.fromFunction0(getFingerprints))
    __obj.asInstanceOf[RTCCertificate]
  }
}

