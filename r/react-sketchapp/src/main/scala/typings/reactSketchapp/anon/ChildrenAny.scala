package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenAny extends StObject {
  
  var children: Any
  
  var style: js.UndefOr[typings.reactSketchapp.stylesheetTypesMod.Style] = js.undefined
}
object ChildrenAny {
  
  inline def apply(children: Any): ChildrenAny = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenAny]
  }
  
  extension [Self <: ChildrenAny](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: typings.reactSketchapp.stylesheetTypesMod.Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
