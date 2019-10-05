package typings.reactDashSelect

import typings.reactDashSelect.srcAsyncCreatableMod.Props
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/async-creatable", JSImport.Namespace)
@js.native
object asyncDashCreatableMod extends js.Object {
  @js.native
  class AsyncCreatable[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactDashSelect.srcAsyncCreatableMod.AsyncCreatable[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactDashSelect.srcAsyncCreatableMod.default[OptionType]
  
  /* static members */
  @js.native
  object AsyncCreatable extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

