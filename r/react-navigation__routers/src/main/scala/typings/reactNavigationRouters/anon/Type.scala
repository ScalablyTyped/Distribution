package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.libTypescriptSrcCommonActionsMod.Action
import typings.reactNavigationRouters.reactNavigationRoutersStrings.SET_PARAMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with Action {
  
  var payload: Params
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: SET_PARAMS
}
object Type {
  
  inline def apply(payload: Params): Type = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_PARAMS")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setPayload(value: Params): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: SET_PARAMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
