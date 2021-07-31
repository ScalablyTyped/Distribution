package typings.scrivito.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * scrivito top-level definitions
  */
trait WidgetComponentProps
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var widget: Widget
}
object WidgetComponentProps {
  
  @scala.inline
  def apply(widget: Widget): WidgetComponentProps = {
    val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetComponentProps]
  }
  
  @scala.inline
  implicit class WidgetComponentPropsMutableBuilder[Self <: WidgetComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
  }
}
