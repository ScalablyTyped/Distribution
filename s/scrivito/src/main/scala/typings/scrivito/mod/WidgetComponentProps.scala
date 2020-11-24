package typings.scrivito.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * scrivito top-level definitions
  */
@js.native
trait WidgetComponentProps
  extends /* key */ StringDictionary[js.Any] {
  
  var widget: Widget = js.native
}
object WidgetComponentProps {
  
  @scala.inline
  def apply(widget: Widget): WidgetComponentProps = {
    val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetComponentProps]
  }
  
  @scala.inline
  implicit class WidgetComponentPropsOps[Self <: WidgetComponentProps] (val x: Self) extends AnyVal {
    
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
    def setWidget(value: Widget): Self = this.set("widget", value.asInstanceOf[js.Any])
  }
}
