package typings.puppeteer.anon

import typings.puppeteer.mod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefererTimeoutWaitUntil extends StObject {
  
  var referer: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitUntil: js.UndefOr[PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]] = js.undefined
}
object RefererTimeoutWaitUntil {
  
  inline def apply(): RefererTimeoutWaitUntil = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefererTimeoutWaitUntil]
  }
  
  extension [Self <: RefererTimeoutWaitUntil](x: Self) {
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitUntil(value: PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
    
    inline def setWaitUntilVarargs(value: PuppeteerLifeCycleEvent*): Self = StObject.set(x, "waitUntil", js.Array(value*))
  }
}
