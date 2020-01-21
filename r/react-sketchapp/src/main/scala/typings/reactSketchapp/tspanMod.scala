package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/lib/components/Svg/TSpan", JSImport.Namespace)
@js.native
object tspanMod extends js.Object {
  @js.native
  trait TSpan
    extends Component[TextProps, js.Object, js.Any] {
    def getChildContext(): AnonIsInAParentText = js.native
  }
  
  @js.native
  class default () extends TSpan
  
}

