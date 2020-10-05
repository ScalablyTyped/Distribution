package typings.reactNative.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "findNodeHandle")
@js.native
object findNodeHandle extends js.Object {
  def apply(): Null | Double = js.native
  def apply(componentOrHandle: Double): Null | Double = js.native
  def apply(componentOrHandle: Component[_, _, _]): Null | Double = js.native
  def apply(componentOrHandle: ComponentClass[_, ComponentState]): Null | Double = js.native
}

