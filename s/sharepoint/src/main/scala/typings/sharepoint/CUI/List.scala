package typings.sharepoint.CUI

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List[T] extends IEnumerable[T] {
  
  def add(data: T): scala.Unit = js.native
  
  def clear(): scala.Unit = js.native
  
  def getEnumeratorAtPos(): ListEnumerator[T] = js.native
  
  def get_count(): Double = js.native
  
  def get_item(index: Double): T = js.native
  
  def indexOf(data: T): Double = js.native
  
  def insert(index: Double, data: T): scala.Unit = js.native
  
  def remove(data: T): scala.Unit = js.native
}
object List {
  
  @scala.inline
  def apply[T](
    add: T => scala.Unit,
    clear: () => scala.Unit,
    getEnumerator: () => IEnumerator[T],
    getEnumeratorAtPos: () => ListEnumerator[T],
    get_count: () => Double,
    get_item: Double => T,
    indexOf: T => Double,
    insert: (Double, T) => scala.Unit,
    remove: T => scala.Unit
  ): List[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), getEnumerator = js.Any.fromFunction0(getEnumerator), getEnumeratorAtPos = js.Any.fromFunction0(getEnumeratorAtPos), get_count = js.Any.fromFunction0(get_count), get_item = js.Any.fromFunction1(get_item), indexOf = js.Any.fromFunction1(indexOf), insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[List[T]]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List[_], T] (val x: Self with List[T]) extends AnyVal {
    
    @scala.inline
    def setAdd(value: T => scala.Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => scala.Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnumeratorAtPos(value: () => ListEnumerator[T]): Self = StObject.set(x, "getEnumeratorAtPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_count(value: () => Double): Self = StObject.set(x, "get_count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_item(value: Double => T): Self = StObject.set(x, "get_item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOf(value: T => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: (Double, T) => scala.Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: T => scala.Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
