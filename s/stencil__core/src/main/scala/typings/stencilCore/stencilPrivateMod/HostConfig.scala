package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Rules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostConfig extends StObject {
  
  var hosting: js.UndefOr[Rules] = js.undefined
}
object HostConfig {
  
  inline def apply(): HostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostConfig]
  }
  
  extension [Self <: HostConfig](x: Self) {
    
    inline def setHosting(value: Rules): Self = StObject.set(x, "hosting", value.asInstanceOf[js.Any])
    
    inline def setHostingUndefined: Self = StObject.set(x, "hosting", js.undefined)
  }
}
