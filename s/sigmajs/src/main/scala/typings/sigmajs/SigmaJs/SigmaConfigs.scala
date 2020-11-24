package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigmaConfigs extends js.Object {
  
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
  implicit class SigmaConfigsOps[Self <: SigmaConfigs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setGraph(value: GraphData): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRenderersVarargs(value: Renderer*): Self = this.set("renderers", js.Array(value :_*))
    
    @scala.inline
    def setRenderers(value: js.Array[Renderer]): Self = this.set("renderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderers: Self = this.set("renderers", js.undefined)
    
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
