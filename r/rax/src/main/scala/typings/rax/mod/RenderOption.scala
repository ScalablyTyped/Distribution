package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOption extends StObject {
  
  var driver: Any
  
  var hydrate: js.UndefOr[Boolean] = js.undefined
}
object RenderOption {
  
  inline def apply(driver: Any): RenderOption = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOption]
  }
  
  extension [Self <: RenderOption](x: Self) {
    
    inline def setDriver(value: Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
    
    inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
  }
}
