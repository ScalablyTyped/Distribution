package typings.rxjs

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsubscriptionErrorMod {
  
  trait UnsubscriptionError
    extends StObject
       with Error {
    
    val errors: js.Array[js.Any]
  }
  object UnsubscriptionError {
    
    @JSImport("rxjs/internal/util/UnsubscriptionError", "UnsubscriptionError")
    @js.native
    val ^ : UnsubscriptionErrorCtor = js.native
    
    @scala.inline
    implicit class UnsubscriptionErrorMutableBuilder[Self <: UnsubscriptionError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[js.Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/util/UnsubscriptionError", "UnsubscriptionError")
  @js.native
  class UnsubscriptionErrorCls protected ()
    extends StObject
       with UnsubscriptionError {
    def this(errors: js.Array[js.Any]) = this()
    
    /* CompleteClass */
    override val errors: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait UnsubscriptionErrorCtor
    extends StObject
       with Instantiable1[/* errors */ js.Array[js.Any], UnsubscriptionError]
}
