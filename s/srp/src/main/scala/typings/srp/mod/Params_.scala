package typings.srp.mod

import typings.bignum.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params_ extends js.Object {
  var N: ^
  var N_length_bits: Double
  var g: ^
  var hash: String
}

object Params_ {
  @scala.inline
  def apply(N: ^, N_length_bits: Double, g: ^, hash: String): Params_ = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], N_length_bits = N_length_bits.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Params_]
  }
}

