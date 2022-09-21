package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlowMo extends StObject {
  
  var preferredRevision: String
  
  var slowMo: Double
  
  var timeout: Double
  
  var usePipe: js.UndefOr[Boolean] = js.undefined
}
object SlowMo {
  
  inline def apply(preferredRevision: String, slowMo: Double, timeout: Double): SlowMo = {
    val __obj = js.Dynamic.literal(preferredRevision = preferredRevision.asInstanceOf[js.Any], slowMo = slowMo.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlowMo]
  }
  
  extension [Self <: SlowMo](x: Self) {
    
    inline def setPreferredRevision(value: String): Self = StObject.set(x, "preferredRevision", value.asInstanceOf[js.Any])
    
    inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUsePipe(value: Boolean): Self = StObject.set(x, "usePipe", value.asInstanceOf[js.Any])
    
    inline def setUsePipeUndefined: Self = StObject.set(x, "usePipe", js.undefined)
  }
}
