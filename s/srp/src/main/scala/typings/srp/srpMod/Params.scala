package typings.srp.srpMod

import org.scalablytyped.runtime.StringDictionary
import typings.bignum.bignumMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var N: ^
  var N_length_bits: Double
  var g: ^
  var hash: String
}

object Params {
  @scala.inline
  def apply(N: ^, N_length_bits: Double, g: ^, hash: String): Params = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], N_length_bits = N_length_bits.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Params]
  }
}

@JSImport("srp", "params")
@js.native
object params extends /* bits */ StringDictionary[Params]

