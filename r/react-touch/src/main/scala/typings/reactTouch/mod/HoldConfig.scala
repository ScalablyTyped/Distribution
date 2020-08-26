package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldConfig extends js.Object {
  /** @default 1000 */
  var holdFor: js.UndefOr[Double] = js.native
  /** @default 250 */
  var updateEvery: js.UndefOr[Double] = js.native
}

object HoldConfig {
  @scala.inline
  def apply(): HoldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldConfig]
  }
  @scala.inline
  implicit class HoldConfigOps[Self <: HoldConfig] (val x: Self) extends AnyVal {
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
    def setHoldFor(value: Double): Self = this.set("holdFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoldFor: Self = this.set("holdFor", js.undefined)
    @scala.inline
    def setUpdateEvery(value: Double): Self = this.set("updateEvery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateEvery: Self = this.set("updateEvery", js.undefined)
  }
  
}

