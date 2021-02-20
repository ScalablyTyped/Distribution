package typings.reactLeaflet.mod

import typings.leaflet.mod.Control_.LayersOptions
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapControlProps because var conflicts: position. Inlined leaflet */ @js.native
trait LayersControlProps
  extends LayersOptions
     with LayersControlEvents {
  
  var children: Children = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
}
object LayersControlProps {
  
  @scala.inline
  def apply(): LayersControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersControlProps]
  }
  
  @scala.inline
  implicit class LayersControlPropsMutableBuilder[Self <: LayersControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
  }
}
