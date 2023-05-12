package typings.sentryBrowser.anon

import typings.sentryTypes.typesEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add[Key /* <: String */, Value /* <: Event */] extends StObject {
  
  def add(key: Key, value: Value): Unit
  
  def clear(): Unit
  
  def delete(key: Key): Boolean
  
  def get(key: Key): js.UndefOr[Value]
  
  def size(): Double
}
object Add {
  
  inline def apply[Key /* <: String */, Value /* <: Event */](
    add: (Key, Value) => Unit,
    clear: () => Unit,
    delete: Key => Boolean,
    get: Key => js.UndefOr[Value],
    size: () => Double
  ): Add[Key, Value] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Add[Key, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Add[?, ?], Key /* <: String */, Value /* <: Event */] (val x: Self & (Add[Key, Value])) extends AnyVal {
    
    inline def setAdd(value: (Key, Value) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDelete(value: Key => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: Key => js.UndefOr[Value]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
