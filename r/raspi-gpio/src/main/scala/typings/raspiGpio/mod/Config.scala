package typings.raspiGpio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var pin: Double | String = js.native
  var pullResistor: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(pin: Double | String): Config = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setPin(value: Double | String): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullResistor(value: Double): Self = this.set("pullResistor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullResistor: Self = this.set("pullResistor", js.undefined)
  }
  
}

