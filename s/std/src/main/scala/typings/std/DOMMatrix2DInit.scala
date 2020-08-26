package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrix2DInit extends js.Object {
  var a: js.UndefOr[Double] = js.native
  var b: js.UndefOr[Double] = js.native
  var c: js.UndefOr[Double] = js.native
  var d: js.UndefOr[Double] = js.native
  var e: js.UndefOr[Double] = js.native
  var f: js.UndefOr[Double] = js.native
  var m11: js.UndefOr[Double] = js.native
  var m12: js.UndefOr[Double] = js.native
  var m21: js.UndefOr[Double] = js.native
  var m22: js.UndefOr[Double] = js.native
  var m41: js.UndefOr[Double] = js.native
  var m42: js.UndefOr[Double] = js.native
}

object DOMMatrix2DInit {
  @scala.inline
  def apply(): DOMMatrix2DInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMMatrix2DInit]
  }
  @scala.inline
  implicit class DOMMatrix2DInitOps[Self <: DOMMatrix2DInit] (val x: Self) extends AnyVal {
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    @scala.inline
    def setC(value: Double): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    @scala.inline
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    @scala.inline
    def setM11(value: Double): Self = this.set("m11", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM11: Self = this.set("m11", js.undefined)
    @scala.inline
    def setM12(value: Double): Self = this.set("m12", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM12: Self = this.set("m12", js.undefined)
    @scala.inline
    def setM21(value: Double): Self = this.set("m21", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM21: Self = this.set("m21", js.undefined)
    @scala.inline
    def setM22(value: Double): Self = this.set("m22", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM22: Self = this.set("m22", js.undefined)
    @scala.inline
    def setM41(value: Double): Self = this.set("m41", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM41: Self = this.set("m41", js.undefined)
    @scala.inline
    def setM42(value: Double): Self = this.set("m42", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM42: Self = this.set("m42", js.undefined)
  }
  
}

