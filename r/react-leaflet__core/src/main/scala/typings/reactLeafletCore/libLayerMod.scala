package typings.reactLeafletCore

import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerOptions
import typings.reactLeafletCore.libContextMod.LeafletContextInterface
import typings.reactLeafletCore.libElementMod.ElementHook
import typings.reactLeafletCore.libElementMod.LeafletElement
import typings.reactLeafletCore.libEventsMod.EventedProps
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayerMod {
  
  @JSImport("@react-leaflet/core/lib/layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLayerHook[E /* <: Layer */, P /* <: LayerProps */](useElement: ElementHook[E, P]): js.Function1[/* props */ P, ReturnType[ElementHook[E, P]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLayerHook")(useElement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ P, ReturnType[ElementHook[E, P]]]]
  
  inline def useLayerLifecycle(element: LeafletElement[Layer, Any], context: LeafletContextInterface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayerLifecycle")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.leaflet.mod.InteractiveLayerOptions because var conflicts: attribution, pane. Inlined bubblingMouseEvents, interactive */ trait InteractiveLayerProps
    extends StObject
       with LayerProps {
    
    var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
    
    var interactive: js.UndefOr[Boolean] = js.undefined
  }
  object InteractiveLayerProps {
    
    inline def apply(): InteractiveLayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractiveLayerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractiveLayerProps] (val x: Self) extends AnyVal {
      
      inline def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
      
      inline def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    }
  }
  
  trait LayerProps
    extends StObject
       with EventedProps
       with LayerOptions
  object LayerProps {
    
    inline def apply(): LayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerProps]
    }
  }
}
