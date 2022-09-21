package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeCanceled extends StObject {
  
  var includeCanceled: js.UndefOr[Boolean] = js.undefined
  
  var includePending: js.UndefOr[Boolean] = js.undefined
}
object IncludeCanceled {
  
  inline def apply(): IncludeCanceled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeCanceled]
  }
  
  extension [Self <: IncludeCanceled](x: Self) {
    
    inline def setIncludeCanceled(value: Boolean): Self = StObject.set(x, "includeCanceled", value.asInstanceOf[js.Any])
    
    inline def setIncludeCanceledUndefined: Self = StObject.set(x, "includeCanceled", js.undefined)
    
    inline def setIncludePending(value: Boolean): Self = StObject.set(x, "includePending", value.asInstanceOf[js.Any])
    
    inline def setIncludePendingUndefined: Self = StObject.set(x, "includePending", js.undefined)
  }
}
