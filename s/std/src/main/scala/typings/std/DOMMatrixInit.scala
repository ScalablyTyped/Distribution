package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMatrixInit extends DOMMatrix2DInit {
  var is2D: js.UndefOr[scala.Boolean] = js.native
  var m13: js.UndefOr[Double] = js.native
  var m14: js.UndefOr[Double] = js.native
  var m23: js.UndefOr[Double] = js.native
  var m24: js.UndefOr[Double] = js.native
  var m31: js.UndefOr[Double] = js.native
  var m32: js.UndefOr[Double] = js.native
  var m33: js.UndefOr[Double] = js.native
  var m34: js.UndefOr[Double] = js.native
  var m43: js.UndefOr[Double] = js.native
  var m44: js.UndefOr[Double] = js.native
}

object DOMMatrixInit {
  @scala.inline
  def apply(): DOMMatrixInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMMatrixInit]
  }
  @scala.inline
  implicit class DOMMatrixInitOps[Self <: DOMMatrixInit] (val x: Self) extends AnyVal {
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
    def setIs2D(value: scala.Boolean): Self = this.set("is2D", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs2D: Self = this.set("is2D", js.undefined)
    @scala.inline
    def setM13(value: Double): Self = this.set("m13", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM13: Self = this.set("m13", js.undefined)
    @scala.inline
    def setM14(value: Double): Self = this.set("m14", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM14: Self = this.set("m14", js.undefined)
    @scala.inline
    def setM23(value: Double): Self = this.set("m23", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM23: Self = this.set("m23", js.undefined)
    @scala.inline
    def setM24(value: Double): Self = this.set("m24", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM24: Self = this.set("m24", js.undefined)
    @scala.inline
    def setM31(value: Double): Self = this.set("m31", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM31: Self = this.set("m31", js.undefined)
    @scala.inline
    def setM32(value: Double): Self = this.set("m32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM32: Self = this.set("m32", js.undefined)
    @scala.inline
    def setM33(value: Double): Self = this.set("m33", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM33: Self = this.set("m33", js.undefined)
    @scala.inline
    def setM34(value: Double): Self = this.set("m34", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM34: Self = this.set("m34", js.undefined)
    @scala.inline
    def setM43(value: Double): Self = this.set("m43", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM43: Self = this.set("m43", js.undefined)
    @scala.inline
    def setM44(value: Double): Self = this.set("m44", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM44: Self = this.set("m44", js.undefined)
  }
  
}

