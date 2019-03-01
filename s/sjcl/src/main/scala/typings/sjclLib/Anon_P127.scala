package typings
package sjclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_P127 extends js.Object {
  var p127: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  // NIST primes
  var p192: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  // Koblitz primes
  var p192k: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  var p224: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  var p224k: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  // Bernstein's prime for Curve25519
  var p25519: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  var p256: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  var p256k: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  var p384: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  var p521: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
}

object Anon_P127 {
  @scala.inline
  def apply(
    p127: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p192: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p192k: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p224: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p224k: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p25519: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p256: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p256k: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p384: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic,
    p521: sjclLib.sjclMod.sjclNs.PseudoMersennePrimeStatic
  ): Anon_P127 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("p127")(p127)
    __obj.updateDynamic("p192")(p192)
    __obj.updateDynamic("p192k")(p192k)
    __obj.updateDynamic("p224")(p224)
    __obj.updateDynamic("p224k")(p224k)
    __obj.updateDynamic("p25519")(p25519)
    __obj.updateDynamic("p256")(p256)
    __obj.updateDynamic("p256k")(p256k)
    __obj.updateDynamic("p384")(p384)
    __obj.updateDynamic("p521")(p521)
    __obj.asInstanceOf[Anon_P127]
  }
}

