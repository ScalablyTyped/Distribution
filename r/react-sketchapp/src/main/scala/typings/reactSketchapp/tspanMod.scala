package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.anon.IsInAParentText
import typings.reactSketchapp.propsMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tspanMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/TSpan", JSImport.Default)
  @js.native
  class default () extends TSpan
  
  @js.native
  trait TSpan
    extends Component[TextProps, js.Object, js.Any] {
    
    def getChildContext(): IsInAParentText = js.native
  }
}
