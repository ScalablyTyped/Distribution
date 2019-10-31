package typings.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaMod

import typings.react.reactMod.ComponentType
import typings.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaStrings.margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_margin extends js.Object {
  def apply[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: margin,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
}

