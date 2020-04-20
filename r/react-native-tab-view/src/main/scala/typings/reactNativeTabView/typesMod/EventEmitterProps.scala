package typings.reactNativeTabView.typesMod

import typings.reactNativeTabView.reactNativeTabViewStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEmitterProps extends js.Object {
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit
}

object EventEmitterProps {
  @scala.inline
  def apply(addListener: (enter, Listener) => Unit, removeListener: (enter, Listener) => Unit): EventEmitterProps = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[EventEmitterProps]
  }
}

