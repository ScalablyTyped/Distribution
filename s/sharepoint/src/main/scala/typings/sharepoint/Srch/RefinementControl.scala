package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinementControl extends js.Object {
  
  var alternateRenderContext: js.Any = js.native
  
  var alternateRenderer: js.Any = js.native
  
  var containerId: String = js.native
  
  var countDisplay: String = js.native
  
  var deepHits: Double = js.native
  
  var overrideDisplayName: String = js.native
  
  var propertyName: String = js.native
  
  var renderTemplateId: String = js.native
  
  var spec: String = js.native
  
  var useDefaultDateIntervals: Boolean = js.native
}
object RefinementControl {
  
  @scala.inline
  def apply(
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    containerId: String,
    countDisplay: String,
    deepHits: Double,
    overrideDisplayName: String,
    propertyName: String,
    renderTemplateId: String,
    spec: String,
    useDefaultDateIntervals: Boolean
  ): RefinementControl = {
    val __obj = js.Dynamic.literal(alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], countDisplay = countDisplay.asInstanceOf[js.Any], deepHits = deepHits.asInstanceOf[js.Any], overrideDisplayName = overrideDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], renderTemplateId = renderTemplateId.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], useDefaultDateIntervals = useDefaultDateIntervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementControl]
  }
  
  @scala.inline
  implicit class RefinementControlOps[Self <: RefinementControl] (val x: Self) extends AnyVal {
    
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
    def setAlternateRenderContext(value: js.Any): Self = this.set("alternateRenderContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateRenderer(value: js.Any): Self = this.set("alternateRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountDisplay(value: String): Self = this.set("countDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepHits(value: Double): Self = this.set("deepHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideDisplayName(value: String): Self = this.set("overrideDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTemplateId(value: String): Self = this.set("renderTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: String): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultDateIntervals(value: Boolean): Self = this.set("useDefaultDateIntervals", value.asInstanceOf[js.Any])
  }
}
