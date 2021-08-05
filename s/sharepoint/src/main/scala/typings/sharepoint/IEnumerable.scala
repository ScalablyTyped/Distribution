package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnumerable[T] extends StObject {
  
  def getEnumerator(): IEnumerator[T]
}
object IEnumerable {
  
  inline def apply[T](getEnumerator: () => IEnumerator[T]): IEnumerable[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator))
    __obj.asInstanceOf[IEnumerable[T]]
  }
  
  extension [Self <: IEnumerable[?], T](x: Self & IEnumerable[T]) {
    
    inline def setGetEnumerator(value: () => IEnumerator[T]): Self = StObject.set(x, "getEnumerator", js.Any.fromFunction0(value))
  }
}
