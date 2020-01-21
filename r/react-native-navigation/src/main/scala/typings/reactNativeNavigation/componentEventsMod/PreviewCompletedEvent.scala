package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewCompletedEvent extends ComponentEvent {
  var componentName: js.UndefOr[String] = js.undefined
  var previewComponentId: js.UndefOr[String] = js.undefined
}

object PreviewCompletedEvent {
  @scala.inline
  def apply(componentId: String, componentName: String = null, previewComponentId: String = null): PreviewCompletedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
    if (componentName != null) __obj.updateDynamic("componentName")(componentName.asInstanceOf[js.Any])
    if (previewComponentId != null) __obj.updateDynamic("previewComponentId")(previewComponentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewCompletedEvent]
  }
}

