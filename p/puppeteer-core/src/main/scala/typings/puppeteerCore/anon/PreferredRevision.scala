package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferredRevision extends StObject {
  
  var preferredRevision: String
  
  var slowMo: Double
  
  var timeout: Double
}
object PreferredRevision {
  
  inline def apply(preferredRevision: String, slowMo: Double, timeout: Double): PreferredRevision = {
    val __obj = js.Dynamic.literal(preferredRevision = preferredRevision.asInstanceOf[js.Any], slowMo = slowMo.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredRevision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreferredRevision] (val x: Self) extends AnyVal {
    
    inline def setPreferredRevision(value: String): Self = StObject.set(x, "preferredRevision", value.asInstanceOf[js.Any])
    
    inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
