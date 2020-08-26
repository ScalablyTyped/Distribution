package typings.reactNativeGestureHandler.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseButtonProperties extends RawButtonProperties {
  var onActiveStateChange: js.UndefOr[js.Function1[/* active */ Boolean, Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[/* pointerInside */ Boolean, Unit]] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object BaseButtonProperties {
  @scala.inline
  def apply(): BaseButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseButtonProperties]
  }
  @scala.inline
  implicit class BaseButtonPropertiesOps[Self <: BaseButtonProperties] (val x: Self) extends AnyVal {
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
    def setOnActiveStateChange(value: /* active */ Boolean => Unit): Self = this.set("onActiveStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActiveStateChange: Self = this.set("onActiveStateChange", js.undefined)
    @scala.inline
    def setOnPress(value: /* pointerInside */ Boolean => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

