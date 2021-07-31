package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.reactNavigationRoutersStrings.RESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadSourceTargetType extends StObject {
  
  var payload: js.UndefOr[
    Readonlykeystringindexnum | PartialStateReadonlykeyst | PickReadonlykeystringinde
  ] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: RESET
}
object PayloadSourceTargetType {
  
  @scala.inline
  def apply(): PayloadSourceTargetType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RESET")
    __obj.asInstanceOf[PayloadSourceTargetType]
  }
  
  @scala.inline
  implicit class PayloadSourceTargetTypeMutableBuilder[Self <: PayloadSourceTargetType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Readonlykeystringindexnum | PartialStateReadonlykeyst | PickReadonlykeystringinde): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: RESET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
