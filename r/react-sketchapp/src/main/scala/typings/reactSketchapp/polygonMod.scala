package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Polygon", JSImport.Default)
  @js.native
  class default ()
    extends Component[PolygonProps, js.Object, js.Any]
  
  type Polygon = Component[PolygonProps, js.Object, js.Any]
  
  trait PolygonProps
    extends StObject
       with PathProps {
    
    var points: String
  }
  object PolygonProps {
    
    inline def apply(points: String): PolygonProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolygonProps]
    }
    
    extension [Self <: PolygonProps](x: Self) {
      
      inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
}
