package typings.puppeteerCore.anon

import typings.puppeteerCore.commonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutWaitUntil extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitUntil: js.UndefOr[PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]] = js.undefined
}
object TimeoutWaitUntil {
  
  @scala.inline
  def apply(): TimeoutWaitUntil = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutWaitUntil]
  }
  
  @scala.inline
  implicit class TimeoutWaitUntilMutableBuilder[Self <: TimeoutWaitUntil] (val x: Self) extends AnyVal {
    
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
