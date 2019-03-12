package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistor extends js.Object {
  def dispatch(action: PersistorAction): PersistorAction
  def flush(): js.Promise[_]
  def getState(): PersistorState
  def pause(): scala.Unit
  def persist(): scala.Unit
  def purge(): js.Promise[_]
  def subscribe(callback: PersistorSubscribeCallback): js.Function0[_]
}

object Persistor {
  @scala.inline
  def apply(
    dispatch: PersistorAction => PersistorAction,
    flush: () => js.Promise[_],
    getState: () => PersistorState,
    pause: () => scala.Unit,
    persist: () => scala.Unit,
    purge: () => js.Promise[_],
    subscribe: PersistorSubscribeCallback => js.Function0[_]
  ): Persistor = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), flush = js.Any.fromFunction0(flush), getState = js.Any.fromFunction0(getState), pause = js.Any.fromFunction0(pause), persist = js.Any.fromFunction0(persist), purge = js.Any.fromFunction0(purge), subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Persistor]
  }
}

