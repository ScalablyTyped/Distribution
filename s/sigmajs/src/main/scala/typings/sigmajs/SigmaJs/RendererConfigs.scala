package typings.sigmajs.SigmaJs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererConfigs extends StObject {
  
  var container: js.UndefOr[Element] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object RendererConfigs {
  
  inline def apply(): RendererConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererConfigs]
  }
  
  extension [Self <: RendererConfigs](x: Self) {
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
