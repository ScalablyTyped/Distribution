package typings.reactSelect.srcAsyncMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Async", "makeAsyncSelect")
@js.native
object makeAsyncSelect extends js.Object {
  def apply[T /* <: ComponentType[_] */](SelectComponent: T): ComponentClass[AsyncComponentProps[T], ComponentState] = js.native
}

