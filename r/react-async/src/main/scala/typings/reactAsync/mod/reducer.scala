package typings.reactAsync.mod

import typings.reactAsync.reactAsyncStrings.counter
import typings.reactAsync.reactAsyncStrings.initialValue
import typings.reactAsync.reactAsyncStrings.promise
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-async", "reducer")
@js.native
object reducer extends js.Object {
  
  def apply[T](
    state: (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]),
    action: AsyncAction[T]
  ): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = js.native
}
