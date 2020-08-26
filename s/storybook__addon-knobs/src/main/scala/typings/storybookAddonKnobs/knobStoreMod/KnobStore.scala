package typings.storybookAddonKnobs.knobStoreMod

import typings.std.Partial
import typings.std.Record
import typings.storybookAddonKnobs.anon.DefaultValue
import typings.storybookAddonKnobs.anon.typeanygroupIdstringundef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobStore extends js.Object {
  var callbacks: js.Array[Callback] = js.native
  var store: Record[String, KnobStoreKnob] = js.native
  var timer: js.UndefOr[Double] = js.native
  def get(key: String): typeanygroupIdstringundef | DefaultValue = js.native
  def getAll(): Record[String, KnobStoreKnob] = js.native
  def has(key: String): Boolean = js.native
  def markAllUnused(): Unit = js.native
  def reset(): Unit = js.native
  def set(key: String, value: KnobStoreKnob): Unit = js.native
  def subscribe(cb: Callback): Unit = js.native
  def unsubscribe(cb: Callback): Unit = js.native
  def update(key: String, options: Partial[KnobStoreKnob]): Unit = js.native
}

object KnobStore {
  @scala.inline
  def apply(
    callbacks: js.Array[Callback],
    get: String => typeanygroupIdstringundef | DefaultValue,
    getAll: () => Record[String, KnobStoreKnob],
    has: String => Boolean,
    markAllUnused: () => Unit,
    reset: () => Unit,
    set: (String, KnobStoreKnob) => Unit,
    store: Record[String, KnobStoreKnob],
    subscribe: Callback => Unit,
    unsubscribe: Callback => Unit,
    update: (String, Partial[KnobStoreKnob]) => Unit
  ): KnobStore = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), has = js.Any.fromFunction1(has), markAllUnused = js.Any.fromFunction0(markAllUnused), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set), store = store.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[KnobStore]
  }
  @scala.inline
  implicit class KnobStoreOps[Self <: KnobStore] (val x: Self) extends AnyVal {
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
    def setCallbacksVarargs(value: Callback*): Self = this.set("callbacks", js.Array(value :_*))
    @scala.inline
    def setCallbacks(value: js.Array[Callback]): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: String => typeanygroupIdstringundef | DefaultValue): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAll(value: () => Record[String, KnobStoreKnob]): Self = this.set("getAll", js.Any.fromFunction0(value))
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setMarkAllUnused(value: () => Unit): Self = this.set("markAllUnused", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, KnobStoreKnob) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setStore(value: Record[String, KnobStoreKnob]): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribe(value: Callback => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
    @scala.inline
    def setUnsubscribe(value: Callback => Unit): Self = this.set("unsubscribe", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: (String, Partial[KnobStoreKnob]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
  }
  
}

