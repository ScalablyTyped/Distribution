package typings
package reduxDashObservableLib.reduxDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", "StateObservable")
@js.native
class StateObservable[S] protected ()
  extends rxjsLib.rxjsMod.Observable[S] {
  def this(stateSubject: rxjsLib.rxjsMod.Subject[S], initialState: S) = this()
  @JSName("source")
  var source_StateObservable: rxjsLib.rxjsMod.Subject[S] = js.native
  var value: S = js.native
}

