package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcCreatableMod.Props
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/creatable", JSImport.Namespace)
@js.native
object creatableMod extends js.Object {
  @js.native
  class Creatable[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactDashSelect.srcCreatableMod.Creatable[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactDashSelect.srcCreatableMod.default[OptionType]
  
  val defaultProps: Props[js.Any] = js.native
  def makeCreatableSelect(SelectComponent: ComponentType[_]): typings.reactDashSelect.srcCreatableMod.Creatable[_] = js.native
  /* static members */
  @js.native
  object Creatable extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

