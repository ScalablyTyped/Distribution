package typings
package scryptLib.scryptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var N: scala.Double
  var p: scala.Double
  var r: scala.Double
}

object Params {
  @scala.inline
  def apply(N: scala.Double, p: scala.Double, r: scala.Double): Params = {
    val __obj = js.Dynamic.literal(N = N, p = p, r = r)
  
    __obj.asInstanceOf[Params]
  }
}

