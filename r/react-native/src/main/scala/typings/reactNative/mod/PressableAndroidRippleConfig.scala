package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PressableAndroidRippleConfig extends js.Object {
  var borderless: js.UndefOr[Null | Boolean] = js.native
  var color: js.UndefOr[Null | ColorValue] = js.native
  var radius: js.UndefOr[Null | Double] = js.native
}

object PressableAndroidRippleConfig {
  @scala.inline
  def apply(): PressableAndroidRippleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressableAndroidRippleConfig]
  }
  @scala.inline
  implicit class PressableAndroidRippleConfigOps[Self <: PressableAndroidRippleConfig] (val x: Self) extends AnyVal {
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
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setBorderlessNull: Self = this.set("borderless", null)
    @scala.inline
    def setColor(value: ColorValue): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRadiusNull: Self = this.set("radius", null)
  }
  
}

