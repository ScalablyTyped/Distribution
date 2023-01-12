package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitTimeoutOptions extends StObject {
  
  /**
    * Maximum wait time in milliseconds. Pass 0 to disable the timeout.
    *
    * The default value can be changed by using the
    * {@link Page.setDefaultTimeout} method.
    *
    * @defaultValue `30000`
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object WaitTimeoutOptions {
  
  inline def apply(): WaitTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitTimeoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitTimeoutOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
