package typings.rxjs

import org.scalablytyped.runtime.Instantiable0
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentOutOfRangeErrorMod {
  
  @JSImport("rxjs/dist/types/internal/util/ArgumentOutOfRangeError", "ArgumentOutOfRangeError")
  @js.native
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  type ArgumentOutOfRangeError = js.Error
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/dist/types/internal/util/ArgumentOutOfRangeError", "ArgumentOutOfRangeError")
  @js.native
  /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  open class ArgumentOutOfRangeErrorCls ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait ArgumentOutOfRangeErrorCtor
    extends StObject
       with /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  Instantiable0[js.Error]
}
