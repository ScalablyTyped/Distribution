package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Production extends StObject {
  
  var production: js.UndefOr[Boolean] = js.undefined
}
object Production {
  
  inline def apply(): Production = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Production]
  }
  
  extension [Self <: Production](x: Self) {
    
    inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
  }
}
