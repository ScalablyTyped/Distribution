package typings.reactDashSelect.asyncMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAsyncMod.AsyncComponentProps
import typings.reactDashSelect.srcAsyncMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val defaultProps: Props[js.Any] = js.native
  def makeAsyncSelect[T /* <: ComponentType[_] */](SelectComponent: T): ComponentClass[AsyncComponentProps[T], ComponentState] = js.native
}

