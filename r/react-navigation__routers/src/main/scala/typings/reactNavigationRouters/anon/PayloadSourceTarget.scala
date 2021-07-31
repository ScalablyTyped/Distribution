package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.reactNavigationRoutersStrings.POP
import typings.reactNavigationRouters.stackRouterMod.StackActionType
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
  
  @scala.inline
  def apply(payload: Count): PayloadSourceTarget = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("POP")
    __obj.asInstanceOf[PayloadSourceTarget]
  }
  
  @scala.inline
  implicit class PayloadSourceTargetMutableBuilder[Self <: PayloadSourceTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Count): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: POP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
