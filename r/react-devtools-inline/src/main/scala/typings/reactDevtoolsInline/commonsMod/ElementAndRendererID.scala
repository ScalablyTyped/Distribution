package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAndRendererID extends StObject {
  
  var id: Double
  
  var rendererID: RendererID
}
object ElementAndRendererID {
  
  inline def apply(id: Double, rendererID: RendererID): ElementAndRendererID = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAndRendererID]
  }
  
  extension [Self <: ElementAndRendererID](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRendererID(value: RendererID): Self = StObject.set(x, "rendererID", value.asInstanceOf[js.Any])
  }
}
