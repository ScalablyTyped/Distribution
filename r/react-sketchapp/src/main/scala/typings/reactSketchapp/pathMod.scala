package typings.reactSketchapp

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Path", JSImport.Default)
  @js.native
  class default ()
    extends Component[PathProps, js.Object, js.Any]
  
  type Path = Component[PathProps, js.Object, js.Any]
  
  trait PathProps
    extends StObject
       with typings.reactSketchapp.propsMod.PathProps {
    
    var d: String
  }
  object PathProps {
    
    @scala.inline
    def apply(d: String): PathProps = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathProps]
    }
    
    @scala.inline
    implicit class PathPropsMutableBuilder[Self <: PathProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
}
