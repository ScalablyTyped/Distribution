package typings.reactLeaflet.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.ControlOptions because Already inherited
- typings.leaflet.mod.Control_.LayersOptions because var conflicts: position. Inlined hideSingleBase, autoZIndex, collapsed */ trait LayersControlProps
  extends StObject
     with MapControlProps
     with LayersControlEvents {
  
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  
  var children: Children
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var hideSingleBase: js.UndefOr[Boolean] = js.undefined
}
object LayersControlProps {
  
  inline def apply(): LayersControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersControlProps]
  }
  
  extension [Self <: LayersControlProps](x: Self) {
    
    inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
    
    inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setHideSingleBase(value: Boolean): Self = StObject.set(x, "hideSingleBase", value.asInstanceOf[js.Any])
    
    inline def setHideSingleBaseUndefined: Self = StObject.set(x, "hideSingleBase", js.undefined)
  }
}
