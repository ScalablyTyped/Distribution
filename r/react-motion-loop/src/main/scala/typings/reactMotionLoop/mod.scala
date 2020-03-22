package typings.reactMotionLoop

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.Element
import typings.reactMotion.mod.PlainStyle
import typings.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-motion-loop", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ReactMotionLoop ()
    extends Component[ReactMotionLoopProps, js.Object, js.Any]
  
  /* Inlined parent std.Partial<react-motion.react-motion.MotionProps> */
  @js.native
  trait ReactMotionLoopProps extends js.Object {
    var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, Element | ReactElement]] = js.native
    var defaultStyle: js.UndefOr[PlainStyle] = js.native
    var onRest: js.UndefOr[js.Function0[Unit]] = js.native
    var style: js.UndefOr[Style] = js.native
    var styleFrom: Style = js.native
    var styleTo: Style = js.native
  }
  
}

