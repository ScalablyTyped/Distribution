package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCCertificate extends js.Object {
  val expires: Double
  def getFingerprints(): js.Array[RTCDtlsFingerprint]
}

@JSGlobal("RTCCertificate")
@js.native
object RTCCertificate extends Instantiable0[RTCCertificate] {
  def getSupportedAlgorithms(): js.Array[AlgorithmIdentifier] = js.native
}

