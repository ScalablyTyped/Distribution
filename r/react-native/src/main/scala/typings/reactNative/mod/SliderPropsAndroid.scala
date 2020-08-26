package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderPropsAndroid extends ViewProps {
  /**
    * Color of the foreground switch grip.
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.native
}

object SliderPropsAndroid {
  @scala.inline
  def apply(): SliderPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPropsAndroid]
  }
  @scala.inline
  implicit class SliderPropsAndroidOps[Self <: SliderPropsAndroid] (val x: Self) extends AnyVal {
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
    def setThumbTintColor(value: ColorValue): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
  }
  
}

