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
    
    val errors: js.Array[Any]
  }
  object UnsubscriptionError {
    
    @JSImport("rxjs/dist/types/internal/util/UnsubscriptionError", "UnsubscriptionError")
    @js.native
    val ^ : UnsubscriptionErrorCtor = js.native
    
    extension [Self <: UnsubscriptionError](x: Self) {
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/dist/types/internal/util/UnsubscriptionError", "UnsubscriptionError")
  @js.native
  open class UnsubscriptionErrorCls protected ()
    extends StObject
       with UnsubscriptionError {
    /**
      * @deprecated Internal implementation detail. Do not construct error instances.
      * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
      */
    def this(errors: js.Array[Any]) = this()
    
    /* CompleteClass */
    override val errors: js.Array[Any] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait UnsubscriptionErrorCtor
    extends StObject
       with /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  Instantiable1[/* errors */ js.Array[Any], UnsubscriptionError]
}
