package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.AlgorithmIdentifier
import typings.std.RTCDtlsFingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCCertificate")
@js.native
class RTCCertificate ()
  extends typings.std.RTCCertificate {
  /* CompleteClass */
  override val expires: Double = js.native
  /* CompleteClass */
  override def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}

@JSGlobal("RTCCertificate")
@js.native
object RTCCertificate
  extends Instantiable0[typings.std.RTCCertificate] {
  def getSupportedAlgorithms(): js.Array[AlgorithmIdentifier] = js.native
}

