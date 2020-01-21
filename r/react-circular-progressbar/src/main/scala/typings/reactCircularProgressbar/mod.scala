package typings.reactCircularProgressbar

import typings.react.mod._Global_.JSX.Element
import typings.reactCircularProgressbar.circularProgressbarMod.default
import typings.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-circular-progressbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CircularProgressbar () extends default
  
  def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): Element = js.native
  def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: AnonBackgroundColor
  ): CircularProgressbarStyles = js.native
  /* static members */
  @js.native
  object CircularProgressbar extends js.Object {
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
  
}

