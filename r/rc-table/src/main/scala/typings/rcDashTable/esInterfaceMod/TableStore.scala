package typings.rcDashTable.esInterfaceMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStore extends js.Object {
  def getState(): TableStoreState
  def setState(state: Partial[TableStoreState]): Unit
}

object TableStore {
  @scala.inline
  def apply(getState: () => TableStoreState, setState: Partial[TableStoreState] => Unit): TableStore = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
  
    __obj.asInstanceOf[TableStore]
  }
}

