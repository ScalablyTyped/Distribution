package typings.streamsaver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version_ extends js.Object {
  var dot: Double = js.native
  var full: String = js.native
  var major: Double = js.native
  var minor: Double = js.native
}

object Version_ {
  @scala.inline
  def apply(dot: Double, full: String, major: Double, minor: Double): Version_ = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version_]
  }
  @scala.inline
  implicit class Version_Ops[Self <: Version_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDot(value: Double): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
  }
  
}

