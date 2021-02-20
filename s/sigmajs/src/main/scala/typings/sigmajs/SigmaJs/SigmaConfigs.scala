package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigmaConfigs extends StObject {
  
  var container: js.UndefOr[Element] = js.native
  
  var graph: js.UndefOr[GraphData] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var renderers: js.UndefOr[js.Array[Renderer]] = js.native
  
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SigmaConfigs {
  
  @scala.inline
  def apply(): SigmaConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigmaConfigs]
  }
  
  @scala.inline
  implicit class SigmaConfigsMutableBuilder[Self <: SigmaConfigs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setGraph(value: GraphData): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRenderers(value: js.Array[Renderer]): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
    
    @scala.inline
    def setRenderersVarargs(value: Renderer*): Self = StObject.set(x, "renderers", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
