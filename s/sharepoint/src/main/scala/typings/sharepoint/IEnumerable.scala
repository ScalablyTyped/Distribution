package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnumerable[T] extends StObject {
  
  def getEnumerator(): IEnumerator[T] = js.native
}
object IEnumerable {
  
  @scala.inline
  def apply[T](getEnumerator: () => IEnumerator[T]): IEnumerable[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator))
    __obj.asInstanceOf[IEnumerable[T]]
  }
  
  @scala.inline
  implicit class IEnumerableMutableBuilder[Self <: IEnumerable[_], T] (val x: Self with IEnumerable[T]) extends AnyVal {
    
    @scala.inline
    def setGetEnumerator(value: () => IEnumerator[T]): Self = StObject.set(x, "getEnumerator", js.Any.fromFunction0(value))
  }
}
