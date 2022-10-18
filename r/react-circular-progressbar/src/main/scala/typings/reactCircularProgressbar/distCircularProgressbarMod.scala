package typings.reactCircularProgressbar

import typings.react.mod.Component
import typings.reactCircularProgressbar.distTypesMod.CircularProgressbarDefaultProps
import typings.reactCircularProgressbar.distTypesMod.CircularProgressbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCircularProgressbarMod {
  
  @JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Default)
  @js.native
  open class default () extends CircularProgressbar
  object default {
    
    @JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-circular-progressbar/dist/CircularProgressbar", "default.defaultProps")
    @js.native
    def defaultProps: CircularProgressbarDefaultProps = js.native
    inline def defaultProps_=(x: CircularProgressbarDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CircularProgressbar
    extends Component[CircularProgressbarProps, js.Object, Any] {
    
    def getBackgroundPadding(): Double = js.native
    
    def getPathRadius(): Double = js.native
    
    def getPathRatio(): Double = js.native
  }
}
