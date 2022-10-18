package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackActionType
import typings.reactNavigationRouters.reactNavigationRoutersStrings.PUSH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetType
  extends StObject
     with StackActionType {
  
  var payload: NameParams
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: PUSH
}
object TargetType {
  
  inline def apply(payload: NameParams): TargetType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PUSH")
    __obj.asInstanceOf[TargetType]
  }
  
  extension [Self <: TargetType](x: Self) {
    
    inline def setPayload(value: NameParams): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: PUSH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
