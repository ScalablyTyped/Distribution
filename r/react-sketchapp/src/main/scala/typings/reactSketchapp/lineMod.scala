package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Line", JSImport.Default)
  @js.native
  class default ()
    extends Component[LineProps, js.Object, js.Any]
  
  type Line = Component[LineProps, js.Object, js.Any]
  
  trait LineProps
    extends StObject
       with PathProps {
    
    var x1: NumberProp
    
    var x2: NumberProp
    
    var y1: NumberProp
    
    var y2: NumberProp
  }
  object LineProps {
    
    @scala.inline
    def apply(x1: NumberProp, x2: NumberProp, y1: NumberProp, y2: NumberProp): LineProps = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    @scala.inline
    implicit class LinePropsMutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
