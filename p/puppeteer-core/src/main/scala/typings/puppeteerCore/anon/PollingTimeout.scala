package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollingTimeout extends StObject {
  
  var polling: js.UndefOr[String | Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PollingTimeout {
  
  @scala.inline
  def apply(): PollingTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollingTimeout]
  }
  
  @scala.inline
  implicit class PollingTimeoutMutableBuilder[Self <: PollingTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolling(value: String | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
