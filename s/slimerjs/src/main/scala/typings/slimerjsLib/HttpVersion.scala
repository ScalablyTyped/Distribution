package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpVersion extends js.Object {
  var major: scala.Double
  var minor: scala.Double
}

object HttpVersion {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double): HttpVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.asInstanceOf[HttpVersion]
  }
}

