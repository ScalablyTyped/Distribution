package typings.reactNativeSensorManager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Azimuth extends js.Object {
  var azimuth: Double = js.native
  var pitch: Double = js.native
  var roll: Double = js.native
}

object Azimuth {
  @scala.inline
  def apply(azimuth: Double, pitch: Double, roll: Double): Azimuth = {
    val __obj = js.Dynamic.literal(azimuth = azimuth.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Azimuth]
  }
  @scala.inline
  implicit class AzimuthOps[Self <: Azimuth] (val x: Self) extends AnyVal {
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
    def setAzimuth(value: Double): Self = this.set("azimuth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoll(value: Double): Self = this.set("roll", value.asInstanceOf[js.Any])
  }
  
}

