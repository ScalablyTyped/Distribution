package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchOptions[T]
  extends StObject
     with AsyncOptions[T] {
  
  var defer: js.UndefOr[Boolean] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
}
object FetchOptions {
  
  inline def apply[T](): FetchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchOptions[?], T] (val x: Self & FetchOptions[T]) extends AnyVal {
    
    inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
