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
  
  inline def apply(text: String): SubheaderProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubheaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubheaderProps] (val x: Self) extends AnyVal {
    
    inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setStyle(value: Text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
