package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventInit[T]
  extends StObject
     with EventInit {
  
  /* standard dom */
  var detail: js.UndefOr[T] = js.undefined
}
object CustomEventInit {
  
  inline def apply[T](): CustomEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventInit[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomEventInit[?], T] (val x: Self & CustomEventInit[T]) extends AnyVal {
    
    inline def setDetail(value: T): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
