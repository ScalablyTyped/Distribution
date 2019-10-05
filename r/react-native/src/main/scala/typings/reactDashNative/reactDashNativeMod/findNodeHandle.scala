package typings.reactDashNative.reactDashNativeMod

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "findNodeHandle")
@js.native
object findNodeHandle extends js.Object {
  def apply(): Null | Double = js.native
  def apply(componentOrHandle: Double): Null | Double = js.native
  def apply(componentOrHandle: Component[_, _, _]): Null | Double = js.native
  def apply(componentOrHandle: ComponentClass[_, ComponentState]): Null | Double = js.native
}

