package typings.rxjs

import typings.rxjs.distTypesInternalUtilSequenceErrorMod.SequenceErrorCtor
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilSequenceErrorMod {
  
  @JSImport("rxjs/internal/util/SequenceError", "SequenceError")
  @js.native
  val SequenceError: SequenceErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/util/SequenceError", "SequenceError")
  @js.native
  open class SequenceErrorCls protected ()
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
}
