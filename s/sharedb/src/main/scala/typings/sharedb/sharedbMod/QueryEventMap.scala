package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryEventMap[T] extends StObject {
  
  def changed(docs: js.Array[Doc[T]]): Unit
  
  def error(error: Error): Unit
  
  def extra(extra: Any): Unit
  
  def insert(inserted: js.Array[Doc[T]], index: Double): Unit
  
  def move(moved: js.Array[Doc[T]], from: Double, to: Double): Unit
  
  def ready(): Unit
  
  def remove(removed: js.Array[Doc[T]], index: Double): Unit
}
object QueryEventMap {
  
  inline def apply[T](
    changed: js.Array[Doc[T]] => Unit,
    error: Error => Unit,
    extra: Any => Unit,
    insert: (js.Array[Doc[T]], Double) => Unit,
    move: (js.Array[Doc[T]], Double, Double) => Unit,
    ready: () => Unit,
    remove: (js.Array[Doc[T]], Double) => Unit
  ): QueryEventMap[T] = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction1(changed), error = js.Any.fromFunction1(error), extra = js.Any.fromFunction1(extra), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction3(move), ready = js.Any.fromFunction0(ready), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[QueryEventMap[T]]
  }
  
  extension [Self <: QueryEventMap[?], T](x: Self & QueryEventMap[T]) {
    
    inline def setChanged(value: js.Array[Doc[T]] => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction1(value))
    
    inline def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setExtra(value: Any => Unit): Self = StObject.set(x, "extra", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (js.Array[Doc[T]], Double) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setMove(value: (js.Array[Doc[T]], Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setRemove(value: (js.Array[Doc[T]], Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
  }
}
