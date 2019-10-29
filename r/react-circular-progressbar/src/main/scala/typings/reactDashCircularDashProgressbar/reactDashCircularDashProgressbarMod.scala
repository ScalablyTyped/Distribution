package typings.reactDashCircularDashProgressbar

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashCircularDashProgressbar.distCircularProgressbarMod.default
import typings.reactDashCircularDashProgressbar.distCircularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typings.reactDashCircularDashProgressbar.distTypesMod.CircularProgressbarDefaultProps
import typings.reactDashCircularDashProgressbar.distTypesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-circular-progressbar", JSImport.Namespace)
@js.native
object reactDashCircularDashProgressbarMod extends js.Object {
  @js.native
  class CircularProgressbar () extends default
  
  def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): Element = js.native
  def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: Anon_BackgroundColor
  ): CircularProgressbarStyles = js.native
  /* static members */
  @js.native
  object CircularProgressbar extends js.Object {
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
  
}

