package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
trait ClientResult[T] extends StObject {
  
  def get_value(): T
  
  def setValue(value: T): Unit
}
object ClientResult {
  
  @scala.inline
  def apply[T](get_value: () => T, setValue: T => Unit): ClientResult[T] = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ClientResult[T]]
  }
  
  @scala.inline
  implicit class ClientResultMutableBuilder[Self <: ClientResult[?], T] (val x: Self & ClientResult[T]) extends AnyVal {
    
    @scala.inline
    def setGet_value(value: () => T): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValue(value: T => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
