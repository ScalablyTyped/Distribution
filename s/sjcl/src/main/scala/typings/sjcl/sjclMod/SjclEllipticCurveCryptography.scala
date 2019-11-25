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
    val __obj = js.Dynamic.literal(basicKey = basicKey.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], ecdsa = ecdsa.asInstanceOf[js.Any], elGamal = elGamal.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointJac = pointJac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclEllipticCurveCryptography]
  }
}

