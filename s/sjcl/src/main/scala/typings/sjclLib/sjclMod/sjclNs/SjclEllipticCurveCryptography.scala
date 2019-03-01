package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclEllipticCurveCryptography extends js.Object {
  var basicKey: SjclECCBasic
  var curve: SjclEllipticalCurveStatic
  var curves: sjclLib.Anon_C192
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
    curves: sjclLib.Anon_C192,
    ecdsa: SjclEcdsa,
    elGamal: SjclElGamal,
    point: SjclEllipticalPointStatic,
    pointJac: SjclPointJacobianStatic
  ): SjclEllipticCurveCryptography = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basicKey")(basicKey)
    __obj.updateDynamic("curve")(curve)
    __obj.updateDynamic("curves")(curves)
    __obj.updateDynamic("ecdsa")(ecdsa)
    __obj.updateDynamic("elGamal")(elGamal)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("pointJac")(pointJac)
    __obj.asInstanceOf[SjclEllipticCurveCryptography]
  }
}

