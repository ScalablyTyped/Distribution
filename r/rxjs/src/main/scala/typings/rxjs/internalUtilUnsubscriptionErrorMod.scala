package typings.rxjs

import typings.rxjs.distTypesInternalUtilUnsubscriptionErrorMod.UnsubscriptionErrorCtor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilUnsubscriptionErrorMod {
  
  @JSImport("rxjs/internal/util/UnsubscriptionError", "UnsubscriptionError")
  @js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/util/UnsubscriptionError", "UnsubscriptionError")
  @js.native
  open class UnsubscriptionErrorCls protected ()
    extends StObject
       with typings.rxjs.distTypesInternalUtilUnsubscriptionErrorMod.UnsubscriptionError {
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
}
