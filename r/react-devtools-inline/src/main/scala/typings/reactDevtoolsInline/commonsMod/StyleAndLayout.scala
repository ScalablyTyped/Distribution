package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleAndLayout extends StObject {
  
  var id: Double
  
  var layout: Layout | Null
  
  var style: js.Object | Null
}
object StyleAndLayout {
  
  inline def apply(id: Double): StyleAndLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], layout = null, style = null)
    __obj.asInstanceOf[StyleAndLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleAndLayout] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutNull: Self = StObject.set(x, "layout", null)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
  }
}
