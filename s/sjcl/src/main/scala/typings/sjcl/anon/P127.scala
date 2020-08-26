package typings.sjcl.anon

import typings.sjcl.mod.PseudoMersennePrimeStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait P127 extends js.Object {
  var p127: PseudoMersennePrimeStatic = js.native
  // NIST primes
  var p192: PseudoMersennePrimeStatic = js.native
  // Koblitz primes
  var p192k: PseudoMersennePrimeStatic = js.native
  var p224: PseudoMersennePrimeStatic = js.native
  var p224k: PseudoMersennePrimeStatic = js.native
  // Bernstein's prime for Curve25519
  var p25519: PseudoMersennePrimeStatic = js.native
  var p256: PseudoMersennePrimeStatic = js.native
  var p256k: PseudoMersennePrimeStatic = js.native
  var p384: PseudoMersennePrimeStatic = js.native
  var p521: PseudoMersennePrimeStatic = js.native
}

object P127 {
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
  ): P127 = {
    val __obj = js.Dynamic.literal(p127 = p127.asInstanceOf[js.Any], p192 = p192.asInstanceOf[js.Any], p192k = p192k.asInstanceOf[js.Any], p224 = p224.asInstanceOf[js.Any], p224k = p224k.asInstanceOf[js.Any], p25519 = p25519.asInstanceOf[js.Any], p256 = p256.asInstanceOf[js.Any], p256k = p256k.asInstanceOf[js.Any], p384 = p384.asInstanceOf[js.Any], p521 = p521.asInstanceOf[js.Any])
    __obj.asInstanceOf[P127]
  }
  @scala.inline
  implicit class P127Ops[Self <: P127] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setP127(value: PseudoMersennePrimeStatic): Self = this.set("p127", value.asInstanceOf[js.Any])
    @scala.inline
    def setP192(value: PseudoMersennePrimeStatic): Self = this.set("p192", value.asInstanceOf[js.Any])
    @scala.inline
    def setP192k(value: PseudoMersennePrimeStatic): Self = this.set("p192k", value.asInstanceOf[js.Any])
    @scala.inline
    def setP224(value: PseudoMersennePrimeStatic): Self = this.set("p224", value.asInstanceOf[js.Any])
    @scala.inline
    def setP224k(value: PseudoMersennePrimeStatic): Self = this.set("p224k", value.asInstanceOf[js.Any])
    @scala.inline
    def setP25519(value: PseudoMersennePrimeStatic): Self = this.set("p25519", value.asInstanceOf[js.Any])
    @scala.inline
    def setP256(value: PseudoMersennePrimeStatic): Self = this.set("p256", value.asInstanceOf[js.Any])
    @scala.inline
    def setP256k(value: PseudoMersennePrimeStatic): Self = this.set("p256k", value.asInstanceOf[js.Any])
    @scala.inline
    def setP384(value: PseudoMersennePrimeStatic): Self = this.set("p384", value.asInstanceOf[js.Any])
    @scala.inline
    def setP521(value: PseudoMersennePrimeStatic): Self = this.set("p521", value.asInstanceOf[js.Any])
  }
  
}

