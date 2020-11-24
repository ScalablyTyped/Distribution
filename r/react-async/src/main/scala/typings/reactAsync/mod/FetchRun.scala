package typings.reactAsync.mod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Error
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<react-async.react-async.AbstractState<T>, 'run'> */
@js.native
trait FetchRun[T] extends js.Object {
  
  var cancel: js.Function0[Unit] = js.native
  
  var counter: Double = js.native
  
  var initialValue: js.UndefOr[T | Error] = js.native
  
  var promise: js.Promise[T] = js.native
  
  var reload: js.Function0[Unit] = js.native
  
  def run(): Unit = js.native
  def run(ignoredEvent: SyntheticEvent[Element, Event]): Unit = js.native
  def run(ignoredEvent: Event): Unit = js.native
  def run(overrideParams: js.Function1[/* params */ js.UndefOr[OverrideParams], OverrideParams]): Unit = js.native
  def run(overrideParams: OverrideParams): Unit = js.native
  
  var setData: js.Function2[/* data */ T, /* callback */ js.UndefOr[js.Function0[Unit]], T] = js.native
  
  var setError: js.Function2[/* error */ Error, /* callback */ js.UndefOr[js.Function0[Unit]], Error] = js.native
}
