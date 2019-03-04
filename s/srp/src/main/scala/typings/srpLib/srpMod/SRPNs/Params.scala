package typings
package srpLib.srpMod.SRPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var N: bignumLib.bignumMod.namespaced
  var N_length_bits: scala.Double
  var g: bignumLib.bignumMod.namespaced
  var hash: java.lang.String
}

object Params {
  @scala.inline
  def apply(
    N: bignumLib.bignumMod.namespaced,
    N_length_bits: scala.Double,
    g: bignumLib.bignumMod.namespaced,
    hash: java.lang.String
  ): Params = {
    val __obj = js.Dynamic.literal(N = N, N_length_bits = N_length_bits, g = g, hash = hash)
  
    __obj.asInstanceOf[Params]
  }
}

