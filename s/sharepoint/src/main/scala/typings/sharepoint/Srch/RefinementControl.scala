package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementControl extends js.Object {
  var alternateRenderContext: js.Any
  var alternateRenderer: js.Any
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
}

