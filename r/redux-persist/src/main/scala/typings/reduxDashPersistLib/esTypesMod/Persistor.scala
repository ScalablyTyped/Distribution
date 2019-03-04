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
    dispatch: js.Function1[PersistorAction, PersistorAction],
    flush: js.Function0[js.Promise[_]],
    getState: js.Function0[PersistorState],
    pause: js.Function0[scala.Unit],
    persist: js.Function0[scala.Unit],
    purge: js.Function0[js.Promise[_]],
    subscribe: js.Function1[PersistorSubscribeCallback, js.Function0[_]]
  ): Persistor = {
    val __obj = js.Dynamic.literal(dispatch = dispatch, flush = flush, getState = getState, pause = pause, persist = persist, purge = purge, subscribe = subscribe)
  
    __obj.asInstanceOf[Persistor]
  }
}

