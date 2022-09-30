package typings.sharepoint.CUI

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List[T]
  extends StObject
     with IEnumerable[T] {
  
  def add(data: T): scala.Unit
  
  def clear(): scala.Unit
  
  def getEnumeratorAtPos(): ListEnumerator[T]
  
  def get_count(): Double
  
  def get_item(index: Double): T
  
  def indexOf(data: T): Double
  
  def insert(index: Double, data: T): scala.Unit
  
  def remove(data: T): scala.Unit
}
object List {
  
  inline def apply[T](
    add: T => scala.Unit,
    clear: () => scala.Unit,
    getEnumerator: () => IEnumerator[T],
    getEnumeratorAtPos: () => ListEnumerator[T],
    get_count: () => Double,
    get_item: Double => T,
    indexOf: T => Double,
    insert: (Double, T) => scala.Unit,
    remove: T => scala.Unit
  ): typings.sharepoint.CUI.List[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), getEnumerator = js.Any.fromFunction0(getEnumerator), getEnumeratorAtPos = js.Any.fromFunction0(getEnumeratorAtPos), get_count = js.Any.fromFunction0(get_count), get_item = js.Any.fromFunction1(get_item), indexOf = js.Any.fromFunction1(indexOf), insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[typings.sharepoint.CUI.List[T]]
  }
  
  extension [Self <: typings.sharepoint.CUI.List[?], T](x: Self & typings.sharepoint.CUI.List[T]) {
    
    inline def setAdd(value: T => scala.Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => scala.Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetEnumeratorAtPos(value: () => ListEnumerator[T]): Self = StObject.set(x, "getEnumeratorAtPos", js.Any.fromFunction0(value))
    
    inline def setGet_count(value: () => Double): Self = StObject.set(x, "get_count", js.Any.fromFunction0(value))
    
    inline def setGet_item(value: Double => T): Self = StObject.set(x, "get_item", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: T => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (Double, T) => scala.Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setRemove(value: T => scala.Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
