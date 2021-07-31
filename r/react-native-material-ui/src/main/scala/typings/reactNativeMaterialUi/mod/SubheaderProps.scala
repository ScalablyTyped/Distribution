package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubheaderProps extends StObject {
  
  var inset: js.UndefOr[Boolean] = js.undefined
  
  var lines: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[Text] = js.undefined
  
  var text: String
}
object SubheaderProps {
  
  @scala.inline
  def apply(text: String): SubheaderProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubheaderProps]
  }
  
  @scala.inline
  implicit class SubheaderPropsMutableBuilder[Self <: SubheaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setStyle(value: Text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
