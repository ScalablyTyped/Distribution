package typings.sjcl.sjclMod

import typings.sjcl.Anon_C192
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclEllipticCurveCryptography extends js.Object {
  var basicKey: SjclECCBasic
  var curve: SjclEllipticalCurveStatic
  var curves: Anon_C192
  var ecdsa: SjclEcdsa
  var elGamal: SjclElGamal
  var point: SjclEllipticalPointStatic
  var pointJac: SjclPointJacobianStatic
}

object SjclEllipticCurveCryptography {
  @scala.inline
  def apply(
    basicKey: SjclECCBasic,
    curve: SjclEllipticalCurveStatic,
    curves: Anon_C192,
    ecdsa: SjclEcdsa,
    elGamal: SjclElGamal,
    point: SjclEllipticalPointStatic,
    pointJac: SjclPointJacobianStatic
  ): SjclEllipticCurveCryptography = {
    val __obj = js.Dynamic.literal(basicKey = basicKey, curve = curve, curves = curves, ecdsa = ecdsa, elGamal = elGamal, point = point, pointJac = pointJac)
  
    __obj.asInstanceOf[SjclEllipticCurveCryptography]
  }
}

