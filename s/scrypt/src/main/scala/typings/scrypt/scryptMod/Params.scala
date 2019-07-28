package typings.scrypt.scryptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var N: Double
  var p: Double
  var r: Double
}

object Params {
  @scala.inline
  def apply(N: Double, p: Double, r: Double): Params = {
    val __obj = js.Dynamic.literal(N = N, p = p, r = r)
  
    __obj.asInstanceOf[Params]
  }
}

