package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Ellipse", JSImport.Default)
  @js.native
  class default ()
    extends Component[EllipseProps, js.Object, js.Any]
  
  type Ellipse = Component[EllipseProps, js.Object, js.Any]
  
  @js.native
  trait EllipseProps extends PathProps {
    
    var cx: NumberProp = js.native
    
    var cy: NumberProp = js.native
    
    var rx: NumberProp = js.native
    
    var ry: NumberProp = js.native
  }
  object EllipseProps {
    
    @scala.inline
    def apply(cx: NumberProp, cy: NumberProp, rx: NumberProp, ry: NumberProp): EllipseProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipseProps]
    }
    
    @scala.inline
    implicit class EllipsePropsMutableBuilder[Self <: EllipseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    }
  }
}
