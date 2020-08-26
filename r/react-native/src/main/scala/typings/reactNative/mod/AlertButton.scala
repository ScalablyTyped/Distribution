package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.cancel
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.destructive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertButton extends js.Object {
  var onPress: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.native
  var style: js.UndefOr[default | cancel | destructive] = js.native
  var text: js.UndefOr[String] = js.native
}

object AlertButton {
  @scala.inline
  def apply(): AlertButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertButton]
  }
  @scala.inline
  implicit class AlertButtonOps[Self <: AlertButton] (val x: Self) extends AnyVal {
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
    def setOnPress(value: /* value */ js.UndefOr[String] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setStyle(value: default | cancel | destructive): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

