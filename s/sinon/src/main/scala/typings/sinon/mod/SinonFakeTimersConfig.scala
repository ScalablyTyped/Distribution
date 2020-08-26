package typings.sinon.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeTimersConfig extends js.Object {
  var now: Double | Date = js.native
  var shouldAdvanceTime: Boolean = js.native
  var toFake: js.Array[String] = js.native
}

object SinonFakeTimersConfig {
  @scala.inline
  def apply(now: Double | Date, shouldAdvanceTime: Boolean, toFake: js.Array[String]): SinonFakeTimersConfig = {
    val __obj = js.Dynamic.literal(now = now.asInstanceOf[js.Any], shouldAdvanceTime = shouldAdvanceTime.asInstanceOf[js.Any], toFake = toFake.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonFakeTimersConfig]
  }
  @scala.inline
  implicit class SinonFakeTimersConfigOps[Self <: SinonFakeTimersConfig] (val x: Self) extends AnyVal {
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
    def setNow(value: Double | Date): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldAdvanceTime(value: Boolean): Self = this.set("shouldAdvanceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setToFakeVarargs(value: String*): Self = this.set("toFake", js.Array(value :_*))
    @scala.inline
    def setToFake(value: js.Array[String]): Self = this.set("toFake", value.asInstanceOf[js.Any])
  }
  
}

