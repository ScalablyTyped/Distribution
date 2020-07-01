package typings.streamsaver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version_ extends js.Object {
  var dot: Double
  var full: String
  var major: Double
  var minor: Double
}

object Version_ {
  @scala.inline
  def apply(dot: Double, full: String, major: Double, minor: Double): Version_ = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version_]
  }
}

