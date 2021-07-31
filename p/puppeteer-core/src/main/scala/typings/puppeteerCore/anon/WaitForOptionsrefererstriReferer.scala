package typings.puppeteerCore.anon

import typings.puppeteerCore.commonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/Page.WaitForOptions & {  referer :string | undefined} */
trait WaitForOptionsrefererstriReferer extends StObject {
  
  var referer: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum wait time in milliseconds, defaults to 30 seconds, pass `0` to
    * disable the timeout.
    *
    * @remarks
    * The default value can be changed by using the
    * {@link Page.setDefaultTimeout} or {@link Page.setDefaultNavigationTimeout}
    * methods.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitUntil: js.UndefOr[PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]] = js.undefined
}
object WaitForOptionsrefererstriReferer {
  
  @scala.inline
  def apply(): WaitForOptionsrefererstriReferer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForOptionsrefererstriReferer]
  }
  
  @scala.inline
  implicit class WaitForOptionsrefererstriRefererMutableBuilder[Self <: WaitForOptionsrefererstriReferer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWaitUntil(value: PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
    
    @scala.inline
    def setWaitUntilVarargs(value: PuppeteerLifeCycleEvent*): Self = StObject.set(x, "waitUntil", js.Array(value :_*))
  }
}
