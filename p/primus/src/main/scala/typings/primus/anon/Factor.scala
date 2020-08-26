package typings.primus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factor extends js.Object {
  var factor: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var `reconnect timeout`: js.UndefOr[Double] = js.native
  var retries: js.UndefOr[Double] = js.native
}

object Factor {
  @scala.inline
  def apply(): Factor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Factor]
  }
  @scala.inline
  implicit class FactorOps[Self <: Factor] (val x: Self) extends AnyVal {
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
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def `setReconnect timeout`(value: Double): Self = this.set("reconnect timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReconnect timeout`: Self = this.set("reconnect timeout", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
  }
  
}

