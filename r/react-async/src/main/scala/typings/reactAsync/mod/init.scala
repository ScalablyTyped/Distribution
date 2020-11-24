package typings.reactAsync.mod

import typings.reactAsync.anon.InitialValue
import typings.reactAsync.reactAsyncStrings.counter
import typings.reactAsync.reactAsyncStrings.initialValue
import typings.reactAsync.reactAsyncStrings.promise
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-async", "init")
@js.native
object init extends js.Object {
  
  def apply[T](hasInitialValuePromisePromiseFn: InitialValue[T]): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = js.native
}
