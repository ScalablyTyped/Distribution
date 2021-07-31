package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.reactNavigationRoutersStrings.POP_TO_TOP
import typings.reactNavigationRouters.stackRouterMod.StackActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTargetType
  extends StObject
     with StackActionType {
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: POP_TO_TOP
}
object SourceTargetType {
  
  @scala.inline
  def apply(): SourceTargetType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("POP_TO_TOP")
    __obj.asInstanceOf[SourceTargetType]
  }
  
  @scala.inline
  implicit class SourceTargetTypeMutableBuilder[Self <: SourceTargetType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: POP_TO_TOP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
