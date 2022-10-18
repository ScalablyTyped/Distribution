package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverMod {
  
  @JSImport("react-bootstrap/lib/Popover", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PopoverProps, js.Object, Any]
  
  type Popover = Component[PopoverProps, js.Object, Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>[P]} */ trait PopoverProps extends StObject {
    
    // Optional
    var arrowOffsetLeft: js.UndefOr[Double | String] = js.undefined
    
    var arrowOffsetTop: js.UndefOr[Double | String] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var positionLeft: js.UndefOr[Double | String] = js.undefined
    
    // String support added since v0.30.0
    var positionTop: js.UndefOr[Double | String] = js.undefined
    
    // String support added since v0.30.0
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setArrowOffsetLeft(value: Double | String): Self = StObject.set(x, "arrowOffsetLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowOffsetLeftUndefined: Self = StObject.set(x, "arrowOffsetLeft", js.undefined)
      
      inline def setArrowOffsetTop(value: Double | String): Self = StObject.set(x, "arrowOffsetTop", value.asInstanceOf[js.Any])
      
      inline def setArrowOffsetTopUndefined: Self = StObject.set(x, "arrowOffsetTop", js.undefined)
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPositionLeft(value: Double | String): Self = StObject.set(x, "positionLeft", value.asInstanceOf[js.Any])
      
      inline def setPositionLeftUndefined: Self = StObject.set(x, "positionLeft", js.undefined)
      
      inline def setPositionTop(value: Double | String): Self = StObject.set(x, "positionTop", value.asInstanceOf[js.Any])
      
      inline def setPositionTopUndefined: Self = StObject.set(x, "positionTop", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
