package typings.puppeteer.anon

import typings.puppeteer.lifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer.puppeteer/lib/cjs/puppeteer/api/Page.WaitForOptions & {  referer :string | undefined} */
trait WaitForOptionsrefererstri extends StObject {
  
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
object WaitForOptionsrefererstri {
  
  inline def apply(): WaitForOptionsrefererstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForOptionsrefererstri]
  }
  
  extension [Self <: WaitForOptionsrefererstri](x: Self) {
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitUntil(value: PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
    
    inline def setWaitUntilVarargs(value: PuppeteerLifeCycleEvent*): Self = StObject.set(x, "waitUntil", js.Array(value*))
  }
}
