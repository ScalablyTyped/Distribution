package typings.reactDashCircularDashProgressbar

import typings.react.reactMod.Component
import typings.reactDashCircularDashProgressbar.distTypesMod.CircularProgressbarDefaultProps
import typings.reactDashCircularDashProgressbar.distTypesMod.CircularProgressbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Namespace)
@js.native
object distCircularProgressbarMod extends js.Object {
  @js.native
  trait CircularProgressbar
    extends Component[CircularProgressbarProps, js.Object, js.Any] {
    def getBackgroundPadding(): Double = js.native
    def getPathRadius(): Double = js.native
    def getPathRatio(): Double = js.native
  }
  
  @js.native
  class default () extends CircularProgressbar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
  
}

