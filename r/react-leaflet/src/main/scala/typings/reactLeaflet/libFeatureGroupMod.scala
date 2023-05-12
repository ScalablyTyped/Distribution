package typings.reactLeaflet

import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.PathOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactLeaflet.libLayerGroupMod.LayerGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFeatureGroupMod {
  
  @JSImport("react-leaflet/lib/FeatureGroup", "FeatureGroup")
  @js.native
  val FeatureGroup: ForwardRefExoticComponent[FeatureGroupProps & RefAttributes[FeatureGroup_[Any]]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.reactLeafletCore.libEventsMod.EventedProps because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, eventHandlers, pane. Inlined 
  - typings.reactLeafletCore.libLayerMod.InteractiveLayerProps because var conflicts: attribution, eventHandlers, pane. Inlined bubblingMouseEvents, interactive
  - typings.reactLeafletCore.libPathMod.PathProps because var conflicts: attribution, eventHandlers, pane. Inlined pathOptions */ trait FeatureGroupProps
    extends StObject
       with LayerGroupProps {
    
    var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
    
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var pathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object FeatureGroupProps {
    
    inline def apply(): FeatureGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeatureGroupProps] (val x: Self) extends AnyVal {
      
      inline def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
      
      inline def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
      
      inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
    }
  }
}
