package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortController extends StObject {
  
  /**
    * Abort and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit
  
  /**
    * Returns the `AbortSignal` object associated with this object.
    */
  val signal: AbortSignal
}
object AbortController {
  
  inline def apply(abort: () => Unit, signal: AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  
  extension [Self <: AbortController](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
