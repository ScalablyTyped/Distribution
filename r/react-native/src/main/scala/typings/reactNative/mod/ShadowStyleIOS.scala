package typings.reactNative.mod

import typings.reactNative.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowStyleIOS extends js.Object {
  var shadowColor: js.UndefOr[ColorValue] = js.native
  var shadowOffset: js.UndefOr[Height] = js.native
  var shadowOpacity: js.UndefOr[Double] = js.native
  var shadowRadius: js.UndefOr[Double] = js.native
}

object ShadowStyleIOS {
  @scala.inline
  def apply(): ShadowStyleIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowStyleIOS]
  }
  @scala.inline
  implicit class ShadowStyleIOSOps[Self <: ShadowStyleIOS] (val x: Self) extends AnyVal {
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
    def setShadowColor(value: ColorValue): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffset(value: Height): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    @scala.inline
    def setShadowOpacity(value: Double): Self = this.set("shadowOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOpacity: Self = this.set("shadowOpacity", js.undefined)
    @scala.inline
    def setShadowRadius(value: Double): Self = this.set("shadowRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowRadius: Self = this.set("shadowRadius", js.undefined)
  }
  
}

