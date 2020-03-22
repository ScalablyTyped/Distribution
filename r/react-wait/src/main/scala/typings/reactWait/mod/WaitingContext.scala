package typings.reactWait.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitingContext extends js.Object {
  var Wait: ComponentType[WaitingContextWaitProps]
  def endWaiting(): Unit
  def isWaiting(): Boolean
  def startWaiting(): Unit
}

object WaitingContext {
  @scala.inline
  def apply(
    Wait: ComponentType[WaitingContextWaitProps],
    endWaiting: () => Unit,
    isWaiting: () => Boolean,
    startWaiting: () => Unit
  ): WaitingContext = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], endWaiting = js.Any.fromFunction0(endWaiting), isWaiting = js.Any.fromFunction0(isWaiting), startWaiting = js.Any.fromFunction0(startWaiting))
  
    __obj.asInstanceOf[WaitingContext]
  }
}

