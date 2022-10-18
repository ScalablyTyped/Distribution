package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.libCapabilitiesMod.Capabilities
import typings.seleniumWebdriver.mod.CreateSessionCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desired
  extends StObject
     with CreateSessionCapabilities {
  
  var desired: js.UndefOr[Capabilities] = js.undefined
  
  var required: js.UndefOr[Capabilities] = js.undefined
}
object Desired {
  
  inline def apply(): Desired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desired]
  }
  
  extension [Self <: Desired](x: Self) {
    
    inline def setDesired(value: Capabilities): Self = StObject.set(x, "desired", value.asInstanceOf[js.Any])
    
    inline def setDesiredUndefined: Self = StObject.set(x, "desired", js.undefined)
    
    inline def setRequired(value: Capabilities): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
