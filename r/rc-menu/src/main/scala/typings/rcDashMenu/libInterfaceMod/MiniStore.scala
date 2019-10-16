package typings.rcDashMenu.libInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniStore extends js.Object {
  def getState(): js.Any
  def setState(state: js.Any): Unit
}

object MiniStore {
  @scala.inline
  def apply(getState: () => js.Any, setState: js.Any => Unit): MiniStore = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
  
    __obj.asInstanceOf[MiniStore]
  }
}

