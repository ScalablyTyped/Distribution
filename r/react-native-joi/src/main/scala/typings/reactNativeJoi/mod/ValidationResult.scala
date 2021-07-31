package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<std.Promise<T>, 'then' | 'catch'> */
trait ValidationResult[T] extends StObject {
  
  def `catch`[TResult](): js.Promise[T | TResult]
  @JSName("catch")
  var catch_Original: js.Function0[js.Promise[T | scala.Nothing]]
  
  var error: ValidationError
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  @JSName("then")
  var then_Original: js.Function0[js.Promise[T | scala.Nothing]]
  
  var value: T
}
object ValidationResult {
  
  @scala.inline
  def apply[T](
    `catch`: () => js.Promise[T | scala.Nothing],
    error: ValidationError,
    `then`: () => js.Promise[T | scala.Nothing],
    value: T
  ): ValidationResult[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ValidationResult[T]]
  }
  
  @scala.inline
  implicit class ValidationResultMutableBuilder[Self <: ValidationResult[?], T] (val x: Self & ValidationResult[T]) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[T | scala.Nothing]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: ValidationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThen(value: () => js.Promise[T | scala.Nothing]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
