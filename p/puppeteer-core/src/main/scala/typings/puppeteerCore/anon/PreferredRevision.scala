package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferredRevision extends StObject {
  
  var preferredRevision: String
  
  var slowMo: Double
  
  var timeout: Double
  
  var usePipe: js.UndefOr[Boolean] = js.undefined
}
object PreferredRevision {
  
  @scala.inline
  def apply(preferredRevision: String, slowMo: Double, timeout: Double): PreferredRevision = {
    val __obj = js.Dynamic.literal(preferredRevision = preferredRevision.asInstanceOf[js.Any], slowMo = slowMo.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredRevision]
  }
  
  @scala.inline
  implicit class PreferredRevisionMutableBuilder[Self <: PreferredRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferredRevision(value: String): Self = StObject.set(x, "preferredRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePipe(value: Boolean): Self = StObject.set(x, "usePipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePipeUndefined: Self = StObject.set(x, "usePipe", js.undefined)
  }
}
