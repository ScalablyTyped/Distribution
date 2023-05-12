package typings.reactLeaflet

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.PathOptions
import typings.leaflet.mod.Rectangle_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRectangleMod {
  
  @JSImport("react-leaflet/lib/Rectangle", "Rectangle")
  @js.native
  val Rectangle: ForwardRefExoticComponent[RectangleProps & RefAttributes[Rectangle_[Any]]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, pane. Inlined 
  - typings.reactLeafletCore.libLayerMod.InteractiveLayerProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined 
  - typings.reactLeafletCore.libPathMod.PathProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined pathOptions */ trait RectangleProps
    extends StObject
       with PathOptions
       with EventedProps {
    
    var bounds: LatLngBoundsExpression
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var pathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object RectangleProps {
    
    inline def apply(bounds: LatLngBoundsExpression): RectangleProps = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectangleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectangleProps] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
      
      inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
    }
  }
}
