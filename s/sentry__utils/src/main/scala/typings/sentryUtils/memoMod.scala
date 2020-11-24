package typings.sentryUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/memo", JSImport.Namespace)
@js.native
object memoMod extends js.Object {
  
  @js.native
  class Memo () extends js.Object {
    
    /** Determines if WeakSet is available */
    val _hasWeakSet: js.Any = js.native
    
    /** Either WeakSet or Array */
    val _inner: js.Any = js.native
    
    /**
      * Sets obj to remember.
      * @param obj Object to remember
      */
    def memoize(obj: js.Any): Boolean = js.native
    
    /**
      * Removes object from internal storage.
      * @param obj Object to forget
      */
    def unmemoize(obj: js.Any): Unit = js.native
  }
}
