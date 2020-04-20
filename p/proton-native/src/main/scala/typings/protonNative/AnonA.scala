package typings.protonNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA extends js.Object {
  var a: Double
  var b: Double
  var g: Double
  var r: Double
}

object AnonA {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): AnonA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonA]
  }
}

