package typings.reactJoyride.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends CommonProps {
  
  var content: ReactNode = js.native
  
  var disableBeacon: js.UndefOr[Boolean] = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var hideCloseButton: js.UndefOr[Boolean] = js.native
  
  var hideFooter: js.UndefOr[Boolean] = js.native
  
  var isFixed: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var placementBeacon: js.UndefOr[PlacementBeacon] = js.native
  
  var target: String | HTMLElement = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
}
object Step {
  
  @scala.inline
  def apply(target: String | HTMLElement): Step = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDisableBeacon(value: Boolean): Self = StObject.set(x, "disableBeacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBeaconUndefined: Self = StObject.set(x, "disableBeacon", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setHideCloseButton(value: Boolean): Self = StObject.set(x, "hideCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideCloseButtonUndefined: Self = StObject.set(x, "hideCloseButton", js.undefined)
    
    @scala.inline
    def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementBeacon(value: PlacementBeacon): Self = StObject.set(x, "placementBeacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementBeaconUndefined: Self = StObject.set(x, "placementBeacon", js.undefined)
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
