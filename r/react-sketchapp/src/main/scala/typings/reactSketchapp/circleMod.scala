package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Circle", JSImport.Default)
  @js.native
  class default ()
    extends Component[CircleProps, js.Object, js.Any]
  
  type Circle = Component[CircleProps, js.Object, js.Any]
  
  trait CircleProps
    extends StObject
       with PathProps {
    
    var cx: NumberProp
    
    var cy: NumberProp
    
    var r: NumberProp
  }
  object CircleProps {
    
    @scala.inline
    def apply(cx: NumberProp, cy: NumberProp, r: NumberProp): CircleProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps]
    }
    
    @scala.inline
    implicit class CirclePropsMutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: NumberProp): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
