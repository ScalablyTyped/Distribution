package typings.serialport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vmin extends js.Object {
  var vmin: js.UndefOr[Double] = js.native
  var vtime: js.UndefOr[Double] = js.native
}

object Vmin {
  @scala.inline
  def apply(): Vmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vmin]
  }
  @scala.inline
  implicit class VminOps[Self <: Vmin] (val x: Self) extends AnyVal {
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
    def setVmin(value: Double): Self = this.set("vmin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmin: Self = this.set("vmin", js.undefined)
    @scala.inline
    def setVtime(value: Double): Self = this.set("vtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVtime: Self = this.set("vtime", js.undefined)
  }
  
}

