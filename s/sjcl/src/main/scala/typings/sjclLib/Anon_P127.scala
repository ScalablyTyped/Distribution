package typings
package sjclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_P127 extends js.Object {
  var p127: sjclLib.sjclMod.PseudoMersennePrimeStatic
  // NIST primes
  var p192: sjclLib.sjclMod.PseudoMersennePrimeStatic
  // Koblitz primes
  var p192k: sjclLib.sjclMod.PseudoMersennePrimeStatic
  var p224: sjclLib.sjclMod.PseudoMersennePrimeStatic
  var p224k: sjclLib.sjclMod.PseudoMersennePrimeStatic
  // Bernstein's prime for Curve25519
  var p25519: sjclLib.sjclMod.PseudoMersennePrimeStatic
  var p256: sjclLib.sjclMod.PseudoMersennePrimeStatic
  var p256k: sjclLib.sjclMod.PseudoMersennePrimeStatic
  var p384: sjclLib.sjclMod.PseudoMersennePrimeStatic
  var p521: sjclLib.sjclMod.PseudoMersennePrimeStatic
}

object Anon_P127 {
  @scala.inline
  def apply(
    p127: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p192: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p192k: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p224: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p224k: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p25519: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p256: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p256k: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p384: sjclLib.sjclMod.PseudoMersennePrimeStatic,
    p521: sjclLib.sjclMod.PseudoMersennePrimeStatic
  ): Anon_P127 = {
    val __obj = js.Dynamic.literal(p127 = p127, p192 = p192, p192k = p192k, p224 = p224, p224k = p224k, p25519 = p25519, p256 = p256, p256k = p256k, p384 = p384, p521 = p521)
  
    __obj.asInstanceOf[Anon_P127]
  }
}

