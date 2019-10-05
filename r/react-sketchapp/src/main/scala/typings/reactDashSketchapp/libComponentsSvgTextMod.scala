package typings.reactDashSketchapp

import typings.react.reactMod.Component
import typings.reactDashSketchapp.libComponentsSvgPropsMod.TextProps
import typings.reactDashSketchapp.libComponentsSvgTextMod.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/lib/components/Svg/Text", JSImport.Namespace)
@js.native
object libComponentsSvgTextMod extends js.Object {
  @js.native
  trait Text
    extends Component[TextProps, js.Object, js.Any] {
    def getChildContext(): Anon_IsInAParentText = js.native
  }
  
  @js.native
  class default () extends Text
  
}

