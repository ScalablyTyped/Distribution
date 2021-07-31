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
  
  @scala.inline
  def apply[T](): FetchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions[T]]
  }
  
  @scala.inline
  implicit class FetchOptionsMutableBuilder[Self <: FetchOptions[?], T] (val x: Self & FetchOptions[T]) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
