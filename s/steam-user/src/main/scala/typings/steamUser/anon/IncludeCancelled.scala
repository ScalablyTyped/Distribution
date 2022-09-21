package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeCancelled extends StObject {
  
  var includeCancelled: js.UndefOr[Boolean] = js.undefined
}
object IncludeCancelled {
  
  inline def apply(): IncludeCancelled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeCancelled]
  }
  
  extension [Self <: IncludeCancelled](x: Self) {
    
    inline def setIncludeCancelled(value: Boolean): Self = StObject.set(x, "includeCancelled", value.asInstanceOf[js.Any])
    
    inline def setIncludeCancelledUndefined: Self = StObject.set(x, "includeCancelled", js.undefined)
  }
}
