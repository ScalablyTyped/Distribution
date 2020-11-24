package typings.reactCircularProgressbar

import typings.react.mod.global.JSX.Element
import typings.reactCircularProgressbar.anon.BackgroundColor
import typings.reactCircularProgressbar.circularProgressbarMod.default
import typings.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-circular-progressbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): Element = js.native
  
  def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: BackgroundColor
  ): CircularProgressbarStyles = js.native
  
  @js.native
  class CircularProgressbar () extends default
  /* static members */
  @js.native
  object CircularProgressbar extends js.Object {
    
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
}
