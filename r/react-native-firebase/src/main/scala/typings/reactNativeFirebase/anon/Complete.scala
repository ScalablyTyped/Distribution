package typings.reactNativeFirebase.anon

import typings.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typings.reactNativeFirebase.mod.RNFirebase.Handler
import typings.reactNativeFirebase.mod.RNFirebase.RnError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete[T] extends StObject {
  
  var complete: js.UndefOr[Handler[T]] = js.undefined
  
  var error: js.UndefOr[ErrorHandler] = js.undefined
  
  var next: js.UndefOr[Handler[T]] = js.undefined
}
object Complete {
  
  @scala.inline
  def apply[T](): Complete[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete[T]]
  }
  
  @scala.inline
  implicit class CompleteMutableBuilder[Self <: Complete[?], T] (val x: Self & Complete[T]) extends AnyVal {
    
    @scala.inline
    def setComplete(value: T => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setError(value: RnError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
