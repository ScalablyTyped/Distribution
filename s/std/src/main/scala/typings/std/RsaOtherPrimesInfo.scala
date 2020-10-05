package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaOtherPrimesInfo extends js.Object {
  var d: js.UndefOr[java.lang.String] = js.native
  var r: js.UndefOr[java.lang.String] = js.native
  var t: js.UndefOr[java.lang.String] = js.native
}

object RsaOtherPrimesInfo {
  @scala.inline
  def apply(): RsaOtherPrimesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RsaOtherPrimesInfo]
  }
  @scala.inline
  implicit class RsaOtherPrimesInfoOps[Self <: RsaOtherPrimesInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setD(value: java.lang.String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setR(value: java.lang.String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setT(value: java.lang.String): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
  }
  
}

