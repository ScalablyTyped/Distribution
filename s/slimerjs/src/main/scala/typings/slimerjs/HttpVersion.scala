package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpVersion extends js.Object {
  var major: Double
  var minor: Double
}

object HttpVersion {
  @scala.inline
  def apply(major: Double, minor: Double): HttpVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpVersion]
  }
}

