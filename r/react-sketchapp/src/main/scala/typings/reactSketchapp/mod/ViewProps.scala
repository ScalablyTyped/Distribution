package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import typings.reactSketchapp.typesMod.ResizeConstraints
import typings.reactSketchapp.typesMod.SketchShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var resizingConstraint: js.UndefOr[ResizeConstraints] = js.undefined
  
  var shadows: js.UndefOr[js.Array[SketchShadow]] = js.undefined
  
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}
object ViewProps {
  
  inline def apply(): ViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProps]
  }
  
  extension [Self <: ViewProps](x: Self) {
    
    inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResizingConstraint(value: ResizeConstraints): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraintUndefined: Self = StObject.set(x, "resizingConstraint", js.undefined)
    
    inline def setShadows(value: js.Array[SketchShadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShadowsVarargs(value: SketchShadow*): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    inline def setStyle(value: Style | StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
