package typings.reactSelect

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactSelect.srcAsyncMod.AsyncComponentProps
import typings.reactSelect.srcAsyncMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  
  val defaultProps: Props[js.Any] = js.native
  
  def makeAsyncSelect[T /* <: ComponentType[_] */](SelectComponent: T): ComponentClass[AsyncComponentProps[T], ComponentState] = js.native
  
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactSelect.srcAsyncMod.Async[OptionType]
  /* static members */
  @js.native
  object Async extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactSelect.srcAsyncMod.default[OptionType]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
}
