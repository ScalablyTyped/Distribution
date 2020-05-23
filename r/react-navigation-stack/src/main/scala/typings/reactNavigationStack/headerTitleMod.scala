package typings.reactNavigationStack

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod.Text
import typings.reactNavigationStack.anon.Children
import typings.reactNavigationStack.reactNavigationStackStrings.key
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderTitle", JSImport.Namespace)
@js.native
object headerTitleMod extends js.Object {
  def default(hasTintColorStyleRest: Props): Element = js.native
  type Props = (Omit[ComponentProps[AnimatedComponent[Instantiable0[Text]]], key]) with Children
}

