package typings.reactDashSketchapp

import typings.react.reactMod.Component
import typings.reactDashSketchapp.libComponentsSvgPropsMod.TextProps
import typings.reactDashSketchapp.libComponentsSvgTSpanMod.TSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/lib/components/Svg/TSpan", JSImport.Namespace)
@js.native
object libComponentsSvgTSpanMod extends js.Object {
  @js.native
  trait TSpan
    extends Component[TextProps, js.Object, js.Any] {
    def getChildContext(): Anon_IsInAParentText = js.native
  }
  
  @js.native
  class default () extends TSpan
  
}

