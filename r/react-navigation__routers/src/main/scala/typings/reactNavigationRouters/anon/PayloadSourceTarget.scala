package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackActionType
import typings.reactNavigationRouters.reactNavigationRoutersStrings.POP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadSourceTarget
  extends StObject
     with StackActionType {
  
  var payload: Count
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: POP
}
object PayloadSourceTarget {
  
  inline def apply(payload: Count): PayloadSourceTarget = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("POP")
    __obj.asInstanceOf[PayloadSourceTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayloadSourceTarget] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Count): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: POP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
