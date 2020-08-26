package typings.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * picks - Specifies how many random elements you want to pick. By default it picks 1.
  * rng - Specifies a custom random number generator.
  */
@js.native
trait PickOptions extends js.Object {
  var picks: js.UndefOr[Double] = js.native
  var rng: js.UndefOr[js.Function0[Double]] = js.native
}

object PickOptions {
  @scala.inline
  def apply(): PickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptions]
  }
  @scala.inline
  implicit class PickOptionsOps[Self <: PickOptions] (val x: Self) extends AnyVal {
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
    def setPicks(value: Double): Self = this.set("picks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicks: Self = this.set("picks", js.undefined)
    @scala.inline
    def setRng(value: () => Double): Self = this.set("rng", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRng: Self = this.set("rng", js.undefined)
  }
  
}

