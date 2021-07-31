package typings.rxjs

import org.scalablytyped.runtime.Instantiable0
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeoutErrorMod {
  
  @JSImport("rxjs/internal/util/TimeoutError", "TimeoutError")
  @js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  type TimeoutError = Error
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/util/TimeoutError", "TimeoutError")
  @js.native
  class TimeoutErrorCls ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait TimeoutErrorCtor
    extends StObject
       with Instantiable0[typings.rxjs.timeoutErrorMod.TimeoutError]
}
