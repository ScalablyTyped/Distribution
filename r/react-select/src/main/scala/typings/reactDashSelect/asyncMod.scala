package typings.reactDashSelect

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAsyncMod.AsyncComponentProps
import typings.reactDashSelect.srcAsyncMod.Props
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactDashSelect.srcAsyncMod.Async[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactDashSelect.srcAsyncMod.default[OptionType]
  
  val defaultProps: Props[js.Any] = js.native
  def makeAsyncSelect[T /* <: ComponentType[_] */](SelectComponent: T): ComponentClass[AsyncComponentProps[T], ComponentState] = js.native
  /* static members */
  @js.native
  object Async extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

