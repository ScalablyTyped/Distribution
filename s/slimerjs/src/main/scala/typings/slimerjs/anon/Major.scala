package typings.slimerjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Major extends js.Object {
  var major: Double
  var minor: Double
  var patch: Double
}

object Major {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
}

