package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTooltipMod {
  
  @JSImport("react-bootstrap/lib/Tooltip", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[TooltipProps, js.Object, Any]
  
  type Tooltip = Component[TooltipProps, js.Object, Any]
  
  trait TooltipProps
    extends StObject
       with HTMLProps[Tooltip] {
    
    // Optional
    var arrowOffsetLeft: js.UndefOr[Double | String] = js.undefined
    
    var arrowOffsetTop: js.UndefOr[Double | String] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var positionLeft: js.UndefOr[Double] = js.undefined
    
    var positionTop: js.UndefOr[Double] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
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
      
      inline def setPositionLeft(value: Double): Self = StObject.set(x, "positionLeft", value.asInstanceOf[js.Any])
      
      inline def setPositionLeftUndefined: Self = StObject.set(x, "positionLeft", js.undefined)
      
      inline def setPositionTop(value: Double): Self = StObject.set(x, "positionTop", value.asInstanceOf[js.Any])
      
      inline def setPositionTopUndefined: Self = StObject.set(x, "positionTop", js.undefined)
    }
  }
}
