package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.mutation
import typings.puppeteer.puppeteerStrings.raf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameWaitForFunctionOptions extends StObject {
  
  /**
    * An interval at which the `pageFunction` is executed, defaults to `raf`. If
    * `polling` is a number, then it is treated as an interval in milliseconds at
    * which the function would be executed. If `polling` is a string, then it can
    * be one of the following values:
    *
    * - `raf` - to constantly execute `pageFunction` in `requestAnimationFrame`
    *   callback. This is the tightest polling mode which is suitable to observe
    *   styling changes.
    *
    * - `mutation` - to execute `pageFunction` on every DOM mutation.
    */
  var polling: js.UndefOr[raf | mutation | Double] = js.undefined
  
  /**
    * Maximum time to wait in milliseconds. Defaults to `30000` (30 seconds).
    * Pass `0` to disable the timeout. Puppeteer's default timeout can be changed
    * using {@link Page.setDefaultTimeout}.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object FrameWaitForFunctionOptions {
  
  inline def apply(): FrameWaitForFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameWaitForFunctionOptions]
  }
  
  extension [Self <: FrameWaitForFunctionOptions](x: Self) {
    
    inline def setPolling(value: raf | mutation | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
