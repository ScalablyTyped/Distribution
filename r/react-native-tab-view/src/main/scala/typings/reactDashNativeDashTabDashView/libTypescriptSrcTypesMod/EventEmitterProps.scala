package typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod

import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.enter
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
  def apply(addListener_enter: (enter, Listener) => Unit, removeListener_enter: (enter, Listener) => Unit): EventEmitterProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2(addListener_enter))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2(removeListener_enter))
    __obj.asInstanceOf[EventEmitterProps]
  }
}

