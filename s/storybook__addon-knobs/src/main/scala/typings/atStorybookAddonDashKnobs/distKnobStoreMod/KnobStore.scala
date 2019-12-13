package typings.atStorybookAddonDashKnobs.distKnobStoreMod

import typings.atStorybookAddonDashKnobs.Anon_CallbackDefaultValue
import typings.atStorybookAddonDashKnobs.Anon_CallbackDefaultValueGroupId
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.value
import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobStore extends js.Object {
  var callbacks: js.Array[Callback]
  var store: Record[String, KnobStoreKnob]
  var timer: js.UndefOr[Double] = js.undefined
  def get(key: String): (Anon_CallbackDefaultValue with (Pick[KnobControlConfig[_], value])) | Anon_CallbackDefaultValueGroupId
  def getAll(): Record[String, KnobStoreKnob]
  def has(key: String): Boolean
  def markAllUnused(): Unit
  def reset(): Unit
  def set(key: String, value: KnobStoreKnob): Unit
  def subscribe(cb: Callback): Unit
  def unsubscribe(cb: Callback): Unit
  def update(key: String, options: Partial[KnobStoreKnob]): Unit
}

object KnobStore {
  @scala.inline
  def apply(
    callbacks: js.Array[Callback],
    get: String => (Anon_CallbackDefaultValue with (Pick[KnobControlConfig[_], value])) | Anon_CallbackDefaultValueGroupId,
    getAll: () => Record[String, KnobStoreKnob],
    has: String => Boolean,
    markAllUnused: () => Unit,
    reset: () => Unit,
    set: (String, KnobStoreKnob) => Unit,
    store: Record[String, KnobStoreKnob],
    subscribe: Callback => Unit,
    unsubscribe: Callback => Unit,
    update: (String, Partial[KnobStoreKnob]) => Unit,
    timer: Int | Double = null
  ): KnobStore = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), has = js.Any.fromFunction1(has), markAllUnused = js.Any.fromFunction0(markAllUnused), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set), store = store.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe), update = js.Any.fromFunction2(update))
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobStore]
  }
}

