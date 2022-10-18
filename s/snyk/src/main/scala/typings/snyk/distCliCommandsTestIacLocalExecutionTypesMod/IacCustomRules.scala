package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacCustomRules extends StObject {
  
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  var ociRegistryTag: js.UndefOr[String] = js.undefined
  
  var ociRegistryURL: js.UndefOr[String] = js.undefined
}
object IacCustomRules {
  
  inline def apply(): IacCustomRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IacCustomRules]
  }
  
  extension [Self <: IacCustomRules](x: Self) {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setOciRegistryTag(value: String): Self = StObject.set(x, "ociRegistryTag", value.asInstanceOf[js.Any])
    
    inline def setOciRegistryTagUndefined: Self = StObject.set(x, "ociRegistryTag", js.undefined)
    
    inline def setOciRegistryURL(value: String): Self = StObject.set(x, "ociRegistryURL", value.asInstanceOf[js.Any])
    
    inline def setOciRegistryURLUndefined: Self = StObject.set(x, "ociRegistryURL", js.undefined)
  }
}
