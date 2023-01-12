package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenStyle extends StObject {
  
  var children: Any
  
  var style: js.UndefOr[typings.reactSketchapp.libStylesheetTypesMod.Style] = js.undefined
}
object ChildrenStyle {
  
  inline def apply(children: Any): ChildrenStyle = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenStyle] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: typings.reactSketchapp.libStylesheetTypesMod.Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
