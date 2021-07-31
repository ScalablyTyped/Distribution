package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hidden extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var polling: js.UndefOr[String | Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Hidden {
  
  @scala.inline
  def apply(): Hidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hidden]
  }
  
  @scala.inline
  implicit class HiddenMutableBuilder[Self <: Hidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setPolling(value: String | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
