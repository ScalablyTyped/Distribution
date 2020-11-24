package typings.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("redux", JSImport.Namespace)
@js.native
object reduxAugmentingMod extends js.Object {
  
  /*
    * Overload to add api middleware support to Redux's dispatch() function.
    * Useful for react-redux or any other library which could use this type.
    */
  @js.native
  trait Dispatch extends js.Object {
    
    // `Promise<undefined> is returned in case of RSAA validation errors or user bails out
    def apply(action: RSAAAction[_, _, _]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  }
}
