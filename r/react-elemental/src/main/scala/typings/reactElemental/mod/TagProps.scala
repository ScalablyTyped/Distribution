package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagProps extends StObject {
  
  val backgroundColor: js.UndefOr[String] = js.undefined
  
  val dismissible: js.UndefOr[Boolean] = js.undefined
  
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val outlineColor: js.UndefOr[String] = js.undefined
  
  val size: js.UndefOr[TagSize] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val text: String
}
object TagProps {
  
  @scala.inline
  def apply(text: String): TagProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
  
  @scala.inline
  implicit class TagPropsMutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setSize(value: TagSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
