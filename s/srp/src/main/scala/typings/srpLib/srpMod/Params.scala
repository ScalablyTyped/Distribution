package typings
package srpLib.srpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var N: bignumLib.bignumMod.^
  var N_length_bits: scala.Double
  var g: bignumLib.bignumMod.^
  var hash: java.lang.String
}

object Params {
  @scala.inline
  def apply(
    N: bignumLib.bignumMod.^,
    N_length_bits: scala.Double,
    g: bignumLib.bignumMod.^,
    hash: java.lang.String
  ): Params = {
    val __obj = js.Dynamic.literal(N = N, N_length_bits = N_length_bits, g = g, hash = hash)
  
    __obj.asInstanceOf[Params]
  }
}

@JSImport("srp", "params")
@js.native
object params
  extends /* bits */ org.scalablytyped.runtime.StringDictionary[Params]

