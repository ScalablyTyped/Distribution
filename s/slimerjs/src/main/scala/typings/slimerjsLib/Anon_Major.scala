package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  var major: scala.Double
  var minor: scala.Double
  var patch: scala.Double
}

object Anon_Major {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double, patch: scala.Double): Anon_Major = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[Anon_Major]
  }
}

