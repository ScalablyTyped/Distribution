package typings.storybookReactNative.visibilityButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  def onPress(): Unit
}

object Props {
  @scala.inline
  def apply(onPress: () => Unit): Props = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Props]
  }
}

