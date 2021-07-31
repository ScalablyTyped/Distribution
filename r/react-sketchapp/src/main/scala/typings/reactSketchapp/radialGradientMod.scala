package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typings.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radialGradientMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", JSImport.Default)
  @js.native
  class default ()
    extends Component[RadialGradientProps, js.Object, js.Any]
  
  type RadialGradient = Component[RadialGradientProps, js.Object, js.Any]
  
  trait RadialGradientProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var cx: NumberProp
    
    var cy: NumberProp
    
    var fx: NumberProp
    
    var fy: NumberProp
    
    var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.undefined
    
    var id: String
    
    var r: js.UndefOr[NumberProp] = js.undefined
    
    var rx: js.UndefOr[NumberProp] = js.undefined
    
    var ry: js.UndefOr[NumberProp] = js.undefined
  }
  object RadialGradientProps {
    
    @scala.inline
    def apply(cx: NumberProp, cy: NumberProp, fx: NumberProp, fy: NumberProp, id: String): RadialGradientProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadialGradientProps]
    }
    
    @scala.inline
    implicit class RadialGradientPropsMutableBuilder[Self <: RadialGradientProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFx(value: NumberProp): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFy(value: NumberProp): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUnits(value: objectBoundingBox | userSpaceOnUse): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: NumberProp): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
}
