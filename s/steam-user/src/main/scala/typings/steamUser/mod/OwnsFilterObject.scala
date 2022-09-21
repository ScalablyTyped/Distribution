package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnsFilterObject extends StObject {
  
  var excludeExpiring: js.UndefOr[Boolean] = js.undefined
  
  var excludeFree: js.UndefOr[Boolean] = js.undefined
  
  var excludeShared: js.UndefOr[Boolean] = js.undefined
}
object OwnsFilterObject {
  
  inline def apply(): OwnsFilterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnsFilterObject]
  }
  
  extension [Self <: OwnsFilterObject](x: Self) {
    
    inline def setExcludeExpiring(value: Boolean): Self = StObject.set(x, "excludeExpiring", value.asInstanceOf[js.Any])
    
    inline def setExcludeExpiringUndefined: Self = StObject.set(x, "excludeExpiring", js.undefined)
    
    inline def setExcludeFree(value: Boolean): Self = StObject.set(x, "excludeFree", value.asInstanceOf[js.Any])
    
    inline def setExcludeFreeUndefined: Self = StObject.set(x, "excludeFree", js.undefined)
    
    inline def setExcludeShared(value: Boolean): Self = StObject.set(x, "excludeShared", value.asInstanceOf[js.Any])
    
    inline def setExcludeSharedUndefined: Self = StObject.set(x, "excludeShared", js.undefined)
  }
}
