package typings.storybookReactNative.barMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var index: Double = js.native
  def onPress(id: Double): Unit = js.native
}

object Props {
  @scala.inline
  def apply(index: Double, onPress: Double => Unit): Props = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPress(value: Double => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
  }
  
}

