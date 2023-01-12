package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitForTargetOptions extends StObject {
  
  /**
    * Maximum wait time in milliseconds. Pass `0` to disable the timeout.
    * @defaultValue 30 seconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object WaitForTargetOptions {
  
  inline def apply(): WaitForTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForTargetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitForTargetOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
