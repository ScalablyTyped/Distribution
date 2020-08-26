package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A persistor is a redux store unto itself, allowing you to purge stored state, flush all
  * pending state serialization and immediately write to disk
  */
@js.native
trait Persistor extends js.Object {
  def dispatch(action: PersistorAction): PersistorAction = js.native
  def flush(): js.Promise[_] = js.native
  def getState(): PersistorState = js.native
  def pause(): Unit = js.native
  def persist(): Unit = js.native
  def purge(): js.Promise[_] = js.native
  def subscribe(callback: PersistorSubscribeCallback): js.Function0[_] = js.native
}

object Persistor {
  @scala.inline
  def apply(
    dispatch: PersistorAction => PersistorAction,
    flush: () => js.Promise[_],
    getState: () => PersistorState,
    pause: () => Unit,
    persist: () => Unit,
    purge: () => js.Promise[_],
    subscribe: PersistorSubscribeCallback => js.Function0[_]
  ): Persistor = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), flush = js.Any.fromFunction0(flush), getState = js.Any.fromFunction0(getState), pause = js.Any.fromFunction0(pause), persist = js.Any.fromFunction0(persist), purge = js.Any.fromFunction0(purge), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Persistor]
  }
  @scala.inline
  implicit class PersistorOps[Self <: Persistor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispatch(value: PersistorAction => PersistorAction): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setFlush(value: () => js.Promise[_]): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setGetState(value: () => PersistorState): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPersist(value: () => Unit): Self = this.set("persist", js.Any.fromFunction0(value))
    @scala.inline
    def setPurge(value: () => js.Promise[_]): Self = this.set("purge", js.Any.fromFunction0(value))
    @scala.inline
    def setSubscribe(value: PersistorSubscribeCallback => js.Function0[_]): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

