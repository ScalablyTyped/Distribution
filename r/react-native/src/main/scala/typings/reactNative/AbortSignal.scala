package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortSignal extends StObject {
  
  /**
    * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean
  
  def onabort(event: AbortEvent): Unit
}
object AbortSignal {
  
  inline def apply(aborted: Boolean, onabort: AbortEvent => Unit): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort))
    __obj.asInstanceOf[AbortSignal]
  }
  
  extension [Self <: AbortSignal](x: Self) {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setOnabort(value: AbortEvent => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
  }
}
