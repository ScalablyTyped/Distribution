package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  var major: Double
  var minor: Double
  var patch: Double
}

object Anon_Major {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): Anon_Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Major]
  }
}

