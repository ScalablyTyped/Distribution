package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertProps extends StObject {
  
  val dismissible: js.UndefOr[Boolean] = js.undefined
  
  val message: String | ReactElement
  
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val size: js.UndefOr[AlertSize] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val title: String
  
  val `type`: js.UndefOr[AlertType] = js.undefined
}
object AlertProps {
  
  @scala.inline
  def apply(message: String | ReactElement, title: String): AlertProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
  
  @scala.inline
  implicit class AlertPropsMutableBuilder[Self <: AlertProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
    
    @scala.inline
    def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setSize(value: AlertSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
