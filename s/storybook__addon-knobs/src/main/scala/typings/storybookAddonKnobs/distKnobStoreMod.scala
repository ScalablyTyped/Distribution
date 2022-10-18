package typings.storybookAddonKnobs

import typings.std.Partial
import typings.std.Record
import typings.storybookAddonKnobs.anon.DefaultValue
import typings.storybookAddonKnobs.anon.typeanygroupIdstringundef
import typings.storybookAddonKnobs.distTypeDefsMod.Knob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKnobStoreMod {
  
  @JSImport("@storybook/addon-knobs/dist/KnobStore", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with KnobStore {
    
    /* CompleteClass */
    var callbacks: js.Array[Callback] = js.native
    
    /* CompleteClass */
    override def get(key: String): typeanygroupIdstringundef | DefaultValue = js.native
    
    /* CompleteClass */
    override def getAll(): Record[String, KnobStoreKnob] = js.native
    
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def markAllUnused(): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def set(key: String, value: KnobStoreKnob): Unit = js.native
    
    /* CompleteClass */
    var store: Record[String, KnobStoreKnob] = js.native
    
    /* CompleteClass */
    override def subscribe(cb: Callback): Unit = js.native
    
    /* CompleteClass */
    override def unsubscribe(cb: Callback): Unit = js.native
    
    /* CompleteClass */
    override def update(key: String, options: Partial[KnobStoreKnob]): Unit = js.native
  }
  
  type Callback = js.Function0[Any]
  
  trait KnobStore extends StObject {
    
    var callbacks: js.Array[Callback]
    
    def get(key: String): typeanygroupIdstringundef | DefaultValue
    
    def getAll(): Record[String, KnobStoreKnob]
    
    def has(key: String): Boolean
    
    def markAllUnused(): Unit
    
    def reset(): Unit
    
    def set(key: String, value: KnobStoreKnob): Unit
    
    var store: Record[String, KnobStoreKnob]
    
    def subscribe(cb: Callback): Unit
    
    var timer: js.UndefOr[Double] = js.undefined
    
    def unsubscribe(cb: Callback): Unit
    
    def update(key: String, options: Partial[KnobStoreKnob]): Unit
  }
  object KnobStore {
    
    inline def apply(
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
    
    extension [Self <: KnobStore](x: Self) {
      
      inline def setCallbacks(value: js.Array[Callback]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksVarargs(value: Callback*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setGet(value: String => typeanygroupIdstringundef | DefaultValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: () => Record[String, KnobStoreKnob]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setMarkAllUnused(value: () => Unit): Self = StObject.set(x, "markAllUnused", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, KnobStoreKnob) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setStore(value: Record[String, KnobStoreKnob]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: Callback => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      inline def setUnsubscribe(value: Callback => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (String, Partial[KnobStoreKnob]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  type KnobStoreKnob = Knob[Any] & typings.storybookAddonKnobs.anon.Callback
}
