package typings.quadstore

import typings.abstractLevel.mod.AbstractIterator
import typings.asynciterator.mod.BufferedIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsGetLeveliteratorMod {
  
  @JSImport("quadstore/dist/cjs/get/leveliterator", "LevelIterator")
  @js.native
  open class LevelIterator[K, V, T] protected () extends BufferedIterator[T] {
    def this(levelIterator: AbstractIterator[Any, K, V], mapper: MapFn[K, V, T]) = this()
    
    /* protected */ def _endLevel(cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /* protected */ def _onNextValue(state: ReadState[K, V], done: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    /* protected */ def _onNextValue(state: ReadState[K, V], done: js.Function1[/* err */ js.UndefOr[js.Error], Unit], err: js.Error): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: js.Error,
      key: K
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: js.Error,
      key: K,
      value: V
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: js.Error,
      key: Unit,
      value: V
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: Null,
      key: K
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: Null,
      key: K,
      value: V
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: Null,
      key: Unit,
      value: V
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: Unit,
      key: K
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: Unit,
      key: K,
      value: V
    ): Unit = js.native
    /* protected */ def _onNextValue(
      state: ReadState[K, V],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit],
      err: Unit,
      key: Unit,
      value: V
    ): Unit = js.native
    
    def _read(qty: Double, done: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    var level: AbstractIterator[Any, K, V] = js.native
    
    /* private */ var levelEnded: Any = js.native
    
    def mapFn(key: K, value: V): T = js.native
    @JSName("mapFn")
    var mapFn_Original: MapFn[K, V, T] = js.native
  }
  
  type MapFn[K, V, T] = js.Function2[/* key */ K, /* value */ V, T]
  
  type OnNextValue[K, V] = js.Function3[
    /* err */ js.UndefOr[js.Error | Null], 
    /* key */ js.UndefOr[K], 
    /* value */ js.UndefOr[V], 
    Any
  ]
  
  trait ReadState[K, V] extends StObject {
    
    def next(): Any
    def next(err: js.Error): Any
    def next(err: js.Error, key: K): Any
    def next(err: js.Error, key: K, value: V): Any
    def next(err: js.Error, key: Unit, value: V): Any
    def next(err: Null, key: K): Any
    def next(err: Null, key: K, value: V): Any
    def next(err: Null, key: Unit, value: V): Any
    def next(err: Unit, key: K): Any
    def next(err: Unit, key: K, value: V): Any
    def next(err: Unit, key: Unit, value: V): Any
    @JSName("next")
    var next_Original: OnNextValue[K, V]
    
    var remaining: Double
  }
  object ReadState {
    
    inline def apply[K, V](
      next: (/* err */ js.UndefOr[js.Error | Null], /* key */ js.UndefOr[K], /* value */ js.UndefOr[V]) => Any,
      remaining: Double
    ): ReadState[K, V] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction3(next), remaining = remaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadState[K, V]]
    }
    
    extension [Self <: ReadState[?, ?], K, V](x: Self & (ReadState[K, V])) {
      
      inline def setNext(
        value: (/* err */ js.UndefOr[js.Error | Null], /* key */ js.UndefOr[K], /* value */ js.UndefOr[V]) => Any
      ): Self = StObject.set(x, "next", js.Any.fromFunction3(value))
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    }
  }
}
