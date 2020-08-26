package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chi2 extends js.Object {
  var chi2: Double = js.native
  var passed: Boolean = js.native
}

object Chi2 {
  @scala.inline
  def apply(chi2: Double, passed: Boolean): Chi2 = {
    val __obj = js.Dynamic.literal(chi2 = chi2.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chi2]
  }
  @scala.inline
  implicit class Chi2Ops[Self <: Chi2] (val x: Self) extends AnyVal {
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
    def setChi2(value: Double): Self = this.set("chi2", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
  }
  
}

