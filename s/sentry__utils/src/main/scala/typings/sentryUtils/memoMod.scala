package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoMod {
  
  @JSImport("@sentry/utils/dist/memo", "Memo")
  @js.native
  class Memo () extends StObject {
    
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
