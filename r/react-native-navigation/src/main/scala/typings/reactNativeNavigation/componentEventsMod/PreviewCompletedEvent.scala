package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewCompletedEvent extends ComponentEvent {
  
  var componentName: js.UndefOr[String] = js.native
  
  var previewComponentId: js.UndefOr[String] = js.native
}
object PreviewCompletedEvent {
  
  @scala.inline
  def apply(componentId: String): PreviewCompletedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewCompletedEvent]
  }
  
  @scala.inline
  implicit class PreviewCompletedEventOps[Self <: PreviewCompletedEvent] (val x: Self) extends AnyVal {
    
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
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentName: Self = this.set("componentName", js.undefined)
    
    @scala.inline
    def setPreviewComponentId(value: String): Self = this.set("previewComponentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewComponentId: Self = this.set("previewComponentId", js.undefined)
  }
}
