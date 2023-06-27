package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDomFrameData extends StObject {
  
  var node: js.UndefOr[Attributes] = js.undefined
  
  var nodeId: js.UndefOr[Double] = js.undefined
}
object BaseDomFrameData {
  
  inline def apply(): BaseDomFrameData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseDomFrameData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseDomFrameData] (val x: Self) extends AnyVal {
    
    inline def setNode(value: Attributes): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
