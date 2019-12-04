package typings.reactDashSelect.srcAsyncMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Async", "makeAsyncSelect")
@js.native
object makeAsyncSelect extends js.Object {
  def apply[T /* <: ComponentType[_] */](SelectComponent: T): ComponentClass[AsyncComponentProps[T], ComponentState] = js.native
}

