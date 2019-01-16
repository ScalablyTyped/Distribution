package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCCertificate extends js.Object {
  val expires: scala.Double
  def getFingerprints(): Array[RTCDtlsFingerprint]
}

@JSGlobal("RTCCertificate")
@js.native
object RTCCertificate
  extends org.scalablytyped.runtime.Instantiable0[RTCCertificate] {
  def getSupportedAlgorithms(): atSindresorhusIsLib.Array[atSindresorhusIsLib.AlgorithmIdentifier] = js.native
}

