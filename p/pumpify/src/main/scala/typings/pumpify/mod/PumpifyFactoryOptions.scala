package typings.pumpify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PumpifyFactoryOptions extends js.Object {
  var autoDestroy: Boolean = js.native
  var destroy: Boolean = js.native
  var highWaterMark: Double = js.native
  var objectMode: Boolean = js.native
}

object PumpifyFactoryOptions {
  @scala.inline
  def apply(autoDestroy: Boolean, destroy: Boolean, highWaterMark: Double, objectMode: Boolean): PumpifyFactoryOptions = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PumpifyFactoryOptions]
  }
  @scala.inline
  implicit class PumpifyFactoryOptionsOps[Self <: PumpifyFactoryOptions] (val x: Self) extends AnyVal {
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
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
  }
  
}

