package typings.reactNativeSafeAreaContext.safeAreaContextMod

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "withSafeAreaInsets")
@js.native
object withSafeAreaInsets extends js.Object {
  def apply[T](WrappedComponent: ComponentType[T]): ForwardRefExoticComponent[PropsWithoutRef[T] with RefAttributes[T]] = js.native
}

