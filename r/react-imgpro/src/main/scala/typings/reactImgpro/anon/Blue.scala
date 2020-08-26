package typings.reactImgpro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blue extends js.Object {
  var blue: js.UndefOr[Double] = js.native
  var brighten: js.UndefOr[Double] = js.native
  var darken: js.UndefOr[Double] = js.native
  var desaturate: js.UndefOr[Double] = js.native
  var green: js.UndefOr[Double] = js.native
  var greyscale: js.UndefOr[Double] = js.native
  var lighten: js.UndefOr[Double] = js.native
  var mix: js.UndefOr[Amount] = js.native
  var red: js.UndefOr[Double] = js.native
  var saturate: js.UndefOr[Double] = js.native
  var shade: js.UndefOr[Double] = js.native
  var spin: js.UndefOr[Double] = js.native
  var tint: js.UndefOr[Double] = js.native
  var xor: js.UndefOr[Double] = js.native
}

object Blue {
  @scala.inline
  def apply(): Blue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blue]
  }
  @scala.inline
  implicit class BlueOps[Self <: Blue] (val x: Self) extends AnyVal {
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
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    @scala.inline
    def setBrighten(value: Double): Self = this.set("brighten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrighten: Self = this.set("brighten", js.undefined)
    @scala.inline
    def setDarken(value: Double): Self = this.set("darken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarken: Self = this.set("darken", js.undefined)
    @scala.inline
    def setDesaturate(value: Double): Self = this.set("desaturate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesaturate: Self = this.set("desaturate", js.undefined)
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    @scala.inline
    def setGreyscale(value: Double): Self = this.set("greyscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreyscale: Self = this.set("greyscale", js.undefined)
    @scala.inline
    def setLighten(value: Double): Self = this.set("lighten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLighten: Self = this.set("lighten", js.undefined)
    @scala.inline
    def setMix(value: Amount): Self = this.set("mix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMix: Self = this.set("mix", js.undefined)
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
    @scala.inline
    def setSaturate(value: Double): Self = this.set("saturate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaturate: Self = this.set("saturate", js.undefined)
    @scala.inline
    def setShade(value: Double): Self = this.set("shade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShade: Self = this.set("shade", js.undefined)
    @scala.inline
    def setSpin(value: Double): Self = this.set("spin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    @scala.inline
    def setTint(value: Double): Self = this.set("tint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTint: Self = this.set("tint", js.undefined)
    @scala.inline
    def setXor(value: Double): Self = this.set("xor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXor: Self = this.set("xor", js.undefined)
  }
  
}

