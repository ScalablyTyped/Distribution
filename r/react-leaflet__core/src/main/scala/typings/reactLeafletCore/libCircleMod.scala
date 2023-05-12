package typings.reactLeafletCore

import typings.leaflet.mod.CircleMarkerOptions
import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.CircleOptions
import typings.leaflet.mod.Circle_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.PathOptions
import typings.react.mod.ReactNode
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCircleMod {
  
  @JSImport("@react-leaflet/core/lib/circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateCircle(layer: CircleMarker_[CircleMarkerProps], props: CircleMarkerProps, prevProps: CircleMarkerProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCircle(layer: CircleMarker_[CircleProps], props: CircleProps, prevProps: CircleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCircle(layer: Circle_[CircleMarkerProps], props: CircleMarkerProps, prevProps: CircleMarkerProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCircle(layer: Circle_[CircleProps], props: CircleProps, prevProps: CircleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.leaflet.mod.InteractiveLayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, pane. Inlined 
  - typings.reactLeafletCore.libLayerMod.InteractiveLayerProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined 
  - typings.reactLeafletCore.libPathMod.PathProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined pathOptions */ trait CircleMarkerProps
    extends StObject
       with CircleMarkerOptions
       with EventedProps {
    
    var center: LatLngExpression
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var pathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object CircleMarkerProps {
    
    inline def apply(center: LatLngExpression): CircleMarkerProps = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleMarkerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircleMarkerProps] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: LatLngExpression): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
      
      inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.leaflet.mod.InteractiveLayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, pane. Inlined 
  - typings.reactLeafletCore.libLayerMod.InteractiveLayerProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined 
  - typings.reactLeafletCore.libPathMod.PathProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined pathOptions */ trait CircleProps
    extends StObject
       with CircleOptions
       with EventedProps {
    
    var center: LatLngExpression
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var pathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object CircleProps {
    
    inline def apply(center: LatLngExpression): CircleProps = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: LatLngExpression): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
      
      inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
    }
  }
}
