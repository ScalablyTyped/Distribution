package typings.storybookReactNative.barMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var index: Double
  def onPress(id: Double): Unit
}

object Props {
  @scala.inline
  def apply(index: Double, onPress: Double => Unit): Props = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[Props]
  }
}

