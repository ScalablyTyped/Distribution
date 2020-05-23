package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSRRefinementControl extends RefinementControl {
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
  @scala.inline
  def apply(
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
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
}

