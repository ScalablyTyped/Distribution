package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOptions[T] extends AsyncOptions[T] {
  
  var defer: js.UndefOr[Boolean] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
}
object FetchOptions {
  
  @scala.inline
  def apply[T](): FetchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions[T]]
  }
  
  @scala.inline
  implicit class FetchOptionsMutableBuilder[Self <: FetchOptions[_], T] (val x: Self with FetchOptions[T]) extends AnyVal {
    
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
