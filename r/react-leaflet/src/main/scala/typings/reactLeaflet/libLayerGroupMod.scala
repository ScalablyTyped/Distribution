package typings.reactLeaflet

import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.LayerOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayerGroupMod {
  
  @JSImport("react-leaflet/lib/LayerGroup", "LayerGroup")
  @js.native
  val LayerGroup: ForwardRefExoticComponent[LayerGroupProps & RefAttributes[LayerGroup_[Any]]] = js.native
  
  trait LayerGroupProps
    extends StObject
       with LayerOptions
       with EventedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object LayerGroupProps {
    
    inline def apply(): LayerGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayerGroupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
