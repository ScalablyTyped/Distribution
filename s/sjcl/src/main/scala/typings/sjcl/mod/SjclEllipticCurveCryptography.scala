package typings.sjcl.mod

import typings.sjcl.anon.C192
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait SjclEllipticCurveCryptography extends js.Object {
  var basicKey: SjclECCBasic = js.native
  var curve: SjclEllipticalCurveStatic = js.native
  var curves: C192 = js.native
  var ecdsa: SjclECDSA = js.native
  var elGamal: SjclElGamal = js.native
  var point: SjclEllipticalPointStatic = js.native
  var pointJac: SjclPointJacobianStatic = js.native
  def curveName(curve: SjclEllipticalCurve): String = js.native
  def deserialize(key: SjclECCKeyPairData): SjclECCSecretKey = js.native
  @JSName("deserialize")
  def deserialize_SjclECCPublicKey(key: SjclECCKeyPairData): SjclECCPublicKey = js.native
}

