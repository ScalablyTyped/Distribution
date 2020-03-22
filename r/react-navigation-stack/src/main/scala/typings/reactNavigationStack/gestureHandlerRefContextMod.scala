package typings.reactNavigationStack

import typings.react.mod.Context
import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/GestureHandlerRefContext", JSImport.Namespace)
@js.native
object gestureHandlerRefContextMod extends js.Object {
  val default: Context[
    js.UndefOr[
      (js.Function1[/* instance */ PanGestureHandler | Null, Unit]) | RefObject[PanGestureHandler] | Null
    ]
  ] = js.native
}

