package typings.reactNativeSafeArea.mod

import typings.react.mod.ComponentType
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_padding extends js.Object {
  
  def apply[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: padding,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
}
