package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocEventMap[T] extends StObject {
  
  def `before op`(ops: js.Array[Any], source: Any, clientId: String): Unit
  
  def `before op batch`(ops: js.Array[Any], source: Any): Unit
  
  def create(source: Any): Unit
  
  def del(data: T, source: Any): Unit
  
  def destroy(): Unit
  
  def error(error: Error): Unit
  
  def load(): Unit
  
  def `no write pending`(): Unit
  
  def `nothing pending`(): Unit
  
  def op(ops: js.Array[Any], source: Any, clientId: String): Unit
  
  def `op batch`(ops: js.Array[Any], source: Any): Unit
}
object DocEventMap {
  
  inline def apply[T](
    `before op`: (js.Array[Any], Any, String) => Unit,
    `before op batch`: (js.Array[Any], Any) => Unit,
    create: Any => Unit,
    del: (T, Any) => Unit,
    destroy: () => Unit,
    error: Error => Unit,
    load: () => Unit,
    `no write pending`: () => Unit,
    `nothing pending`: () => Unit,
    op: (js.Array[Any], Any, String) => Unit,
    `op batch`: (js.Array[Any], Any) => Unit
  ): DocEventMap[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), del = js.Any.fromFunction2(del), destroy = js.Any.fromFunction0(destroy), error = js.Any.fromFunction1(error), load = js.Any.fromFunction0(load), op = js.Any.fromFunction3(op))
    __obj.updateDynamic("before op")(js.Any.fromFunction3(`before op`))
    __obj.updateDynamic("before op batch")(js.Any.fromFunction2(`before op batch`))
    __obj.updateDynamic("no write pending")(js.Any.fromFunction0(`no write pending`))
    __obj.updateDynamic("nothing pending")(js.Any.fromFunction0(`nothing pending`))
    __obj.updateDynamic("op batch")(js.Any.fromFunction2(`op batch`))
    __obj.asInstanceOf[DocEventMap[T]]
  }
  
  extension [Self <: DocEventMap[?], T](x: Self & DocEventMap[T]) {
    
    inline def `setBefore op`(value: (js.Array[Any], Any, String) => Unit): Self = StObject.set(x, "before op", js.Any.fromFunction3(value))
    
    inline def `setBefore op batch`(value: (js.Array[Any], Any) => Unit): Self = StObject.set(x, "before op batch", js.Any.fromFunction2(value))
    
    inline def setCreate(value: Any => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setDel(value: (T, Any) => Unit): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def `setNo write pending`(value: () => Unit): Self = StObject.set(x, "no write pending", js.Any.fromFunction0(value))
    
    inline def `setNothing pending`(value: () => Unit): Self = StObject.set(x, "nothing pending", js.Any.fromFunction0(value))
    
    inline def setOp(value: (js.Array[Any], Any, String) => Unit): Self = StObject.set(x, "op", js.Any.fromFunction3(value))
    
    inline def `setOp batch`(value: (js.Array[Any], Any) => Unit): Self = StObject.set(x, "op batch", js.Any.fromFunction2(value))
  }
}
