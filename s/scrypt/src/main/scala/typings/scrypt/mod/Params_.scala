package typings.scrypt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params_ extends js.Object {
  var N: Double = js.native
  var p: Double = js.native
  var r: Double = js.native
}

object Params_ {
  @scala.inline
  def apply(N: Double, p: Double, r: Double): Params_ = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params_]
  }
  @scala.inline
  implicit class Params_Ops[Self <: Params_] (val x: Self) extends AnyVal {
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
    def setN(value: Double): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

