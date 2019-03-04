package typings
package reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewCompletedEvent extends ComponentEvent {
  var componentName: js.UndefOr[java.lang.String] = js.undefined
  var previewComponentId: js.UndefOr[java.lang.String] = js.undefined
}

object PreviewCompletedEvent {
  @scala.inline
  def apply(
    componentId: java.lang.String,
    componentName: java.lang.String = null,
    previewComponentId: java.lang.String = null
  ): PreviewCompletedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId)
    if (componentName != null) __obj.updateDynamic("componentName")(componentName)
    if (previewComponentId != null) __obj.updateDynamic("previewComponentId")(previewComponentId)
    __obj.asInstanceOf[PreviewCompletedEvent]
  }
}

