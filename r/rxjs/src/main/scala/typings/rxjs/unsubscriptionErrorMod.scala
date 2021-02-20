package typings.rxjs

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsubscriptionErrorMod {
  
  @js.native
  trait UnsubscriptionError extends Error {
    
    val errors: js.Array[_] = js.native
  }
  object UnsubscriptionError {
    
    @JSImport("rxjs/internal/util/UnsubscriptionError", "UnsubscriptionError")
    @js.native
    val ^ : UnsubscriptionErrorCtor = js.native
    
    @scala.inline
    implicit class UnsubscriptionErrorMutableBuilder[Self <: UnsubscriptionError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/util/UnsubscriptionError", "UnsubscriptionError")
  @js.native
  class UnsubscriptionErrorCls protected () extends UnsubscriptionError {
    def this(errors: js.Array[_]) = this()
  }
  
  @js.native
  trait UnsubscriptionErrorCtor
    extends Instantiable1[/* errors */ js.Array[js.Any], UnsubscriptionError]
}
