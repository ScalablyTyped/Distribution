package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.Instantiable0
import typings.reactNative.mod.TouchableWithoutFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var touchableComponent: Instantiable0[TouchableWithoutFeedback] = js.native
}

object `0` {
  @scala.inline
  def apply(touchableComponent: Instantiable0[TouchableWithoutFeedback]): `0` = {
    val __obj = js.Dynamic.literal(touchableComponent = touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setTouchableComponent(value: Instantiable0[TouchableWithoutFeedback]): Self = this.set("touchableComponent", value.asInstanceOf[js.Any])
  }
  
}

