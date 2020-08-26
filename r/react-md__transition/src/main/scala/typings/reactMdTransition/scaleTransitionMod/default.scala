package typings.reactMdTransition.scaleTransitionMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/transition/types/ScaleTransition", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This `ScaleTransition` component is used to trigger an animation that
    * switches between an opacity of `0` and `1` and using a `transform: scale(0)`
    * to `transform: scale(1)`. It is recommended to also manually apply a
    * `transform-origin` style or use the `useFixedPositioning` hook to generate
    * for you so that the animation starts from a specific point.
    *
    * Since the default scale animation is X and Y, you can enable the `vertical`
    * prop which will update the transition to use `transform: scaleY(0)` to
    * `transform: scaleY(1)` instead.
    */
  def apply(
    hasVisibleChildrenClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps: ScaleTransitionProps
  ): ReactElement = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Any = js.native
    var classNames: js.Any = js.native
    var mountOnEnter: js.Any = js.native
    var portal: js.Any = js.native
    var portalInto: js.Any = js.native
    var portalIntoId: js.Any = js.native
    var timeout: js.Any = js.native
    var unmountOnExit: js.Any = js.native
    var vertical: js.Any = js.native
    var visible: js.Any = js.native
  }
  
}

