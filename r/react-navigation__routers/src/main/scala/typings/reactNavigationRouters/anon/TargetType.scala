package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.reactNavigationRoutersStrings.PUSH
import typings.reactNavigationRouters.stackRouterMod.StackActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetType
  extends StObject
     with StackActionType {
  
  var payload: Name
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: PUSH
}
object TargetType {
  
  @scala.inline
  def apply(payload: Name): TargetType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PUSH")
    __obj.asInstanceOf[TargetType]
  }
  
  @scala.inline
  implicit class TargetTypeMutableBuilder[Self <: TargetType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Name): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: PUSH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
