package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.srcCreatableMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/creatable", JSImport.Namespace)
@js.native
object creatableMod extends js.Object {
  
  val defaultProps: Props[js.Any] = js.native
  
  def makeCreatableSelect(SelectComponent: ComponentType[_]): typings.reactSelect.srcCreatableMod.Creatable[_] = js.native
  
  @js.native
  class Creatable[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactSelect.srcCreatableMod.Creatable[OptionType]
  /* static members */
  @js.native
  object Creatable extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactSelect.srcCreatableMod.default[OptionType]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
}
