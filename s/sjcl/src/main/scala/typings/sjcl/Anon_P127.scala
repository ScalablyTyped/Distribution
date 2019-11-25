package typings.sjcl

import typings.sjcl.sjclMod.PseudoMersennePrimeStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_P127 extends js.Object {
  var p127: PseudoMersennePrimeStatic
  // NIST primes
  var p192: PseudoMersennePrimeStatic
  // Koblitz primes
  var p192k: PseudoMersennePrimeStatic
  var p224: PseudoMersennePrimeStatic
  var p224k: PseudoMersennePrimeStatic
  // Bernstein's prime for Curve25519
  var p25519: PseudoMersennePrimeStatic
  var p256: PseudoMersennePrimeStatic
  var p256k: PseudoMersennePrimeStatic
  var p384: PseudoMersennePrimeStatic
  var p521: PseudoMersennePrimeStatic
}

object Anon_P127 {
  @scala.inline
  def apply(
    p127: PseudoMersennePrimeStatic,
    p192: PseudoMersennePrimeStatic,
    p192k: PseudoMersennePrimeStatic,
    p224: PseudoMersennePrimeStatic,
    p224k: PseudoMersennePrimeStatic,
    p25519: PseudoMersennePrimeStatic,
    p256: PseudoMersennePrimeStatic,
    p256k: PseudoMersennePrimeStatic,
    p384: PseudoMersennePrimeStatic,
    p521: PseudoMersennePrimeStatic
  ): Anon_P127 = {
    val __obj = js.Dynamic.literal(p127 = p127.asInstanceOf[js.Any], p192 = p192.asInstanceOf[js.Any], p192k = p192k.asInstanceOf[js.Any], p224 = p224.asInstanceOf[js.Any], p224k = p224k.asInstanceOf[js.Any], p25519 = p25519.asInstanceOf[js.Any], p256 = p256.asInstanceOf[js.Any], p256k = p256k.asInstanceOf[js.Any], p384 = p384.asInstanceOf[js.Any], p521 = p521.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_P127]
  }
}

