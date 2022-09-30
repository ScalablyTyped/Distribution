package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectElementParams
  extends StObject
     with ElementAndRendererID {
  
  var forceFullData: Boolean
  
  var path: (js.Array[Double | String]) | Null
  
  var requestID: Double
}
object InspectElementParams {
  
  inline def apply(forceFullData: Boolean, id: Double, rendererID: RendererID, requestID: Double): InspectElementParams = {
    val __obj = js.Dynamic.literal(forceFullData = forceFullData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any], requestID = requestID.asInstanceOf[js.Any], path = null)
    __obj.asInstanceOf[InspectElementParams]
  }
  
  extension [Self <: InspectElementParams](x: Self) {
    
    inline def setForceFullData(value: Boolean): Self = StObject.set(x, "forceFullData", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Double | String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathVarargs(value: (Double | String)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRequestID(value: Double): Self = StObject.set(x, "requestID", value.asInstanceOf[js.Any])
  }
}
