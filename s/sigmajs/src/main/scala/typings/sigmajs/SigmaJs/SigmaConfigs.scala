package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigmaConfigs extends StObject {
  
  var container: js.UndefOr[Element] = js.undefined
  
  var graph: js.UndefOr[GraphData] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var renderers: js.UndefOr[js.Array[Renderer]] = js.undefined
  
  var settings: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object SigmaConfigs {
  
  inline def apply(): SigmaConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigmaConfigs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SigmaConfigs] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setGraph(value: GraphData): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRenderers(value: js.Array[Renderer]): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
    
    inline def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
    
    inline def setRenderersVarargs(value: Renderer*): Self = StObject.set(x, "renderers", js.Array(value*))
    
    inline def setSettings(value: StringDictionary[Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
