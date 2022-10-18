package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFullScan extends StObject {
  
  var isFullScan: Boolean
}
object IsFullScan {
  
  inline def apply(isFullScan: Boolean): IsFullScan = {
    val __obj = js.Dynamic.literal(isFullScan = isFullScan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFullScan]
  }
  
  extension [Self <: IsFullScan](x: Self) {
    
    inline def setIsFullScan(value: Boolean): Self = StObject.set(x, "isFullScan", value.asInstanceOf[js.Any])
  }
}
