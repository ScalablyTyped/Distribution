package typings.rxjs

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notFoundErrorMod {
  
  @JSImport("rxjs/dist/types/internal/util/NotFoundError", "NotFoundError")
  @js.native
  val NotFoundError: NotFoundErrorCtor = js.native
  type NotFoundError = js.Error
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/dist/types/internal/util/NotFoundError", "NotFoundError")
  @js.native
  open class NotFoundErrorCls protected ()
    extends StObject
       with Error {
    /**
      * @deprecated Internal implementation detail. Do not construct error instances.
      * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
      */
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait NotFoundErrorCtor
    extends StObject
       with /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  Instantiable1[/* message */ String, js.Error]
}
