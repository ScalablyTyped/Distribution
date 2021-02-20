package typings.reactCircularProgressbar

import typings.react.mod.global.JSX.Element
import typings.reactCircularProgressbar.anon.BackgroundColor
import typings.reactCircularProgressbar.circularProgressbarMod.default
import typings.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-circular-progressbar", "CircularProgressbar")
  @js.native
  class CircularProgressbar () extends default
  object CircularProgressbar {
    
    @JSImport("react-circular-progressbar", "CircularProgressbar")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-circular-progressbar", "CircularProgressbar.defaultProps")
    @js.native
    def defaultProps: CircularProgressbarDefaultProps = js.native
    @scala.inline
    def defaultProps_=(x: CircularProgressbarDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-circular-progressbar", "CircularProgressbarWithChildren")
  @js.native
  def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): Element = js.native
  
  @JSImport("react-circular-progressbar", "buildStyles")
  @js.native
  def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: BackgroundColor
  ): CircularProgressbarStyles = js.native
}
