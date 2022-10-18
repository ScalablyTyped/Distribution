package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.libTypescriptSrcCommonActionsMod.Action
import typings.reactNavigationRouters.libTypescriptSrcCommonActionsMod.ResetState
import typings.reactNavigationRouters.reactNavigationRoutersStrings.RESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target
  extends StObject
     with Action {
  
  var payload: js.UndefOr[ResetState] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: RESET
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RESET")
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setPayload(value: ResetState): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: RESET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
