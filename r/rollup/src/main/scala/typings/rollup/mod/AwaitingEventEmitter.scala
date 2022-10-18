package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitingEventEmitter[T /* <: StringDictionary[js.Function1[/* parameters */ Any, Any]] */] extends StObject {
  
  def close(): js.Promise[Unit]
  
  def emit[K /* <: /* keyof T */ String */](
    event: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param parameters because its type Parameters<T[K]> is not an array type */ parameters: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): js.Promise[Any]
  
  /**
  	 * Removes an event listener.
  	 */
  def off[K /* <: /* keyof T */ String */](event: K, listener: AwaitedEventListener[T, K]): this.type
  
  /**
  	 * Registers an event listener that will be awaited before Rollup continues.
  	 * All listeners will be awaited in parallel while rejections are tracked via
  	 * Promise.all.
  	 */
  def on[K /* <: /* keyof T */ String */](event: K, listener: AwaitedEventListener[T, K]): this.type
  
  /**
  	 * Registers an event listener that will be awaited before Rollup continues.
  	 * All listeners will be awaited in parallel while rejections are tracked via
  	 * Promise.all.
  	 * Listeners are removed automatically when removeListenersForCurrentRun is
  	 * called, which happens automatically after each run.
  	 */
  def onCurrentRun[K /* <: /* keyof T */ String */](
    event: K,
    listener: js.Function1[
      /* parameters */ Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      js.Promise[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]
    ]
  ): this.type
  
  def removeAllListeners(): this.type
  
  def removeListenersForCurrentRun(): this.type
}
object AwaitingEventEmitter {
  
  inline def apply[T /* <: StringDictionary[js.Function1[/* parameters */ Any, Any]] */](
    close: () => js.Promise[Unit],
    emit: (Any, Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]) => js.Promise[Any],
    off: (Any, AwaitedEventListener[T, Any]) => AwaitingEventEmitter[T],
    on: (Any, AwaitedEventListener[T, Any]) => AwaitingEventEmitter[T],
    onCurrentRun: (Any, js.Function1[
      /* parameters */ Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      js.Promise[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]
    ]) => AwaitingEventEmitter[T],
    removeAllListeners: () => AwaitingEventEmitter[T],
    removeListenersForCurrentRun: () => AwaitingEventEmitter[T]
  ): AwaitingEventEmitter[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), onCurrentRun = js.Any.fromFunction2(onCurrentRun), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListenersForCurrentRun = js.Any.fromFunction0(removeListenersForCurrentRun))
    __obj.asInstanceOf[AwaitingEventEmitter[T]]
  }
  
  extension [Self <: AwaitingEventEmitter[?], T /* <: StringDictionary[js.Function1[/* parameters */ Any, Any]] */](x: Self & AwaitingEventEmitter[T]) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setEmit(
      value: (Any, Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]) => js.Promise[Any]
    ): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setOff(value: (Any, AwaitedEventListener[T, Any]) => AwaitingEventEmitter[T]): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (Any, AwaitedEventListener[T, Any]) => AwaitingEventEmitter[T]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnCurrentRun(
      value: (Any, js.Function1[
          /* parameters */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
          ], 
          js.Promise[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
            ]
          ]
        ]) => AwaitingEventEmitter[T]
    ): Self = StObject.set(x, "onCurrentRun", js.Any.fromFunction2(value))
    
    inline def setRemoveAllListeners(value: () => AwaitingEventEmitter[T]): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
    
    inline def setRemoveListenersForCurrentRun(value: () => AwaitingEventEmitter[T]): Self = StObject.set(x, "removeListenersForCurrentRun", js.Any.fromFunction0(value))
  }
}
