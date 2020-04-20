package typings.scrypt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params_ extends js.Object {
  var N: Double
  var p: Double
  var r: Double
}

object Params_ {
  @scala.inline
  def apply(N: Double, p: Double, r: Double): Params_ = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params_]
  }
}

