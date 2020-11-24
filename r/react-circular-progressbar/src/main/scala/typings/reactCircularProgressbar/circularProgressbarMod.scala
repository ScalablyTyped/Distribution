package typings.reactCircularProgressbar

import typings.react.mod.Component
import typings.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Namespace)
@js.native
object circularProgressbarMod extends js.Object {
  
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
