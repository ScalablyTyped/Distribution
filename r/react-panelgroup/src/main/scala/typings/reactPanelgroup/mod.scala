package typings.reactPanelgroup

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactPanelgroup.reactPanelgroupStrings.column
import typings.reactPanelgroup.reactPanelgroupStrings.dynamic
import typings.reactPanelgroup.reactPanelgroupStrings.fixed
import typings.reactPanelgroup.reactPanelgroupStrings.row
import typings.reactPanelgroup.reactPanelgroupStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-panelgroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PropTypes, js.Object, Any]
  
  type PanelGroup = Component[PropTypes, js.Object, Any]
  
  trait PanelWidth extends StObject {
    
    var minSize: js.UndefOr[Double] = js.undefined
    
    var resize: js.UndefOr[fixed | dynamic | stretch] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var snap: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PanelWidth {
    
    inline def apply(): PanelWidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelWidth]
    }
    
    extension [Self <: PanelWidth](x: Self) {
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setResize(value: fixed | dynamic | stretch): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSnap(value: js.Array[Double]): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setSnapVarargs(value: Double*): Self = StObject.set(x, "snap", js.Array(value*))
    }
  }
  
  trait PropTypes extends StObject {
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var direction: js.UndefOr[row | column] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* data */ PanelWidth, Unit]] = js.undefined
    
    var panelColor: js.UndefOr[String] = js.undefined
    
    var panelWidths: js.UndefOr[js.Array[PanelWidth | Null]] = js.undefined
    
    var spacing: js.UndefOr[Double] = js.undefined
  }
  object PropTypes {
    
    inline def apply(): PropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropTypes]
    }
    
    extension [Self <: PropTypes](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: row | column): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOnUpdate(value: /* data */ PanelWidth => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPanelColor(value: String): Self = StObject.set(x, "panelColor", value.asInstanceOf[js.Any])
      
      inline def setPanelColorUndefined: Self = StObject.set(x, "panelColor", js.undefined)
      
      inline def setPanelWidths(value: js.Array[PanelWidth | Null]): Self = StObject.set(x, "panelWidths", value.asInstanceOf[js.Any])
      
      inline def setPanelWidthsUndefined: Self = StObject.set(x, "panelWidths", js.undefined)
      
      inline def setPanelWidthsVarargs(value: (PanelWidth | Null)*): Self = StObject.set(x, "panelWidths", js.Array(value*))
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
