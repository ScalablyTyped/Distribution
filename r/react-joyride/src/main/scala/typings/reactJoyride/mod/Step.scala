package typings.reactJoyride.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step
  extends StObject
     with CommonProps {
  
  var content: ReactNode
  
  var disableBeacon: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
  
  var hideCloseButton: js.UndefOr[Boolean] = js.undefined
  
  var hideFooter: js.UndefOr[Boolean] = js.undefined
  
  var isFixed: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var placementBeacon: js.UndefOr[PlacementBeacon] = js.undefined
  
  var target: String | HTMLElement
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object Step {
  
  inline def apply(target: String | HTMLElement): Step = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisableBeacon(value: Boolean): Self = StObject.set(x, "disableBeacon", value.asInstanceOf[js.Any])
    
    inline def setDisableBeaconUndefined: Self = StObject.set(x, "disableBeacon", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHideCloseButton(value: Boolean): Self = StObject.set(x, "hideCloseButton", value.asInstanceOf[js.Any])
    
    inline def setHideCloseButtonUndefined: Self = StObject.set(x, "hideCloseButton", js.undefined)
    
    inline def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
    
    inline def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementBeacon(value: PlacementBeacon): Self = StObject.set(x, "placementBeacon", value.asInstanceOf[js.Any])
    
    inline def setPlacementBeaconUndefined: Self = StObject.set(x, "placementBeacon", js.undefined)
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
