package typings.puppeteerCore.anon

import typings.puppeteerCore.commonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer-core.puppeteer-core/lib/esm/puppeteer/api/Page.WaitForOptions & {  referer :string | undefined} */
trait WaitForOptionsrefererstriReferer extends StObject {
  
  var referer: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum wait time in milliseconds. Pass 0 to disable the timeout.
    *
    * The default value can be changed by using the
    * {@link Page.setDefaultTimeout} or {@link Page.setDefaultNavigationTimeout}
    * methods.
    *
    * @defaultValue `30000`
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitUntil: js.UndefOr[PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]] = js.undefined
}
object WaitForOptionsrefererstriReferer {
  
  inline def apply(): WaitForOptionsrefererstriReferer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForOptionsrefererstriReferer]
  }
  
  extension [Self <: WaitForOptionsrefererstriReferer](x: Self) {
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitUntil(value: PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
    
    inline def setWaitUntilVarargs(value: PuppeteerLifeCycleEvent*): Self = StObject.set(x, "waitUntil", js.Array(value*))
  }
}
