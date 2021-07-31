package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Polyline", JSImport.Default)
  @js.native
  class default ()
    extends Component[PolylineProps, js.Object, js.Any]
  
  type Polyline = Component[PolylineProps, js.Object, js.Any]
  
  trait PolylineProps
    extends StObject
       with PathProps {
    
    var points: String
  }
  object PolylineProps {
    
    @scala.inline
    def apply(points: String): PolylineProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolylineProps]
    }
    
    @scala.inline
    implicit class PolylinePropsMutableBuilder[Self <: PolylineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
}
