package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.FontProps
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/G", JSImport.Default)
  @js.native
  class default ()
    extends Component[GProps, js.Object, js.Any]
  
  type G = Component[GProps, js.Object, js.Any]
  
  trait GProps
    extends StObject
       with PathProps
       with FontProps
  object GProps {
    
    @scala.inline
    def apply(): GProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GProps]
    }
  }
}
