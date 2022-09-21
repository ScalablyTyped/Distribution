package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSRRefinementControl
  extends StObject
     with RefinementControl {
  
  var csr_displayTitle: String
  
  var csr_filters: js.Array[CSRFilter]
  
  var csr_isExpanded: String
  
  var csr_propertyName: String
  
  var csr_renderEmptyContainer: Boolean
  
  var csr_showCounts: Boolean
  
  var csr_useContains: Boolean
  
  var csr_useKQL: Boolean
}
object CSRRefinementControl {
  
  inline def apply(
    alternateRenderContext: Any,
    alternateRenderer: Any,
    containerId: String,
    countDisplay: String,
    csr_displayTitle: String,
    csr_filters: js.Array[CSRFilter],
    csr_isExpanded: String,
    csr_propertyName: String,
    csr_renderEmptyContainer: Boolean,
    csr_showCounts: Boolean,
    csr_useContains: Boolean,
    csr_useKQL: Boolean,
    deepHits: Double,
    overrideDisplayName: String,
    propertyName: String,
    renderTemplateId: String,
    spec: String,
    useDefaultDateIntervals: Boolean
  ): CSRRefinementControl = {
    val __obj = js.Dynamic.literal(alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], countDisplay = countDisplay.asInstanceOf[js.Any], csr_displayTitle = csr_displayTitle.asInstanceOf[js.Any], csr_filters = csr_filters.asInstanceOf[js.Any], csr_isExpanded = csr_isExpanded.asInstanceOf[js.Any], csr_propertyName = csr_propertyName.asInstanceOf[js.Any], csr_renderEmptyContainer = csr_renderEmptyContainer.asInstanceOf[js.Any], csr_showCounts = csr_showCounts.asInstanceOf[js.Any], csr_useContains = csr_useContains.asInstanceOf[js.Any], csr_useKQL = csr_useKQL.asInstanceOf[js.Any], deepHits = deepHits.asInstanceOf[js.Any], overrideDisplayName = overrideDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], renderTemplateId = renderTemplateId.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], useDefaultDateIntervals = useDefaultDateIntervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRRefinementControl]
  }
  
  extension [Self <: CSRRefinementControl](x: Self) {
    
    inline def setCsr_displayTitle(value: String): Self = StObject.set(x, "csr_displayTitle", value.asInstanceOf[js.Any])
    
    inline def setCsr_filters(value: js.Array[CSRFilter]): Self = StObject.set(x, "csr_filters", value.asInstanceOf[js.Any])
    
    inline def setCsr_filtersVarargs(value: CSRFilter*): Self = StObject.set(x, "csr_filters", js.Array(value*))
    
    inline def setCsr_isExpanded(value: String): Self = StObject.set(x, "csr_isExpanded", value.asInstanceOf[js.Any])
    
    inline def setCsr_propertyName(value: String): Self = StObject.set(x, "csr_propertyName", value.asInstanceOf[js.Any])
    
    inline def setCsr_renderEmptyContainer(value: Boolean): Self = StObject.set(x, "csr_renderEmptyContainer", value.asInstanceOf[js.Any])
    
    inline def setCsr_showCounts(value: Boolean): Self = StObject.set(x, "csr_showCounts", value.asInstanceOf[js.Any])
    
    inline def setCsr_useContains(value: Boolean): Self = StObject.set(x, "csr_useContains", value.asInstanceOf[js.Any])
    
    inline def setCsr_useKQL(value: Boolean): Self = StObject.set(x, "csr_useKQL", value.asInstanceOf[js.Any])
  }
}
