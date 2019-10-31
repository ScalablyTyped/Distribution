package typings.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaMod

import typings.react.reactMod.ComponentType
import typings.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaStrings.absolutePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_absolutePosition extends js.Object {
  def apply[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: absolutePosition,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
}

