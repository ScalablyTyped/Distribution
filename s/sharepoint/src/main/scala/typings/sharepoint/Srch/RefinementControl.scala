package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinementControl extends StObject {
  
  var alternateRenderContext: Any
  
  var alternateRenderer: Any
  
  var containerId: String
  
  var countDisplay: String
  
  var deepHits: Double
  
  var overrideDisplayName: String
  
  var propertyName: String
  
  var renderTemplateId: String
  
  var spec: String
  
  var useDefaultDateIntervals: Boolean
}
object RefinementControl {
  
  inline def apply(
    alternateRenderContext: Any,
    alternateRenderer: Any,
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
  
  extension [Self <: RefinementControl](x: Self) {
    
    inline def setAlternateRenderContext(value: Any): Self = StObject.set(x, "alternateRenderContext", value.asInstanceOf[js.Any])
    
    inline def setAlternateRenderer(value: Any): Self = StObject.set(x, "alternateRenderer", value.asInstanceOf[js.Any])
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setCountDisplay(value: String): Self = StObject.set(x, "countDisplay", value.asInstanceOf[js.Any])
    
    inline def setDeepHits(value: Double): Self = StObject.set(x, "deepHits", value.asInstanceOf[js.Any])
    
    inline def setOverrideDisplayName(value: String): Self = StObject.set(x, "overrideDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setRenderTemplateId(value: String): Self = StObject.set(x, "renderTemplateId", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultDateIntervals(value: Boolean): Self = StObject.set(x, "useDefaultDateIntervals", value.asInstanceOf[js.Any])
  }
}
