package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.ControlOptions because Already inherited
- typings.leaflet.mod.Control_.LayersOptions because var conflicts: position. Inlined hideSingleBase, collapsed, sortLayers, sortFunction, autoZIndex */ trait LayersControlProps
  extends StObject
     with MapControlProps
     with LayersControlEvents {
  
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  
  var children: Children
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var hideSingleBase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A [compare function](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/sort)
    * that will be used for sorting the layers, when `sortLayers` is `true`. The function receives both the
    * [`L.Layer`](https://leafletjs.com/reference.html#layer) instances and their names, as in
    * `sortFunction(layerA, layerB, nameA, nameB)`. By default, it sorts layers alphabetically by their name.
    */
  var sortFunction: js.UndefOr[
    js.Function4[/* layerA */ Layer, /* layerB */ Layer, /* nameA */ String, /* nameB */ String, Double]
  ] = js.undefined
  
  /**
    * Whether to sort the layers. When `false`, layers will keep the order in which they were added to the control.
    */
  var sortLayers: js.UndefOr[Boolean] = js.undefined
}
object LayersControlProps {
  
  inline def apply(): LayersControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersControlProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayersControlProps] (val x: Self) extends AnyVal {
    
    inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
    
    inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setHideSingleBase(value: Boolean): Self = StObject.set(x, "hideSingleBase", value.asInstanceOf[js.Any])
    
    inline def setHideSingleBaseUndefined: Self = StObject.set(x, "hideSingleBase", js.undefined)
    
    inline def setSortFunction(value: (/* layerA */ Layer, /* layerB */ Layer, /* nameA */ String, /* nameB */ String) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction4(value))
    
    inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
    
    inline def setSortLayers(value: Boolean): Self = StObject.set(x, "sortLayers", value.asInstanceOf[js.Any])
    
    inline def setSortLayersUndefined: Self = StObject.set(x, "sortLayers", js.undefined)
  }
}
