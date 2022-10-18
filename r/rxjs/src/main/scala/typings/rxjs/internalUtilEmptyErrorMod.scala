package typings.rxjs

import typings.rxjs.distTypesInternalUtilEmptyErrorMod.EmptyErrorCtor
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilEmptyErrorMod {
  
  @JSImport("rxjs/internal/util/EmptyError", "EmptyError")
  @js.native
  val EmptyError: EmptyErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/util/EmptyError", "EmptyError")
  @js.native
  /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  open class EmptyErrorCls ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
