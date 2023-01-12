package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.bottom
import typings.reactOnsenui.reactOnsenuiStrings.center
import typings.reactOnsenui.reactOnsenuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalAlign extends StObject {
  
  var verticalAlign: js.UndefOr[top | bottom | center] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object VerticalAlign {
  
  inline def apply(): VerticalAlign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerticalAlign] (val x: Self) extends AnyVal {
    
    inline def setVerticalAlign(value: top | bottom | center): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
